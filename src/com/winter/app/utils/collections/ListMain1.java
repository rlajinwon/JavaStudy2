package com.winter.app.utils.collections;

import java.util.ArrayList;

public class ListMain1 {

	public static void main(String[] args) {
		ArrayList ar = new ArrayList();
		
		ar.add(1);
		ar.add('2');
		ar.add("Three");
		ar.add(true);
		
		
		ar.add(1, "hello");  // 해당 index 에 끼워넣고 나머지는 한칸씩 밀린다 .  
		
		
		ar.set(1, "world"); // 해당 index 수정 
		
		ar.remove(1); // 해당 index 값 삭제

		boolean check =ar.contains(1);
		
		
//		ar.clear(); // 모든 요소 삭제 
		
		
		
//		System.out.println(ar.get(0));
		//ArrayList
	
		for(int i=0; i<ar.size();i++) {
			System.out.println(ar.get(i));
			
		}
		
//		//향상된 for문
//		for(꺼낼데이터 타입명 변수명 : collection 변수명) {
//			
//		}
//		
		int [] nums = {2,3,4,5};
		for(int num:nums) {
			System.out.println(num);
		}
		
		
	}


		
		
		
	
}
