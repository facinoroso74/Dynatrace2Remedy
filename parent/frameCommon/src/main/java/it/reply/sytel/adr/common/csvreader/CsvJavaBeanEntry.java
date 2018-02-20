package it.reply.sytel.adr.common.csvreader;

import it.reply.sytel.adr.common.csvreader.exc.CsvReaderExeption;

public interface CsvJavaBeanEntry {

	
	public Object parseEntry(String... data) throws CsvReaderExeption;
	
}
