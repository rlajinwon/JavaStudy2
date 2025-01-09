package com.winter.app.utils.date;

import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

public class DateFomatMain1 {

	
	public static void main(String[] args) throws Exception {
		
		Calendar calendar = Calendar.getInstance();
		
		String pattern = "yyyy년 MM월 dd일 E HH:mm:ss";
		
		SimpleDateFormat sd = new SimpleDateFormat(pattern);
		String str =sd.format(calendar.getTime());
		System.out.println(str);
		
		pattern = "yyyy-MM-dd";
		
		String d = "2050-10-30";
		
		sd.applyPattern(pattern);
		
		Date date =sd.parse(d);
		
		Long t = date.getTime();
		
		calendar.setTimeInMillis(t);
		
		
		System.out.println(date);
		
		System.out.println(calendar.getTime());
		
		
		
	}
}
