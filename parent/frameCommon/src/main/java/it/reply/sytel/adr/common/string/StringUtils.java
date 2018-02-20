package it.reply.sytel.adr.common.string;

public class StringUtils {

	public static String toUpperAndTrim(String data) {
		if(data!=null){
			return data.toUpperCase().trim();
		}
		return data;
	}

	
	
}

