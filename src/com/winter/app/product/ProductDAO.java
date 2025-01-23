package com.winter.app.product;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

import com.winter.app.utils.DBConnection;

public class ProductDAO {

	public int add(ProductDTO productDTO) throws Exception{
		
		Connection con = DBConnection.getConnection();
		
		String sql = "INSERT INTO PRODUCTS VALUES(?,?,?,?,?)" ;
		
		PreparedStatement st = con.prepareStatement(sql);
		
		st.setLong(1, productDTO.getProductNum());
		st.setString(2, productDTO.getProductName());
		st.setDouble(3, productDTO.getProductRate());
		st.setDate(4, productDTO.getProductDate());
		st.setString(5, productDTO.getProductDetail());
		
		int result = st.executeUpdate();
		
		
		DBConnection.disConnect(st, con);
		
		return result;
		
		
		
	}
	
	public List<ProductDTO> getList() throws Exception{
		
		Connection con = DBConnection.getConnection();
		
		String sql = "SELECT * FROM PRODUCTS";
		
		PreparedStatement st = con.prepareStatement(sql);
		
		ResultSet rs = st.executeQuery();
		
		List<ProductDTO> ar = new ArrayList<>();
		
		while(rs.next()) {
			ProductDTO productDTO = new ProductDTO();
			
			productDTO.setProductNum(rs.getLong("PRODUCTNUM"));
			productDTO.setProductName(rs.getString("PRODUCTNAME"));
			productDTO.setProductRate(rs.getDouble("PRODUCTRATE"));
			productDTO.setProductDate(rs.getDate("PRODUCTDATE"));
			productDTO.setProductDetail(rs.getString("PRODUCTDETAIL"));
			
			ar.add(productDTO);
		}
		
		DBConnection.disConnect(rs, st, con);
		return ar;
		
		
		
	}
	

	public ProductDTO selDetail(ProductDTO productDTO) throws Exception{

		Connection con = DBConnection.getConnection();
		
		String sql = "SELECT * FROM PRODUCTS WHERE PRODUCTNAME = ?" ;
		
		PreparedStatement st = con.prepareStatement(sql);
		
		st.setString(1,productDTO.getProductName());

		ResultSet rs = st.executeQuery();
		
		
		
		productDTO = null;
		
		if(rs.next()) {
			productDTO = new ProductDTO();
			productDTO.setProductNum(rs.getLong("PRODUCTNUM"));
			productDTO.setProductName(rs.getString("PRODUCTNAME"));
			productDTO.setProductRate(rs.getDouble("PRODUCTRATE"));
			productDTO.setProductDate(rs.getDate("PRODUCTDATE"));
			productDTO.setProductDetail(rs.getString("PRODUCTDETAIL"));
			
		}
		
		
		DBConnection.disConnect(rs, st, con);
		return productDTO;
		
		
		
	}
	
	public int ratesujung(ProductDTO productDTO) throws Exception{
		
		
		Connection con = DBConnection.getConnection();
		
		String sql = "UPDATE PRODUCTS SET PRODUCTRATE = ? WHERE PRODUCTNAME = ? " ;
		
		PreparedStatement st = con.prepareStatement(sql);
		
		st.setDouble(1, productDTO.getProductRate());
		st.setString(2, productDTO.getProductName());
		
		int result = st.executeUpdate();
		
		
		DBConnection.disConnect(st, con);
		
		return result;
		
		
		
		
		
	}
	
}
