package it.reply.sytel.adr.dynatraceClient;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.URL;

public class RestClient {


	
	protected void invokeHttpGet(String httpString,String user,String password){
		
//		try{
//			HTTPClient client = new DefaultHttpClient();
//			String encoding = Base64Encoder.encode (user+":"+password);
//			HttpGet httppost = new HttpGet(httpString);
//			httppost.setHeader("Authorization", "Basic " + encoding);
//
//			HttpResponse response = client.execute(httppost);
//			HttpEntity entity = response.getEntity();
//			
//			BufferedReader rd = new BufferedReader (new InputStreamReader(entity.getContent()));
//			
//			String line = "";
//			StringBuffer content=new StringBuffer();
//			
//			if(log.isDebugEnabled())
//				log.debug("print the rule. ------------------ BEGIN -------------------------");
//			
//			while ((line = rd.readLine()) != null) {
//				
//				content.append(line).append("\n");
//			}
//			
//			if(content.toString().length()!=0)
//				writeFile(ruleFile,content.toString());
//			
//			if(log.isDebugEnabled())
//				log.debug("print the rule. ------------------ END -------------------------");
//			
//			rd.close();
//			
//		}catch (Exception e) {
//			throw new RestClientException("Exception on invoking the http:["+httpString+"] for ruleName:["+ruleFile+"]",e);
//		}
//		
		
		try {
			
			//URL url = new URL("http://localhost:8080/RESTfulExample/json/product/get");
			URL url = new URL("http://localhost:8080/RESTfulExample/json/product/get");
			HttpURLConnection conn = (HttpURLConnection) url.openConnection();
			conn.setRequestMethod("GET");
			//conn.setRequestProperty("Accept", "application/json");
			conn.setRequestProperty("Accept", "application/xml");
			
			if (conn.getResponseCode() != 200) {
				throw new RuntimeException("Failed : HTTP error code : "
						+ conn.getResponseCode());
			}
			
			BufferedReader br = new BufferedReader(new InputStreamReader(
				(conn.getInputStream())));
			
			String output;
			System.out.println("Output from Server .... \n");
			while ((output = br.readLine()) != null) {
				System.out.println(output);
			}
			
			conn.disconnect();

		} catch (Exception e) {

			e.printStackTrace();

		}
	}

}