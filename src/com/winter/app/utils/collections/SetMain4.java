package com.winter.app.utils.collections;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Random;

public class SetMain4 {

	public static void main(String[] args) {

		Random random = new Random();
		
		
		HashSet<Integer> hashset = new HashSet<>();
		
		while(hashset.size()<6) {			
			int num = random.nextInt(45)+1;
			hashset.add(num);
			
		}System.out.println(hashset);
		
	}
}
