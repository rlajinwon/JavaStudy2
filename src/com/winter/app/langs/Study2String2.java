package com.winter.app.langs;

public class Study2String2 {

	
	
	public static void main(String[] args) {
		
		
		String str="   ";
		System.out.println(str.length());// 글자수가 0인것
		
		System.out.println(str.isEmpty());
		//글자수가 0 또는 스페이스바로만 이루어진것
		
		System.out.println(str.isBlank());
		
		
		//replace
		//변경
		String r= str.replace(" ", "b");
		System.out.println(str);
		System.out.println(r);
		
		
		//abc Abc
		//대문자, 소문자로 전부 변경
		
		str = "aBc";
		r= str.toUpperCase();
		System.out.println(str);

		System.out.println(r);
		
		
		//문자열 = > 문자 배열
		char [] ch = str.toCharArray();
		
		// 문자열 앞 뒤 공백제거
		str = " winter ";
		
		System.out.println(str.length());
		System.out.println(str);
		r = str.trim();
		System.out.println(r);
		r= r.replace(" ", "");
		System.out.println(r);
		
		
	}
}
