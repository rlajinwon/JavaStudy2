package com.winter.app.langs.ex1;

import java.util.Scanner;

public class PersonController {

	public void start() {
		
		// 1. 주소록 초기화 (init 호출) 
		// 2. 주소록 출력
		// 3. 이름 검색
		// 4. 주소록 정보 추가 (pathInfo.add())
		// 5. 주소록 삭제 (pathInfo.delete())
		// 6. 종료 
		
		
		
		boolean check = true;
		Personinfo personinfo = new Personinfo();
		PersonView pv = new PersonView(); 
		Person person = new Person();
		
		
		while(check) {
			System.out.println("1.주소록 초기화  2.주소록 출력  3.이름 검색  4.주소록 정보 추가  5.주소록 삭제  6.종료");
		
		Scanner sc = new Scanner(System.in);
		int input = sc.nextInt();
		
		if(input == 1) {
			personinfo.init();
			
			
		}else if(input == 2) {
			pv.view(person);
			
			
		}else if (input == 3) {
			
			
			
			
			
			
		}else if (input == 4) {
			
			
		}else if (input == 5) {
			
			
		}else if (input ==6) {
			
			
		}
		
		
	}
	
		
	}
	
}
