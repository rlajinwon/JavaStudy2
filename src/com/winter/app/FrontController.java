package com.winter.app;

import java.util.Scanner;

import com.winter.app.countries.CountrieController;
import com.winter.app.departments.DepartmentController;
import com.winter.app.location.LocationController;

public class FrontController {

	private DepartmentController departmentController;
	private LocationController locationController;
	private CountrieController countrieController;
	
	public FrontController() {
		departmentController = new DepartmentController();
		locationController = new LocationController();
		countrieController = new CountrieController();
	}

	public void start() {
		Scanner sc = new Scanner(System.in);
		
		boolean check = true;
		
	
		while(check) {
			try {
			System.out.println("1 부서 관리");
			System.out.println("2 지역 관리");
			System.out.println("3 나라 관리");
			System.out.println("3 종료");
			int select = sc.nextInt();
			if(select == 1) {
				departmentController.start();
				
			}else if(select == 2) {
				locationController.start();
			}else if(select == 3) {
				countrieController.start();
			}else {
				
				break;
			
			}
			
			}catch (Exception e) {
				e.printStackTrace();
			}
			
			
		}
		
		
	}
	
	
}
