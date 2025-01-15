package com.winter.app.location;

import java.util.List;
import java.util.Scanner;

import com.winter.app.departments.DepartmentDTO;

public class LocationService {
	
	private LocationDAO locationDAO = new LocationDAO();
	
	public LocationService(){
		locationDAO = new LocationDAO();
		
	}
	
	
	
	
	public List<LocationDTO> getList() throws Exception{
		 List<LocationDTO> ar = locationDAO.getList();
		
		return ar;
	}
	
	
	
	
	public LocationDTO getDetail(Scanner sc) throws Exception{
		System.out.println("조회할 부서 번호 입력");
		LocationDTO locationDTO = new LocationDTO();
		
		locationDTO.setLOCATION_ID(sc.nextInt());
		
		locationDTO = locationDAO.getDetail();
		
		return locationDTO;
	}
}



