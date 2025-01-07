package com.winter.app.langs.wrapper;

import java.util.Scanner;

public class Wrapper3 {
	public static void main(String[] args) {
		
		
		int[] chkArr = {2,3,4,5,6,7,0,8,9,2,3,4,5};
		
		Scanner sc = new Scanner(System.in);
		System.out.println("주민번호를 입력하세요:");
		String jumin = sc.next(); // 971226-1234567
		int sum = 0;
		
		// 9 7 1 2 2 6 - 1 2 3 4 5 6 7
		//*2 3 4 5 6 7   8 9 2 3 4 5 마지막 번호는 검증용 번호
		//18 + 21 ..........           총합계 구하기 
		//122
		//11로 나눈 나머지 값 구하기 ex) 0~10
		// 11 - 나머지 결과값 구하기 
		//나머지 값을 검증용 번호와 일치하는지 확인 1 == 7  
		//만약 나머지 값이 두자리 수라면 
		//나머지 값을 다시 10으로 나눈 나머지 값을 구한다.
		//나머지 값을 검증용 번호와 일치하는지 확인 
		
		
		
		for(int i = 0; i<jumin.length()-1; i++) {
			if(i==6) {
				continue;
			}
			sum += chkArr[i] * Integer.parseInt(jumin.substring(i, i+1));
			
			
			
		}int nam =11 -sum % 11;
		
		if(nam>=10) {
			nam =nam % 10;
		}
		
		
		
		System.out.println(nam);
		System.out.println(jumin.substring(13));
		
		
	
		if(nam == Integer.parseInt(jumin.substring(13))){
			System.out.println("정상적인 주민번호입니다.");
			
		}else {
			System.out.println("주민센터 방문");
		}
	}

}
