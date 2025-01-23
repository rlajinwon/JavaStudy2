package com.winter.app.utils;

import java.sql.Connection;
import java.sql.DriverManager;

public class DBConnection {
	

	//Connection
	public static Connection getConnection() throws Exception{
		
	//1.연결 정보

	String user ="user01"; // 유저이름
	String password = "user01";	//유저비밀번호
	String url = "jdbc:oracle:thin:@15.164.164.21:1521:xe";		
	String driver = "oracle.jdbc.driver.OracleDriver";		
	
	
	//2. 드라이버 로딩
	Class.forName(driver); //드라이버를 메모리에 로딩 (객체생성)
	
	//3. Connection 연결 후 리턴
	
	return DriverManager.getConnection(url,user,password);
	
	
	}
	
}
