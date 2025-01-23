package com.winter.app;

import com.winter.app.departments.DepartmentController;
import com.winter.app.departments.DepartmentDAO;
import com.winter.app.location.LocationController;
import com.winter.app.location.LocationDAO;
import com.winter.app.tests.DepartmentDAOTest;
import com.winter.app.utils.*;


public class AppMain {

	public static void main(String[] args) {

		System.out.println("프로그램 실행");
		
//		
//		FrontController fc = new FrontController();
//		
//		
//
//		fc.start();
		
		DepartmentDAOTest daoTest = new DepartmentDAOTest();
		
		try {
			daoTest.getNameTest();
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
		
	}

}
