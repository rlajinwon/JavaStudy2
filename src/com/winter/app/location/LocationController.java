package com.winter.app.location;

import java.util.List;
import java.util.Scanner;

import com.winter.app.departments.DepartmentDTO;

public class LocationController {

	private LocationDAO locationDAO;
	private LocationDTO locationDTO;
	private LocationView locationView;
	private LocationService locationService;
	
	
	public LocationController() {
		locationDAO = new LocationDAO();
		locationDTO = new LocationDTO();
		locationView = new LocationView();
		locationService = new LocationService();
	}
	
	
	public void start() throws Exception {
		Scanner sc = new Scanner(System.in);
		boolean check = true;
		
		while(check) {
			System.out.println("1.리스트 출력");
			System.out.println("2. 상세 정보 출력");
			System.out.println("3. view 출력");
			System.out.println("3. 종료");
			
			int select = sc. nextInt();
			if(select ==1) {
				List<LocationDTO> ar = locationService.getList();
				locationView.view(ar);
				
			}else if(select ==2){
				locationDAO.getDetail();
				
				if(locationDTO != null) {
					locationView.view(locationDTO);
				}else {
					locationView.view("없는 부서입니다.");
					
				}
				
				
			}else {
				System.out.println("종료");
				break;
			}
		}
		
	}
	
	
	
}
