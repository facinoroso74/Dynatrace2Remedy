package it.reply.sytel.adr.common.csvreader.impl;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.Reader;
import java.util.ArrayList;
import java.util.List;

import org.apache.log4j.Logger;

import it.reply.sytel.adr.common.csvreader.CsvJavaBeanEntry;
import it.reply.sytel.adr.common.csvreader.CsvReader;
import it.reply.sytel.adr.common.csvreader.exc.CsvReaderExeption;
import it.reply.sytel.adr.common.log.EtlLogger;

public class CsvReaderImpl implements CsvReader{

	private Logger log = EtlLogger.getLogger(getClass());
			
	private CsvJavaBeanEntry csvJavaBean;
	private InputStream fileIs;
	private String delimiter;
	
	
	public List<Object> readAll() throws CsvReaderExeption{
		
		Reader simpleReader=null;
		BufferedReader reader=null;
		int rowNumber=0;
		
		try {
			simpleReader = new InputStreamReader(fileIs);
			reader = new BufferedReader(simpleReader);
			
			List<Object> entries = new ArrayList<Object>();
	
			Object entry = null;
			
			rowNumber++;
			
			while ((entry = readNext(reader,rowNumber)) != null) {
				entries.add(entry);
			}
			
			return entries;
			
		}catch (Exception e) {
			log.error("Exception on parsing the csv",e);
			throw new CsvReaderExeption("Exception on parsing the csv",e);
		}finally{
			
			if(reader!=null)
				try {
					reader.close();
				} catch (IOException e) {
					log.error("Exception on closing the stream reader for csv",e);
					throw new CsvReaderExeption("Exception on closing the stream reader for csv",e);
				}
				
			if(simpleReader!=null)
				try {
					simpleReader.close();
				} catch (IOException e) {
					log.error("Exception on closing the stream for simpleReader csv",e);
					throw new CsvReaderExeption("Exception on closing the stream simpleReader for csv",e);
				}
			
		}

	}

	private Object readNext(BufferedReader reader,int rowNumber) throws Exception  {
		
		String line = reader.readLine();
		
		if(line!=null && line.trim().length()!=0){
			
//			if(log.isDebugEnabled())
//				log.debug("line:["+line+"]");
//			
			line = line.trim();
			String[] fieldStrArray = line.split(delimiter,-1);
			
//			if(log.isDebugEnabled()){
//				for (int i = 0; i < fieldStrArray.length; i++) {
//					log.debug("fieldStrArray:["+fieldStrArray[i]+"]");
//				}
//			}
			
			Object javaBeanLoaded = csvJavaBean.parseEntry(fieldStrArray);
			
			return javaBeanLoaded;
			
		}else
			return null;
		
	}

	public CsvJavaBeanEntry getCsvJavaBean() {
		return csvJavaBean;
	}

	public void setCsvJavaBean(CsvJavaBeanEntry csvJavaBean) {
		this.csvJavaBean = csvJavaBean;
	}

	public InputStream getFileIs() {
		return fileIs;
	}

	public void setFileIs(InputStream fileIs) {
		this.fileIs = fileIs;
	}

	public String getDelimiter() {
		return delimiter;
	}

	public void setDelimiter(String delimiter) {
		this.delimiter = delimiter;
	}

}
