package com.winter.app.ztest;

import java.sql.Date;
import java.util.List;

import com.winter.app.product.ProductDAO;
import com.winter.app.product.ProductDTO;
import com.winter.app.users.UserDTO;

public class ProductDAOTest {
	
	
	private ProductDAO productDAO;
	
	public ProductDAOTest() {
	
		this.productDAO = new ProductDAO();
	}
	
//
//	public void productDAOAddTest() throws Exception{
//	
//		ProductDTO productDTO = new ProductDTO();
//		
//		productDTO.setProductNum();
//		productDTO.setProductName("aaaaa");
//		productDTO.setProductDate();
//		productDTO.setProductRate(3.14);
//		productDTO.setProductDetail("aaaaaaa");
//		
//		
//		
//		
//		
//	}
	
	
	public void getListTest() throws Exception{
	List<ProductDTO> as = productDAO.getList();
		
		if(as.size()>0) {
			System.out.println("테스트 성공");
		}else {
			System.out.println("테스트 실패");
		}
		
		
		
		
	}
	
	public void getDetailTest() throws Exception{
		
		ProductDTO productDTO = new ProductDTO();	
		productDTO.setProductName("GGGG");
		productDTO = productDAO.selDetail(productDTO);
		
		
		if(productDTO != null) {
			System.out.println("통과");
		}else {
			System.out.println("실패");
			
		}
		}
	
	
	public void rateTest() throws Exception{
		ProductDTO productDTO = new ProductDTO();
		productDTO.setProductRate(12.12);
		productDTO.setProductName("GGGG");
		
		int result = productDAO.ratesujung(productDTO);
		
		
		if(result == 1) {
			System.out.println("통과");
		}else {
			System.out.println("실패");
		}
		
		
		
		
		
		
	}
		
	
	
	

	}


