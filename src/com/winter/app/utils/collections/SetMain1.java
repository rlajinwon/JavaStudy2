package com.winter.app.utils.collections;

import java.util.ArrayList;
import java.util.HashSet;

public class SetMain1 {

	public static void main(String[] args) {
		
		ArrayList<Integer> list = new ArrayList<>();
		
 		HashSet<Integer> hashset = new HashSet<>();
		
 		list.add(10);
 		list.add(2);
 		list.add(1);
 
 		
		boolean check =hashset.add(1);

		hashset.add(20);
		hashset.add(20);
		
		
		
		System.out.println(list);
		System.out.println(hashset);
		
	}
}
