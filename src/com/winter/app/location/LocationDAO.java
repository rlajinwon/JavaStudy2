package com.winter.app.location;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

import com.winter.app.departments.DepartmentDTO;
import com.winter.app.utils.DBConnection;

public class LocationDAO {

	// 1. 접속 정보 선언 
	
		// 2. connection
		
		// 3. SQL문 선언
		
		// 4. 미리 보내기
		
		// 5. ? ? 
		
		// 6. 최종 전송 및 결과 처리
		
		// 7. 연결 해제
	
	
	public List<LocationDTO> getList() throws Exception{
		Connection con = DBConnection.getConnection();
		
		String sql ="SELECT * FROM DEPARTMENTS ORDER BY 2 DESC";
		PreparedStatement st = con.prepareStatement(sql);
		ResultSet rs = st.executeQuery();
		
		List<LocationDTO> ar = new ArrayList<>();
		
		while(rs.next()) {
			LocationDTO locationDTO = new LocationDTO();
			locationDTO.setLOCATION_ID(rs.getInt("LOCATION_ID"));
			locationDTO.setSTREET_ADDRESS(rs.getString("STREET_ADDRESS"));
			locationDTO.setPOSTAT_CODE(rs.getString("POSTAT_CODE"));
			locationDTO.setCITY(rs.getString("CITY"));
			locationDTO.setSTATE_PROVINCE(rs.getString("STATE_PROVINCE"));
			locationDTO.setCOUNTRY_ID(rs.getString("COUNTRY_ID"));
			ar.add(locationDTO);
		}
		
		DBConnection.disCoonnect(rs, st, con);
		
		
		return ar;
		
	}
	
	
	
	public LocationDTO getDetail() throws Exception {
		
		LocationDTO locationDTO = null;
		
		Connection connection = DBConnection.getConnection();
		
		String sql = "SELECT * FROM LOCATIONS WHERE LOCATION_ID = 1000";
		
		
		PreparedStatement st = connection.prepareStatement(sql);
		
		
		
		ResultSet rs = st.executeQuery();
		
		if(rs.next()) {
			locationDTO = new LocationDTO();
			locationDTO.setLOCATION_ID(rs.getInt("LOCATION_ID"));
			locationDTO.setSTREET_ADDRESS(rs.getString("STREET_ADDRESS"));
			locationDTO.setPOSTAT_CODE(rs.getString("POSTAT_CODE"));
			locationDTO.setCITY(rs.getString("CITY"));
			locationDTO.setSTATE_PROVINCE(rs.getString("STATE_PROVINCE"));
			locationDTO.setCOUNTRY_ID(rs.getString("COUNTRY_ID"));
			
		
			
			
		}
		DBConnection.disCoonnect(rs, st, connection);
		
		return locationDTO;
		
		
	}
	
}
