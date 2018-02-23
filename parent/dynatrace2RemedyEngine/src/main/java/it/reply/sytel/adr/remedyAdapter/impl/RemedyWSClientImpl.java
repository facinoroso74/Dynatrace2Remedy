package it.reply.sytel.adr.remedyAdapter.impl;

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
import hpdIncidentInterfaceCreateWSVIP.ImpactType;
import hpdIncidentInterfaceCreateWSVIP.ReportedSourceType;
import hpdIncidentInterfaceCreateWSVIP.ServiceTypeType;
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

	@Override
	public String createIncident(DynatraceIncident dynatraceIncident,RemedyAutenticationInfo remedyAutenticationInfo) {
		
		AuthenticationInfoDocument authenticationInfoDocument = AuthenticationInfoDocument.Factory.newInstance();
		AuthenticationInfo authenticationInfo = authenticationInfoDocument.addNewAuthenticationInfo();
		authenticationInfo.setUserName(remedyAutenticationInfo.getUser());
		authenticationInfo.setPassword(remedyAutenticationInfo.getPwd());
		
		HelpDeskSubmitServiceDocument helpDeskSubmitServiceDocument = HelpDeskSubmitServiceDocument.Factory.newInstance();
		CreateInputMap createInputMap = helpDeskSubmitServiceDocument.addNewHelpDeskSubmitService();
		createInputMap.setFirstName("firstName");
		createInputMap.setLastName("lastName");
		createInputMap.setImpact(ImpactType.X_1_EXTENSIVE_WIDESPREAD);
		createInputMap.setReportedSource(ReportedSourceType.SYSTEMS_MANAGEMENT);
		createInputMap.setServiceType(ServiceTypeType.INFRASTRUCTURE_EVENT);
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

			//InputStream inputStream = sharedHTTPClient.invoke(soapPayload, userToken, soapAction);
		
//			byte[] bytes = IOUtils.toByteArray(inputStream);
//
//			log.info("Return from Asset :["+new String(bytes)+"]");
//
//			EnvelopeDocument responseDoc = EnvelopeDocument.Factory.parse(new ByteArrayInputStream(bytes));
			
			return null;
		
		} catch (Exception e) {
			throw new RemedyWSClientException("Exception on calling Remedy WS. CreateInputMap:["+createInputMap.xmlText()+"]",e);
		}
	}
	
	
//	public PrepareListaAssetResDTO callPrepareListaAsset(PrepareListaAssetReqDTO prepareListaAssetReqDTO){
//
//		PrepareListaAssetReturn prepareListaAssetReturn = null;
//		PrepareListaAssetResDTO prepareListaAssetResDTO = new PrepareListaAssetResDTO();
//		try{
//			
//			PrepareListaAssetDocument prepareListaAssetDocument =  PrepareListaAssetDocument.Factory.newInstance();
//			PrepareListaAsset prepareListaAsset = prepareListaAssetDocument.addNewPrepareListaAsset();
//			PrepareListaAssetInType prepareListaAssetIn = prepareListaAsset.addNewPrepareListaAssetIn();
//
//			prepareListaAssetIn.setIdCliente(prepareListaAssetReqDTO.getIdCliente());
//			prepareListaAssetIn.setStato(PrepareListaAssetInType.Stato.INSTALLATO);
//
//			EnvelopeDocument envelopeToSend =  builEnvelope(encoding,prepareListaAsset);
//
//			log.info("qp sent to Asset:["+envelopeToSend.toString()+"]");
//
//			byte[] soapPayload = envelopeToSend.toString().getBytes(encoding);
//
//			InputStream inputStream = sharedHTTPClient.invoke(soapPayload, userToken, soapAction);
//
//			byte[] bytes = IOUtils.toByteArray(inputStream);
//
//			log.info("Return from Asset :["+new String(bytes)+"]");
//
//			EnvelopeDocument responseDoc = EnvelopeDocument.Factory.parse(new ByteArrayInputStream(bytes));
//
//			PrepareListaAssetResponseDocument prepareListaAssetResponseDocument= PrepareListaAssetResponseDocument.Factory.parse(responseDoc.getEnvelope().getBody().xmlText());
//
//			log.info("prepareListaAssetResponseDocument: ["+prepareListaAssetResponseDocument.toString()+"]");
//
//			prepareListaAssetReturn = getResponse(prepareListaAssetResponseDocument);
//
//			prepareListaAssetResDTO.setRequestID(prepareListaAssetReturn.getRequestID()!=null && !"".equalsIgnoreCase(prepareListaAssetReturn.getRequestID())?new BigInteger(prepareListaAssetReturn.getRequestID()):null);
//			prepareListaAssetResDTO.setCardinalitaItem(prepareListaAssetReturn.getCardinalitaItem()!=null && !"".equalsIgnoreCase(prepareListaAssetReturn.getCardinalitaItem())?new BigInteger(prepareListaAssetReturn.getCardinalitaItem()):null);
//			prepareListaAssetResDTO.setNumeroItemPerPagina(prepareListaAssetReturn.getNumeroItemPerPagina()!=null && !"".equalsIgnoreCase(prepareListaAssetReturn.getNumeroItemPerPagina())?new BigInteger(prepareListaAssetReturn.getNumeroItemPerPagina()):null);
//			prepareListaAssetResDTO.setTotalePagine(prepareListaAssetReturn.getTotalePagine()!=null && !"".equalsIgnoreCase(prepareListaAssetReturn.getTotalePagine())? new BigInteger(prepareListaAssetReturn.getTotalePagine()):null);
//
//		}catch(Exception e){
//			log.error("Exception on callPrepareListaAsset",e);
//		}
//		return prepareListaAssetResDTO;
//
//
//	} 
//
//
//	public PrepareListaAssetReturn getResponse(PrepareListaAssetResponseDocument prepareListaAssetResponseDocument) throws JAXBException{
//
//		log.info("Starting getResponse");
//
////		PrepareListaAssetResponse richiestaCliCodOutput = prepareListaAssetResponseDocument.getPrepareListaAssetResponse();
////
////		log.info("PrepareListaAssetResponse: ["+prepareListaAssetResponseDocument.getPrepareListaAssetResponse().toString()+"]");
//
//		PrepareListaAssetReturn prepareListaAssetReturnType =  prepareListaAssetResponseDocument.getPrepareListaAssetResponse().getPrepareListaAssetReturn();
//
//		log.info("PrepareListaAssetReturn: ["+prepareListaAssetReturnType.toString()+"]");
//
//		return prepareListaAssetReturnType;
//
//	}
//

	private EnvelopeDocument buildEnvelope(String encoding2, CreateInputMap createInputMap,AuthenticationInfo authenticationInfo) {
		
		EnvelopeDocument envDoc = EnvelopeDocument.Factory.newInstance();
		Envelope envelope = envDoc.addNewEnvelope();

		addHeader(envelope, authenticationInfo);
		addBody(envelope,createInputMap);

		// Set output encoding according to configuration
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
