package it.reply.sytel.adr.common.log;

import it.reply.sytel.flowapp.util.xml.XMLTool;
import it.reply.sytel.adr.common.log.exc.RMALogException;

import java.io.FileInputStream;
import java.io.InputStream;

import org.w3c.dom.Document;

public class LogFile {

	private String configurationFile="adr-log4j.xml";

	public String getConfigurationFile() {
		return configurationFile;
	}

	public void setConfigurationFile(String configurationFile) {
		this.configurationFile = configurationFile;
	}
	
	public Document getDocumentFromLogFile() throws RMALogException {
		XMLTool xmlTool = null;
		try{
			System.out.println("log4j: getDocumentFromLogFile:loading ["+configurationFile+"]");
			InputStream is = getClass().getClassLoader().getResourceAsStream(configurationFile);
			
			xmlTool = XMLTool.getParserInstance();
			Document doc = xmlTool.parseDOM(is);
			System.out.println("log4j: getDocumentFromLogFile:["+configurationFile+"] DONE");
			return  doc;
		}catch (Exception e) {
			throw new RMALogException("Exception on getting the Document from File:loading ["+configurationFile+"]",e);
		}finally{
			XMLTool.releaseParserInstance(xmlTool);
		}
		
	}
}
