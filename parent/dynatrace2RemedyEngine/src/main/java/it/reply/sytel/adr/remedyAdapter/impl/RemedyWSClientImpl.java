package it.reply.sytel.adr.remedyAdapter.impl;

import java.io.ByteArrayInputStream;
import java.io.InputStream;

import org.apache.commons.io.IOUtils;
import org.apache.log4j.Logger;
import org.w3c.dom.Node;
import org.xmlsoap.schemas.soap.envelope.Body;
import org.xmlsoap.schemas.soap.envelope.Envelope;
import org.xmlsoap.schemas.soap.envelope.EnvelopeDocument;
import org.xmlsoap.schemas.soap.envelope.Header;

import hpdIncidentInterfaceCreateWSVIP.AuthenticationInfo;
import hpdIncidentInterfaceCreateWSVIP.AuthenticationInfoDocument;
import hpdIncidentInterfaceCreateWSVIP.CreateInputMap;
import hpdIncidentInterfaceCreateWSVIP.HelpDeskSubmitServiceDocument;
import hpdIncidentInterfaceCreateWSVIP.HelpDeskSubmitServiceResponseDocument;
import hpdIncidentInterfaceCreateWSVIP.ImpactType;
import hpdIncidentInterfaceCreateWSVIP.ReportedSourceType;
import hpdIncidentInterfaceCreateWSVIP.ServiceTypeType;
import hpdIncidentInterfaceCreateWSVIP.StatusType;
import hpdIncidentInterfaceCreateWSVIP.UrgencyType;
import it.reply.sytel.adr.common.log.EtlLogger;
import it.reply.sytel.adr.common.ws.HTTPClient;
import it.reply.sytel.adr.remedyAdapter.RemedyClient;
import it.reply.sytel.adr.remedyAdapter.exc.RemedyWSClientException;
import it.reply.sytel.adr.vo.DynatraceIncident;
import it.reply.sytel.adr.vo.RemedyAutenticationInfo;

public class RemedyWSClientImpl implements RemedyClient{

	private HTTPClient sharedHTTPClient;
	private String encoding;
	private String userToken="";
	private String soapAction="";

	//private Logger log = EtlLogger.getLogger("ASSET_PROVISIONING_LOGGER_WS");
	
	private Logger log = EtlLogger.getLogger(getClass());

	
	private StatusType.Enum getStatusType(String statusStr) {
		
		if(statusStr.equals("NEW"))
			return StatusType.NEW;
		if(statusStr.equals("ASSIGNED"))
			return StatusType.ASSIGNED;
		if(statusStr.equals("CLOSED"))
			return StatusType.CLOSED;
		if(statusStr.equals("RESOLVED"))
			return StatusType.RESOLVED;
		if(statusStr.equals("PENDING"))
			return StatusType.PENDING;
		if(statusStr.equals("IN_PROGRESS"))
			return StatusType.IN_PROGRESS;
		if(statusStr.equals("CANCELLED"))
			return StatusType.CANCELLED;
		throw new RemedyWSClientException("Unknown Status:["+statusStr+"]");
	}
	
	@Override
	public String createIncident(DynatraceIncident dynatraceIncident,
			RemedyAutenticationInfo remedyAutenticationInfo,
			String firstName,
			String impact,
			String lastName,
			String reported_source,
			String serviceType, 
			String ticketStatus,
			String urgency) {
		
		AuthenticationInfoDocument authenticationInfoDocument = AuthenticationInfoDocument.Factory.newInstance();
		AuthenticationInfo authenticationInfo = authenticationInfoDocument.addNewAuthenticationInfo();
		authenticationInfo.setUserName(remedyAutenticationInfo.getUser());
		authenticationInfo.setPassword(remedyAutenticationInfo.getPwd());
		
		HelpDeskSubmitServiceDocument helpDeskSubmitServiceDocument = HelpDeskSubmitServiceDocument.Factory.newInstance();
		CreateInputMap createInputMap = helpDeskSubmitServiceDocument.addNewHelpDeskSubmitService();
		createInputMap.setFirstName(firstName);
		createInputMap.setLastName(lastName);
		createInputMap.setImpact(ImpactType.X_1_EXTENSIVE_WIDESPREAD);
		createInputMap.setReportedSource(ReportedSourceType.SYSTEMS_MANAGEMENT);
		createInputMap.setServiceType(ServiceTypeType.INFRASTRUCTURE_EVENT);
		//createInputMap.setStatus(getStatusType(ticketStatus));
		createInputMap.setStatus(StatusType.Enum.forString("NEW"));
		
		createInputMap.setSummary(".........SUMNMARY..........");
		createInputMap.setUrgency(UrgencyType.X_1_CRITICAL);
		
		//add optional attributes
//		createInputMap.setAssignedGroup(arg0);
//		createInputMap.setAssignedGroupShiftName(arg0);
//		createInputMap.setAssignedSupportCompany(arg0);
//		createInputMap.setAssignedSupportOrganization(arg0);
//		createInputMap.setAssignee(arg0);
//		createInputMap.setCategorizationTier1(arg0);
//		createInputMap.setCategorizationTier2(arg0);
//		createInputMap.setCategorizationTier3(arg0);
//		createInputMap.setCIName(arg0);
//		createInputMap.setClasse(arg0);
//		createInputMap.setClassificazione(arg0);
//		createInputMap.setClosureManufacturer(arg0);
//		createInputMap.setClosureProductCategoryTier1(arg0);
//		createInputMap.setClosureProductCategoryTier2(arg0);
//		createInputMap.setClosureProductCategoryTier3(arg0);
//		createInputMap.setClosureProductModelVersion(arg0);
//		createInputMap.setClosureProductName(arg0);
//		createInputMap.setCreateRequest(arg0);
//		createInputMap.setDepartment(arg0);
//		createInputMap.setDirectContactFirstName(arg0);
//		createInputMap.setDirectContactLastName(arg0);
//		createInputMap.setDirectContactMiddleInitial(arg0);
//		createInputMap.setHPDCI(arg0);
		//....
		
		log.debug("Exception on helpDeskSubmitServiceDocument:["+helpDeskSubmitServiceDocument.xmlText()+"]");
		
		String remedyTicketID = callRemedy(createInputMap,authenticationInfo);
		
		return remedyTicketID;
	}
	
