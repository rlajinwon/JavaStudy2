package com.winter.app.countries;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

import com.winter.app.utils.DBConnection;

public class CountrieDAO {

	
	public void getList() throws Exception{
		
		Connection con = DBConnection.getConnection();
		
		String sql ="SELECT * FROM COUNTRIES ORDER BY 2 DESC";
		PreparedStatement st = con.prepareStatement(sql);
		ResultSet rs = st.executeQuery();
		while(rs.next()) {
		
			System.out.println(rs.getInt("COUNTRY_ID"));
		}
		
		DBConnection.disCoonnect(rs, st, con);
		
		
		
		
	}
	
	
	
	public void getDetail() throws Exception {
		
		Connection connection = DBConnection.getConnection();
		
		String sql = "SELECT * FROM COUNTRIES WHERE COUNTRY_ID = AR";
		
		PreparedStatement st = connection.prepareStatement(sql);
		
		ResultSet rs = st.executeQuery();
		
		if(rs.next()) {
			System.out.println(rs.getString("COUNTRY"));
			
		}else{
			System.out.println("data X");
			
			
			
		}
		DBConnection.disCoonnect(rs, st, connection);

		
		
	}
	
}

