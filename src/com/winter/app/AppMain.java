package com.winter.app;

import com.winter.app.departments.DepartmentDAO;
import com.winter.app.location.LocationDAO;
import com.winter.app.utils.*;


public class AppMain {

	public static void main(String[] args) {

		System.out.println("프로그램 실행");
		
		

		DepartmentDAO departmentDAO = new DepartmentDAO();
		
		LocationDAO locationDAO = new LocationDAO();
		
		try {
			
			departmentDAO.getList();
			
		} catch (Exception e) {
			
			e.printStackTrace();
		}
		
		
		
		
		
		
		
		System.out.println("프로그램 종료");
		
		
	}

}
