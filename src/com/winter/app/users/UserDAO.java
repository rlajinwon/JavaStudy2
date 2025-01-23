package com.winter.app.users;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

import com.winter.app.utils.DBConnection;

public class UserDAO {

	
	// 1. 가입(추가) join  // 
	
	
	public int join(UserDTO userDTO) throws Exception{
		
		Connection connection = DBConnection.getConnection();
		String sql = "INSERT INTO USERS VALUES(?,?,?,?,?)";
		PreparedStatement st = connection.prepareStatement(sql);
		
		st.setString(1, userDTO.getUserName());
		st.setString(2, userDTO.getPassWord());
		st.setString(3, userDTO.getName());
		st.setString(4, userDTO.getPhone());
		st.setString(5, userDTO.getEmail());
		
		int result = st.executeUpdate();
		
		DBConnection.disConnect(st, connection);
		
		return result;
		
	}
	
	
	
	// 2. 회원들의 목록을 조회, 단, password는 빼고 나머지 회원들의 모든 정보 getList
	public List<UserDTO> getList() throws Exception{
		// Connection 연결
		Connection con = DBConnection.getConnection();
		// sql 넣기
		String sql = "SELECT USERNAME,NAME,PHONE,EMAIL FROM USERS ";
		//미리 전송하기
		PreparedStatement st = con.prepareStatement(sql);
		// ? 값 세팅 
		// 최종 전송
		ResultSet rs = st.executeQuery();
		
		// list 객체를 while문 밖에서 생성
		List<UserDTO> us = new ArrayList<>();
		
		
		while(rs.next()) {
			
			UserDTO userDTO = new UserDTO();
			userDTO.setUserName(rs.getString("USERNAME"));
			userDTO.setName(rs.getString("NAME"));
			userDTO.setPhone(rs.getString("PHONE"));
			userDTO.setEmail(rs.getString("EMAIL"));
			us.add(userDTO);
		}
		
		
		// db 연결 끊기 
		DBConnection.disConnect(rs, st, con);
		
		return us;
	}
	
	
	// 회원의 id로 회원 한명의 모든 정보를 조회 getDetail 
	
	// id와 일치하는 회원의 정보 조회
	
	public UserDTO getDetail(UserDTO userDTO) throws Exception{              //매개변수로 받아오기 
		
		
		Connection con = DBConnection.getConnection();
		
		String sql = "SELECT * FROM USERS WHERE USERNAME = ? " ;
		
		PreparedStatement st = con.prepareStatement(sql);
		
		st.setString(1,userDTO.getName());
		
		ResultSet rs = st.executeQuery();

		userDTO = null;
		
		if(rs.next()) {
			userDTO = new UserDTO();
			userDTO.setUserName(rs.getString("USERNAME"));
			userDTO.setPassWord(rs.getString("PASSWORD"));
			userDTO.setName(rs.getString("NAME"));
			userDTO.setPhone(rs.getString("PHONE"));
			userDTO.setEmail(rs.getString("EMAIL"));
			
		}
		
		
		
		
		DBConnection.disConnect(rs, st, con);
		
		return userDTO;
	}
	
	
	
	
	
	
	
	
	
	
}
