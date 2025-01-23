package com.winter.app.ztest;

import java.util.List;

import com.winter.app.users.UserDAO;
import com.winter.app.users.UserDTO;

public class UserDAOTest {
	
	private UserDAO userDAO;
	
	public UserDAOTest() {
		//생성자를 통한 객체 생성???
		this.userDAO = new UserDAO();
	}
	
	public void UserDAOJoinTest() throws Exception{
		
		UserDTO userDTO = new UserDTO();
		userDTO.setUserName("testuser3");
		userDTO.setPassWord("test");
		userDTO.setName("test");
		userDTO.setPhone("12345678");
		userDTO.setEmail("gg@naver.com");
		
		
		int result = userDAO.join(userDTO);
		
		if(result == 1) {
			System.out.println("테스트 통과");
		}else {
			System.out.println("테스트 실패");
		}
		
	}
	
	public void userDAOListTest() throws Exception{
		
		
		List<UserDTO> us = userDAO.getList();
		
		if(us.size()>0) {
			System.out.println("테스트 성공");
		}else {
			System.out.println("테스트 실패");
		}
		
		
	}
	
	public void DetailTest() throws Exception{
		
	UserDTO userDTO = new UserDTO();	
	userDTO.setUserName("testuser");
	userDTO = userDAO.getDetail(userDTO);
	
	
	if(userDTO != null) {
		System.out.println("통과");
	}else {
		System.out.println("실패");
	}
	}
	
	

		
		
		
	}
	
	
	
	
	
	
	
	
	
	
	


