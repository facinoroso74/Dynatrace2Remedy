package it.reply.sytel.adr.dynatraceClient.imp;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;

import org.apache.log4j.Logger;

import it.reply.sytel.adr.common.log.EtlLogger;
import it.reply.sytel.adr.common.ws.HTTPClient;
import it.reply.sytel.adr.dynatraceClient.RestClient;
import it.reply.sytel.adr.dynatraceClient.exc.RestClientException;

public class RestClientImpl implements RestClient{

	private Logger log = EtlLogger.getLogger(getClass());
	
	private HTTPClient httpClient;
	private String encoding;
	private String userToken="";
	private String soapAction="";

    
	public String invokeRestService(String httpString,String user,String password){

				
		BufferedReader rd =null;
		
		try{
			long before = System.currentTimeMillis();
			
			if(log.isDebugEnabled())
				log.debug("calling the console:["+httpString+"] with user["+user+"] pwd="+password+"...");
			
			InputStream is = httpClient.invokeGet(user,password,httpString);
			rd = new BufferedReader(new InputStreamReader(is));

			String line = "";
			StringBuffer content=new StringBuffer();
						
			long after= System.currentTimeMillis();
			long elapsed=after-before;

			if(log.isDebugEnabled())
				log.debug("calling the console:["+httpString+"] with user["+user+"] pwd="+password+"... DONE elapsed:["+elapsed+"]");
			
			while ((line = rd.readLine()) != null) {
				content.append(line).append("\n");
			}
			
			if(content.toString().length()!=0) {
				if(log.isDebugEnabled())
					log.debug("content:["+content.toString()+"]");
			}
			
			return content.toString(); 
			
		}catch (Exception e) {
			throw new RestClientException("Exception on invoking the http:["+httpString+"]",e);
		}finally {
			if(rd!=null)
				try {
					rd.close();
				} catch (IOException e) {
					throw new RestClientException("Exception on closing the buffer reader for http:["+httpString+"]",e);
				}
		}
	}
	

	public HTTPClient getHttpClient() {
		return httpClient;
	}

	public void setHttpClient(HTTPClient httpClient) {
		this.httpClient = httpClient;
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