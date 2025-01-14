package com.winter.app.departments;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

import com.winter.app.utils.DBConnection;

public class DepartmentDAO {

	// DAO - > Data Access Object
	// DB의 Data 조회 하거나 입력 수정 삭제 기능 
	
	// 1. 접속 정보 선언 
	
	// 2. connection
	
	// 3. SQL문 선언
	
	// 4. 미리 보내기
	
	// 5. ? ? 
	
	// 6. 최종 전송 및 결과 처리
	
	// 7. 연결 해제
	
	
	
	public void getList() throws Exception{


		Connection con = DBConnection.getConnection();
		String sql = "SELECT * FROM DEPARTMENTS ORDER BY 2 DESC";
		PreparedStatement st = con.prepareStatement(sql);
		ResultSet rs = st.executeQuery();
		
		while(rs.next()) {
			System.out.println(rs.getString("DEPARTMENT_NAME"));
		}
		
		DBConnection.disCoonnect(rs, st, con);
		
		
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	public void getDetail() throws Exception {
		
		Connection connection = DBConnection.getConnection();
		
		String sql ="SELECT * FROM DEPARTMENTS WHERE DEPARTMENT_ID = 10";
		
		PreparedStatement st = connection.prepareStatement(sql);
		
		ResultSet rs = st.executeQuery();
		
		if(rs.next()) {
			System.out.println(rs.getString("DEPARTMENT_NAME"));
		}else {
			System.out.println("data 없음");
		}
	
		DBConnection.disCoonnect(rs, st, connection);
		
		
	}
		
	
	
}
