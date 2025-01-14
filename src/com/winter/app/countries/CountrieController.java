package com.winter.app.countries;

import java.util.Scanner;

import com.winter.app.location.LocationDAO;

public class CountrieController {
	private CountrieDAO countrieDAO;
	
	
	public CountrieController() {
		countrieDAO = new CountrieDAO();
	}
	
	
	public void start() throws Exception {
		Scanner sc = new Scanner(System.in);
		boolean check = true;
		
		while(check) {
			System.out.println("1.나라 리스트 출력");
			System.out.println("2. 나라 정보 출력");
			System.out.println("3. 종료");
			
			int select = sc. nextInt();
			
			if(select ==1) {
				countrieDAO.getList();
			}else if(select ==2){
				countrieDAO.getDetail();
			}else {
				System.out.println("종료");
				break;
			}
		}
		
	}
	
	
	
}