	private String callRemedy(CreateInputMap createInputMap,AuthenticationInfo authenticationInfo) {

		try {

			EnvelopeDocument envelopeToSend =  buildEnvelope(encoding,createInputMap,authenticationInfo);
	
			log.info("EnvelopeToSend sent to Remedy:["+envelopeToSend.toString()+"]");
	
			byte[] soapPayload = envelopeToSend.toString().getBytes(encoding);

			InputStream inputStream = sharedHTTPClient.invoke(soapPayload, userToken, soapAction);
		
			byte[] bytes = IOUtils.toByteArray(inputStream);

			
			log.info("Return from Remedy :["+new String(bytes)+"]");

			return getResponse(bytes);
		
		} catch (Exception e) {
			throw new RemedyWSClientException("Exception on calling Remedy WS. CreateInputMap:["+createInputMap.xmlText()+"]",e);
		}
	}
	
	public String getResponse(byte[] bytes){

		try {
			log.info("Starting gettting Remedy Response");
			
			EnvelopeDocument responseDoc = EnvelopeDocument.Factory.parse(new ByteArrayInputStream(bytes));
	
			HelpDeskSubmitServiceResponseDocument helpDeskSubmitServiceResponseDocument = HelpDeskSubmitServiceResponseDocument.Factory.parse(responseDoc.getEnvelope().getBody().xmlText());
	
			String incidentNumber = helpDeskSubmitServiceResponseDocument.getHelpDeskSubmitServiceResponse().getIncidentNumber();
			
			log.info("incidentNumber: ["+incidentNumber+"]");
	
			if(incidentNumber==null || incidentNumber.equals(""))
				throw new RemedyWSClientException("The Remedy Incident Number is NULL");
			
			return incidentNumber;
			
		}catch (Exception e) {
			throw new RemedyWSClientException("Exception on getting the RemedyResponse",e);
		}
	}


	private EnvelopeDocument buildEnvelope(String encoding2, CreateInputMap createInputMap,AuthenticationInfo authenticationInfo) {
		
		EnvelopeDocument envDoc = EnvelopeDocument.Factory.newInstance();
		Envelope envelope = envDoc.addNewEnvelope();

		addHeader(envelope, authenticationInfo);
		addBody(envelope,createInputMap);

		envDoc.documentProperties().setEncoding(encoding);
		return envDoc;
	}

	private void addHeader(Envelope envelope, AuthenticationInfo authenticationInfo) {

		Header header = envelope.addNewHeader();
		
		Node node = header.getDomNode();
		Node nodeToImport = authenticationInfo.getDomNode();
		Node nodeToAppend = node.getOwnerDocument().importNode(nodeToImport, true);
		node.appendChild(nodeToAppend);
	}
	
	private void addBody(Envelope envelope, CreateInputMap createInputMap) {

		Body body = envelope.addNewBody();
		Node node = body.getDomNode();
		Node nodeToImport = createInputMap.getDomNode();
		Node nodeToAppend = node.getOwnerDocument().importNode(nodeToImport, true);
		node.appendChild(nodeToAppend);
	}
	
	
	public HTTPClient getSharedHTTPClient() {
		return sharedHTTPClient;
	}

	public void setSharedHTTPClient(HTTPClient sharedHTTPClient) {
		this.sharedHTTPClient = sharedHTTPClient;
	}


	public String getEncoding() {
		return encoding;
	}

	public void setEncoding(String encoding) {
		this.encoding = encoding;
	}

	public String getUserToken() {
		return userToken;
	}

	public void setUserToken(String userToken) {
		this.userToken = userToken;
	}

	public String getSoapAction() {
		return soapAction;
	}

	public void setSoapAction(String soapAction) {
		this.soapAction = soapAction;
	}

}
