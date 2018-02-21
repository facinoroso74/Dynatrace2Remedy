package it.reply.sytel.adr.remedyAdapter.impl;

import java.io.ByteArrayInputStream;
import java.io.InputStream;
import java.math.BigInteger;

import javax.xml.bind.JAXBException;

import org.apache.commons.io.IOUtils;
import org.apache.log4j.Logger;
import org.w3c.dom.Node;

import it.reply.sytel.adr.common.log.EtlLogger;
import it.reply.sytel.adr.common.ws.HTTPClient;
import it.reply.sytel.adr.remedyAdapter.RemedyClient;
import it.reply.sytel.adr.vo.DynatraceIncident;

public class RemedyWSClientImpl implements RemedyClient{

	private HTTPClient sharedHTTPClient;
	private String encoding;
	private String userToken="";
	private String soapAction="";

	//private Logger log = EtlLogger.getLogger("ASSET_PROVISIONING_LOGGER_WS");
	
	private Logger log = EtlLogger.getLogger(getClass());

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
//	public EnvelopeDocument builEnvelope(String encoding,PrepareListaAsset prepareListaAsset){
//
//		EnvelopeDocument envDoc = EnvelopeDocument.Factory.newInstance();
//		Envelope envelope = envDoc.addNewEnvelope();
//
//		addBody(envelope,prepareListaAsset);
//
//		// Set output encoding according to configuration
//		envDoc.documentProperties().setEncoding(encoding);
//		return envDoc;
//
//	}
//
//	private void addBody(Envelope envelope,PrepareListaAsset prepareListaAsset) {
//
//		Body body = envelope.addNewBody();
//		Node node = body.getDomNode();
//		Node nodeToImport = prepareListaAsset.getDomNode();
//		Node nodeToAppend = node.getOwnerDocument().importNode(nodeToImport, true);
//		node.appendChild(nodeToAppend);
//	}
//
//	public ListaAssetResDTO callGetListaAsset(BigInteger requestID, BigInteger pagina){
//
//		GetListaAssetReturn getListaAssetReturn= null;
//		ListaAssetResDTO  listaAssetResDTO= null;
//
//		try{
//			
//			GetListaAssetDocument listaAssetInDocument = GetListaAssetDocument.Factory.newInstance();
//			GetListaAsset listaAsset = listaAssetInDocument.addNewGetListaAsset();
//			ListaAssetInType listaAssetInType = listaAsset.addNewListaAssetIn();
//
//
//
//			listaAssetInType.setRequestID(requestID);
//			listaAssetInType.setPagina(pagina);
//
//			EnvelopeDocument envelopeToSend =  builEnvelope(encoding,listaAsset);
//
//			log.info("qp sent to Asset:["+envelopeToSend.toString()+"]");
//
//			byte[] soapPayload = envelopeToSend.toString().getBytes(encoding);
//
//			InputStream inputStream = sharedHTTPClient.invoke(soapPayload, userToken, soapAction);
//
//			byte[] bytes = IOUtils.toByteArray(inputStream);
//
//			log.info("Return from getListaAsset :["+new String(bytes)+"]");
//
//			EnvelopeDocument responseDoc = EnvelopeDocument.Factory.parse(new ByteArrayInputStream(bytes));
//
//			GetListaAssetResponseDocument getListaAssetResponseDocument= GetListaAssetResponseDocument.Factory.parse(responseDoc.getEnvelope().getBody().xmlText());
//
//			log.info("getListaAssetResponseDocument: ["+getListaAssetResponseDocument.toString()+"]");
//
//			getListaAssetReturn = getResponse(getListaAssetResponseDocument);
//
//			listaAssetResDTO=Utility.populateResListaAsset(getListaAssetReturn);
//
//		}catch(Exception e){
//			log.error("Exception on callGetListaAsset",e);
//		}
//
//		return listaAssetResDTO;
//	}
//
//
//	private GetListaAssetReturn getResponse(GetListaAssetResponseDocument getListaAssetResponseDocument) throws JAXBException{
//
//		log.info("Starting getResponse");
//
//////		GetListaAssetResponse richiestaCliCodOutput = getListaAssetResponseDocument.getGetListaAssetResponse();
////
////		log.info("GetListaAssetResponse: ["+getListaAssetResponseDocument.getGetListaAssetResponse().toString()+"]");
//
//		GetListaAssetReturn prepareListaAssetReturnType =  getListaAssetResponseDocument.getGetListaAssetResponse().getGetListaAssetReturn();
//
//		log.info("GetListaAssetReturn: ["+prepareListaAssetReturnType.toString()+"]");
//
//		return prepareListaAssetReturnType;
//
//	}
//
//
//
//
//	private EnvelopeDocument builEnvelope(String encoding,GetListaAsset listaAsset){
//
//		EnvelopeDocument envDoc = EnvelopeDocument.Factory.newInstance();
//		Envelope envelope = envDoc.addNewEnvelope();
//
//		addBody(envelope,listaAsset);
//
//		// Set output encoding according to configuration
//		envDoc.documentProperties().setEncoding(encoding);
//		return envDoc;
//
//	}
//
//	private void addBody(Envelope envelope,GetListaAsset listaAsset) {
//
//		Body body = envelope.addNewBody();
//		Node node = body.getDomNode();
//		Node nodeToImport = listaAsset.getDomNode();
//		Node nodeToAppend = node.getOwnerDocument().importNode(nodeToImport, true);
//		node.appendChild(nodeToAppend);
//	}
//
//
//	public PrepareListaServiziSLAResDTO callPrepareListaServiziSLA(String idLotto, BigInteger idCliente){
//
//		PrepareListaServiziSLAOutType prepareListaServiziSLAOutType =null;
//		PrepareListaServiziSLAResDTO prepareListaServiziSLAResDTO=null;
//		try{
//			
//			PrepareListaServiziSLADocument prepareListaServiziSLADocument = PrepareListaServiziSLADocument.Factory.newInstance();
//			PrepareListaServiziSLA prepareListaServiziSLA = prepareListaServiziSLADocument.addNewPrepareListaServiziSLA();
//			PrepareListaServiziSLAInType prepareListaServiziSLAInType =prepareListaServiziSLA.addNewPrepareListaServiziSLAIn();
//
//			prepareListaServiziSLAInType.setIdCliente(idCliente);
//			prepareListaServiziSLAInType.setIdLotto(idLotto);
//
//			EnvelopeDocument envelopeToSend =  builEnvelope(encoding,prepareListaServiziSLA);
//
//			log.info("qp sent to Asset:["+envelopeToSend.toString()+"]");
//
//			byte[] soapPayload = envelopeToSend.toString().getBytes(encoding);
//
//			InputStream inputStream = sharedHTTPClient.invoke(soapPayload, userToken, soapAction);
//
//			byte[] bytes = IOUtils.toByteArray(inputStream);
//
//			log.info("Return from callPrepareListaServiziSLA :["+new String(bytes)+"]");
//
//			EnvelopeDocument responseDoc = EnvelopeDocument.Factory.parse(new ByteArrayInputStream(bytes));
//
//			PrepareListaServiziSLAResponseDocument prepareListaServiziSLAResponseDocument= PrepareListaServiziSLAResponseDocument.Factory.parse(responseDoc.getEnvelope().getBody().xmlText());
//
//			log.info("prepareListaServiziSLAResponseDocument: ["+prepareListaServiziSLAResponseDocument.toString()+"]");
//
//			prepareListaServiziSLAOutType = getResponse(prepareListaServiziSLAResponseDocument);
//
//			prepareListaServiziSLAResDTO=Utility.populateResListaServiziSLA(prepareListaServiziSLAOutType);
//
//		}catch(Exception e){
//			log.error("Exception on callPrepareListaServiziSLA",e);
//		}
//
//		return prepareListaServiziSLAResDTO;
//	}
//
//	private EnvelopeDocument builEnvelope(String encoding,PrepareListaServiziSLA prepareListaServiziSLA){
//
//		EnvelopeDocument envDoc = EnvelopeDocument.Factory.newInstance();
//		Envelope envelope = envDoc.addNewEnvelope();
//
//		addBody(envelope,prepareListaServiziSLA);
//
//		// Set output encoding according to configuration
//		envDoc.documentProperties().setEncoding(encoding);
//		return envDoc;
//
//	}
//	
//	private void addBody(Envelope envelope,PrepareListaServiziSLA prepareListaServiziSLA) {
//
//		Body body = envelope.addNewBody();
//		Node node = body.getDomNode();
//		Node nodeToImport = prepareListaServiziSLA.getDomNode();
//		Node nodeToAppend = node.getOwnerDocument().importNode(nodeToImport, true);
//		node.appendChild(nodeToAppend);
//	}
//	
//	private PrepareListaServiziSLAOutType getResponse(PrepareListaServiziSLAResponseDocument prepareListaServiziSLAResponseDocument) throws JAXBException{
//
//		log.info("Starting getResponse");
//
//		PrepareListaServiziSLAResponse prepareListaServiziSLAResponse = prepareListaServiziSLAResponseDocument.getPrepareListaServiziSLAResponse();
//
//		log.info("prepareListaServiziSLAResponse: ["+prepareListaServiziSLAResponse.getPrepareListaServiziSLAReturn().toString()+"]");
//
//		PrepareListaServiziSLAOutType prepareListaServiziSLAOutType =  prepareListaServiziSLAResponse.getPrepareListaServiziSLAReturn();
//
//		log.info("GetListaAssetReturn: ["+prepareListaServiziSLAOutType.toString()+"]");
//
//		return prepareListaServiziSLAOutType;
//
//	}
//	
//	
//	public ListaServiziSlaResDTO callListaServiziSLA( BigInteger requestID, BigInteger pagina){
//
//		ListaServiziSLAOutType listaServiziSLAOutType =null;
//		ListaServiziSlaResDTO listaServiziSLAResDTO=null;
//		try{
//			
//			GetListaServiziSLADocument getListaServiziSLADocument = GetListaServiziSLADocument.Factory.newInstance();
//			GetListaServiziSLA getListaServiziSLA = getListaServiziSLADocument.addNewGetListaServiziSLA();
//			ListaServiziSLAInType listaServiziSLAInType =getListaServiziSLA.addNewListaServiziSLAIn();
//
//			listaServiziSLAInType.setRequestID(requestID);
//			listaServiziSLAInType.setPagina(pagina);
//
//			EnvelopeDocument envelopeToSend =  builEnvelope(encoding,getListaServiziSLA);
//
//			log.info("qp sent to Asset:["+envelopeToSend.toString()+"]");
//
//			byte[] soapPayload = envelopeToSend.toString().getBytes(encoding);
//
//			InputStream inputStream = sharedHTTPClient.invoke(soapPayload, userToken, soapAction);
//
//			byte[] bytes = IOUtils.toByteArray(inputStream);
//
//			log.info("Return from callListaServiziSLA :["+new String(bytes)+"]");
//
//			EnvelopeDocument responseDoc = EnvelopeDocument.Factory.parse(new ByteArrayInputStream(bytes));
//
//			GetListaServiziSLAResponseDocument getListaServiziSLAResponseDocument= GetListaServiziSLAResponseDocument.Factory.parse(responseDoc.getEnvelope().getBody().xmlText());
//
//			log.info("getListaServiziSLAResponseDocument: ["+getListaServiziSLAResponseDocument.toString()+"]");
//
//			listaServiziSLAOutType = getResponse(getListaServiziSLAResponseDocument);
//
//			listaServiziSLAResDTO=Utility.populateResListaServiziSLA(listaServiziSLAOutType);
//
//		}catch(Exception e){
//			log.error("Exception on callPrepareListaServiziSLA",e);
//		}
//
//		return listaServiziSLAResDTO;
//	}
//
//	private EnvelopeDocument builEnvelope(String encoding,GetListaServiziSLA getListaServiziSLA){
//
//		EnvelopeDocument envDoc = EnvelopeDocument.Factory.newInstance();
//		Envelope envelope = envDoc.addNewEnvelope();
//
//		addBody(envelope,getListaServiziSLA);
//
//		// Set output encoding according to configuration
//		envDoc.documentProperties().setEncoding(encoding);
//		return envDoc;
//
//	}
//	
//	private void addBody(Envelope envelope,GetListaServiziSLA getListaServiziSLA) {
//
//		Body body = envelope.addNewBody();
//		Node node = body.getDomNode();
//		Node nodeToImport = getListaServiziSLA.getDomNode();
//		Node nodeToAppend = node.getOwnerDocument().importNode(nodeToImport, true);
//		node.appendChild(nodeToAppend);
//	}
//	
//	private ListaServiziSLAOutType getResponse(GetListaServiziSLAResponseDocument getListaServiziSLAResponseDocument) throws JAXBException{
//
//		log.info("Starting getResponse");
//
//		GetListaServiziSLAResponse getListaServiziSLAResponse = getListaServiziSLAResponseDocument.getGetListaServiziSLAResponse();
//
//		log.info("getListaServiziSLAResponse: ["+getListaServiziSLAResponse.toString()+"]");
//
//		ListaServiziSLAOutType listaServiziSLAOutType =  getListaServiziSLAResponse.getGetListaServiziSLAReturn();
//
//		log.info("listaServiziSLAOutType: ["+listaServiziSLAOutType.toString()+"]");
//
//		return listaServiziSLAOutType;
//
//	}
//	
//	public ElencoFornitoriResDTO callListaFornitori(){
//		ElencoFornitoriOutType elencoFornitoriOutType =null;
//		ElencoFornitoriResDTO  elencoFornitoriResDTO=null;
//		try{
//			GetListaFornitoriDocument getListaFornitoriDocument = GetListaFornitoriDocument.Factory.newInstance();
//			//GetListaFornitori getListaFornitori = getListaFornitoriDocument.addNewGetListaFornitori();
//			ListaFornitoriInType fornitoriInType = getListaFornitoriDocument.addNewGetListaFornitori();
//			
//			EnvelopeDocument envelopeToSend =  builEnvelope(encoding,fornitoriInType);
//
//			log.info("qp sent to Asset:["+envelopeToSend.toString()+"]");
//
//			byte[] soapPayload = envelopeToSend.toString().getBytes(encoding);
//
//			InputStream inputStream = sharedHTTPClient.invoke(soapPayload, userToken, soapAction);
//
//			byte[] bytes = IOUtils.toByteArray(inputStream);
//
//			log.info("Return from callListaFornitori :["+new String(bytes)+"]");
//
//			EnvelopeDocument responseDoc = EnvelopeDocument.Factory.parse(new ByteArrayInputStream(bytes));
//
//			GetListaFornitoriResponseDocument getListaFornitoriResponseDocument= GetListaFornitoriResponseDocument.Factory.parse(responseDoc.getEnvelope().getBody().xmlText());
//
//			log.info("getListaFornitoriResponseDocument: ["+getListaFornitoriResponseDocument.toString()+"]");
//
//			elencoFornitoriOutType = getResponse(getListaFornitoriResponseDocument);
//
//			elencoFornitoriResDTO=Utility.populateResElencoFornitori(elencoFornitoriOutType);
//
//		}catch(Exception e){
//			log.error("Exception on callListaFornitori",e);
//		}
//
//		return elencoFornitoriResDTO;
//	};
//	
//	private EnvelopeDocument builEnvelope(String encoding, ListaFornitoriInType getListaFornitori){
//
//		EnvelopeDocument envDoc = EnvelopeDocument.Factory.newInstance();
//		Envelope envelope = envDoc.addNewEnvelope();
//
//		addBody(envelope,getListaFornitori);
//
//		// Set output encoding according to configuration
//		envDoc.documentProperties().setEncoding(encoding);
//		return envDoc;
//
//	}
//	private void addBody(Envelope envelope, ListaFornitoriInType getListaFornitori) {
//
//		Body body = envelope.addNewBody();
//		Node node = body.getDomNode();
//		Node nodeToImport = getListaFornitori.getDomNode();
//		Node nodeToAppend = node.getOwnerDocument().importNode(nodeToImport, true);
//		node.appendChild(nodeToAppend);
//	}
//	
//	private ElencoFornitoriOutType getResponse(GetListaFornitoriResponseDocument getListaFornitoriResponseDocument) throws JAXBException{
//
//		log.info("Starting getResponse");
//
//		GetListaFornitoriResponse getListaFornitoriResponse = getListaFornitoriResponseDocument.getGetListaFornitoriResponse();
//
//		log.info("getListaFornitoriResponse: ["+getListaFornitoriResponse.toString()+"]");
//
//	    ElencoFornitoriOutType elencoFornitoriOutType=getListaFornitoriResponse.getGetListaFornitoriReturn();
//
//		log.info("elencoFornitoriOutType: ["+elencoFornitoriOutType.toString()+"]");
//
//		return elencoFornitoriOutType;
//
//	}


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

	@Override
	public String createIncident(DynatraceIncident dynatraceIncident) {
		// TODO Auto-generated method stub
		return null;
	}


}
