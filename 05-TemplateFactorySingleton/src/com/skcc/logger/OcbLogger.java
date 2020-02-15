package com.skcc.logger;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Locale;

public class OcbLogger {
	
	private static OcbLogger ocbLogger = new OcbLogger();
	
	private static FileWriter fw;
	
	private Date date;

	private OcbLogger() {
		
		try {
			this.date = new Date ();
			SimpleDateFormat fm = new SimpleDateFormat("yyyy-MM-dd", Locale.KOREA);
			fw = new FileWriter( new File("ocb_log/log_" +fm.format(date)),true);
			
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}  
	
	}
	
	public static OcbLogger getInstance() {
		if (ocbLogger == null ) {
			return new OcbLogger();
		}
		return ocbLogger;
	}
	
	public static void errlog(String message) {
		
		SimpleDateFormat fm1 = new SimpleDateFormat("yyyy-MM-dd hh:mm:ss", Locale.KOREA);
		
		Date current = new Date();
		
		String time = fm1.format(current);
		
		String log = "[ " + time + " ] " + " ERR "+ message + "\n";
		
		try {
			fw.write(log);
			fw.flush();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}
	
	
	public static void normlog(String message) {
		
		SimpleDateFormat fm1 = new SimpleDateFormat("yyyy-MM-dd hh:mm:ss", Locale.KOREA);
		
		Date current = new Date();
		
		String time = fm1.format(current);
		
		String log = "[ " + time + " ] " + " NRM " + message + "\n";
		
		try {
			fw.write(log);
			fw.flush();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}	
	
	

}
