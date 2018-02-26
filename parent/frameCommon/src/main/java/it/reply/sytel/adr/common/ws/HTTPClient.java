package it.reply.sytel.adr.common.ws;

import it.reply.sytel.adr.common.ws.exc.HttpClientException;

import java.io.InputStream;

public interface HTTPClient {

	public InputStream invoke(byte[] soapPayload, String userToken,String soapAction) throws HttpClientException;
	
	public InputStream invokeGet(String user,String pwd) throws HttpClientException;
	
	public InputStream invokeGet(String user,String pwd,String urlToConnect) throws HttpClientException;
}
