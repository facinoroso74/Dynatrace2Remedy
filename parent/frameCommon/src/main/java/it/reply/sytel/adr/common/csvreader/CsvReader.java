package it.reply.sytel.adr.common.csvreader;

import java.io.InputStream;
import java.util.List;

import it.reply.sytel.adr.common.csvreader.exc.CsvReaderExeption;

public interface CsvReader {

	public List<Object> readAll() throws CsvReaderExeption;
	
	public CsvJavaBeanEntry getCsvJavaBean();
	public void setCsvJavaBean(CsvJavaBeanEntry csvJavaBean);
	public InputStream getFileIs();
	public void setFileIs(InputStream fileIs);
	public String getDelimiter();
	public void setDelimiter(String delimiter);
	
}
