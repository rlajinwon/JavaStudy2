package com.winter.app.langs.ex1;

import java.util.Scanner;
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
	
	public Person[] init() {
		
		String [] datas = this.data.split(",");
	
		Person[] persons = new Person[datas.length/4]; 
		
		int idx=0;
		for(int i = 0; i< datas.length;i+=4) {
			Person person = new Person();
			
			person.setName(datas[i]); //   0,  4 , 8
			person.setPhone(datas[i+1]); //  1, 5 , 9
			person.setEmail(datas[i+2]); //  2,  6 , 10
			person.setBirth(datas[i+3]); //  3, 7 , 11
		
			persons[idx] = person;
			idx++;

			
		
		}return persons;
		
		//Person 객체에 데이터를 대입 
		
		//Person 객체 들을 리턴
		

		
	}
	
	public Person find(Person[] persons) {
		Scanner sc = new Scanner(System.in);
		System.out.println("이름 입력: ");
		String names = sc.next();
		Person person = null;
		for(int i = 0; i < persons.length; i++) {
			person = persons[i];
			break;
		}
		return person;
	}
	

	
	
	
	

}
