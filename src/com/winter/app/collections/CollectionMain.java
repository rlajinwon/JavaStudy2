package com.winter.app.collections;

public class CollectionMain {

	public static void main(String[] args) {

		StudyStack ss = new StudyStack();
	
		ss.add(1);
		ss.info();
		
		ss.add(2);
		ss.info();
		
		
		int n = ss.pop();
		
		System.out.println("pop : " + n );
	}

}
