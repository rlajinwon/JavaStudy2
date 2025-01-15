package com.winter.app.location;

import java.util.List;

import com.winter.app.departments.DepartmentDTO;

public class LocationView {

	public void view(String message) {
		System.out.println(message);
		
	}
	
	
	
	
	public void view(LocationDTO locationDTO) {

			System.out.println("부서번호\t부서명\t관리자\t지역아이디");
			System.out.print(locationDTO.getLOCATION_ID()+"\t");
			System.out.print(locationDTO.getSTREET_ADDRESS()+"\t");
			System.out.print(locationDTO.getPOSTAT_CODE()+"\t");
			System.out.println(locationDTO.getCITY()+"\t");
			System.out.println(locationDTO.getSTATE_PROVINCE()+"\t");
			System.out.println(locationDTO.getCOUNTRY_ID()+"\t");
	}
	public void view(List<LocationDTO> ar) {
		System.out.println("부서번호\t부서명\t관리자\t지역아이디");
		
		for(LocationDTO locationDTO:ar) {
			System.out.print(locationDTO.getLOCATION_ID()+"\t");
			System.out.print(locationDTO.getSTREET_ADDRESS()+"\t");
			System.out.print(locationDTO.getPOSTAT_CODE()+"\t");
			System.out.println(locationDTO.getCITY()+"\t");
			System.out.println(locationDTO.getSTATE_PROVINCE()+"\t");
			System.out.println(locationDTO.getCOUNTRY_ID()+"\t");
		
	}
	
	
}

}