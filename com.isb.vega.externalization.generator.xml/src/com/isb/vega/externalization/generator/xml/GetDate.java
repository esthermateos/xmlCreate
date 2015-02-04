package com.isb.vega.externalization.generator.xml;

import java.util.Calendar;

public class GetDate {
	
	public static String Date() {
		String date="";
		Calendar c = Calendar.getInstance();
		String dia = Integer.toString(c.get(Calendar.DATE));
		if(dia.length()==1)
			dia = "0".concat(dia);
		String mes = Integer.toString(c.get(Calendar.MONTH)+1);
		if(mes.length()==1)
			mes = "0".concat(mes);
		String annio = Integer.toString(c.get(Calendar.YEAR));
		date= annio.concat("-").concat(mes).concat("-").concat(dia);
		return date;		
	}

}
