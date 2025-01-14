package com.winter.app.utils;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

public class DBConnection {

	// DB에 접속 
	
	public static Connection getConnection() throws Exception{
		System.out.println("DB 접속");
		String username = "hr";
		String password = "hr";
		String url = "jdbc:oracle:thin:@3.39.239.250:1521:xe";
		String driver ="oracle.jdbc.driver.OracleDriver";
		
		
		
		//1. driver 를 메모리에 로딩(객체 생성)
			Class.forName(driver);
			
			//2.DB에 연결
			Connection connection = DriverManager.getConnection(url, username, password);
			
			
			return connection;
		
	}
	public static void disCoonnect(ResultSet rs, PreparedStatement st, Connection con) throws Exception{
		rs.close();
		st.close();
		con.close();
		
	}
	
	
}
