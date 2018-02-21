package it.reply.sytel.adr.dynatraceClient.imp;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

import org.apache.http.HttpEntity;
import org.apache.http.HttpResponse;
import org.apache.http.client.HttpClient;
import org.apache.http.client.methods.HttpGet;
import org.apache.http.impl.client.DefaultHttpClient;
import org.apache.log4j.Logger;
import org.jboss.security.Base64Encoder;

import it.reply.sytel.adr.common.log.EtlLogger;
import it.reply.sytel.adr.dynatraceClient.RestClient;
import it.reply.sytel.adr.dynatraceClient.exc.RestClientException;

public class RestClientImpl implements RestClient{

	private Logger log =EtlLogger.getLogger(getClass());
	
	public String invokeRestService(String httpString,String user,String password){

		BufferedReader rd =null;
		
		try{
			long before = System.currentTimeMillis();
			
			if(log.isDebugEnabled())
				log.debug("calling the console:["+httpString+"] with user["+user+"] pwd="+password+"...");
			
			HttpClient client = new DefaultHttpClient();
			String encoding = Base64Encoder.encode (user+":"+password);
			HttpGet httppost = new HttpGet(httpString);
			httppost.setHeader("Authorization", "Basic " + encoding);
			
			HttpResponse response = client.execute(httppost);
			HttpEntity entity = response.getEntity();

			rd = new BufferedReader (new InputStreamReader(entity.getContent()));
			
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
	
	
	


	public static void main(String[] args) {
		RestClientImpl restClient = new RestClientImpl();
		//restClient.invokeHttpGet("", "", "");
		String content = restClient.invokeRestService("https://dynatracereply.adr.it:8021/rest/management/dashboard/IncidentDashboard", "Remedy_Integration", "remedy");
		
	}

}