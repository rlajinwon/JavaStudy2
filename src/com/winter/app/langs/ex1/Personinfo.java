package com.winter.app.langs.ex1;

import java.util.Set;

public class Personinfo {
	
	private String data;
	
	public Personinfo() {
	
		this.data = "iu, 010-1234-5678, iu@naver.com, 99-05-05,";
		this.data = this.data +"winter, 010-2222-2222, winter@gmail.com, 01-01-01,";
		this.data = this.data +"suji, 010-3333-3333, suji@gmail.com, 02-02-02,";
		
		System.out.println(this.data);
		
	}
	
	//메서드명 init
	//data 변수의 값을 파싱
	
	public void init() {
		
		String [] datas = this.data.split(",");
		
		Person person = new Person();
		person.setName(data);
		
		
		
		//Person 객체에 데이터를 대입 
		
		//Person 객체 들을 리턴
		

		
	}

}
