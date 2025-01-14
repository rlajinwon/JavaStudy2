package com.winter.app.location;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

import com.winter.app.utils.DBConnection;

public class LocationDAO {

	// 1. 접속 정보 선언 
	
		// 2. connection
		
		// 3. SQL문 선언
		
		// 4. 미리 보내기
		
		// 5. ? ? 
		
		// 6. 최종 전송 및 결과 처리
		
		// 7. 연결 해제
	
	
	public void getDetail() throws Exception {
		
		Connection connection = DBConnection.getConnection();
		
		String sql = "SELECT * FROM LOCATIONS WHERE LOCATION_ID = 1000";
		
		PreparedStatement st = connection.prepareStatement(sql);
		
		ResultSet rs = st.executeQuery();
		
		if(rs.next()) {
			System.out.println(rs.getString("CITY"));
			
		}else{
			System.out.println("data X");
			
			
			
		}

		DBConnection.disCoonnect(rs, st, connection);

		
		
	}
	
}
