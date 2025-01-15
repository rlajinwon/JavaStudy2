package com.winter.app.departments;

import java.util.List;
import java.util.Scanner;

public class DepartmentController {

	
	private DepartmentService departmentService;
	private DepartmentsView departmentsView;
	
	public DepartmentController() {
		departmentService = new DepartmentService();
		departmentsView = new DepartmentsView();
		
		
	}
	
	
	public void start() throws Exception{
		Scanner sc = new Scanner(System.in);
		boolean check = true;
		
		while(check) {
			System.out.println("1. 부서 리스트 출력");
			System.out.println("2. 부서 상세정보 출력");
			System.out.println("3. 종료 ");
			int select = sc.nextInt();
			if(select == 1) {
			List<DepartmentDTO> ar	= departmentService.getList();
			departmentsView.view(ar);
				
			}else if(select ==2) {
				DepartmentDTO departmentDTO = departmentService.getDetail(sc);
				
				if(departmentDTO != null) {
					departmentsView.view(departmentDTO);
				}else {
					departmentsView.view("없는 부서입니다.");
				}
				
			}else {
				break;
			}
		}
	}
	
	
}
