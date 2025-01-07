package com.winter.app.langs.wrapper;

import java.util.Scanner;

public class Wrapper2 {

	public static void main(String[] args) {
		
		int year = 2025;
	
	
		Scanner sc = new Scanner(System.in);
		System.out.println("주민번호 입력");
		String birth = sc.next(); //991222-1234567		// 데이터 가져오기 -> 숫자로 바꾸기 -> 계산하기     99 = 27   98 = 28   97 = 29    96 = 30 
									
		String num =birth.substring(0,2);
		String nal = birth.substring(2, 4);
		
		int nal1 = Integer.parseInt(nal);
		int num1 =Integer.parseInt(num); //나이를 알아내기위 한 
		
		
		char ch = birth.charAt(7);
		if(ch =='1' || ch =='2') {
			System.out.println(year - (1900+num1));
			
		}else if(ch == '3' || ch =='4'){
			System.out.println(year-(2000+num1));
		}
		
		if(nal1>2&&nal1<6) {
			System.out.println("봄");
		}else if(nal1>=6&&nal1<=8){
			System.out.println("여름");
		}else if(nal1>=9&&nal1<=11) {
			System.out.println("가을");
		}else {System.out.println("겨울");
			
		}
		
		
		//월 , 3-5 : 봄 6-8: 여름 9-11 가을 9-11 겨울 12-2 
	
		
	}
}
