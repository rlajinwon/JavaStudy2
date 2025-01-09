package com.winter.app.utils.collections;

import java.util.ArrayList;
import java.util.HashSet;

public class SetMain2 {

	public static void main(String[] args) {
		
		Member m1 = new Member();
		
		m1.setName("winter");
		m1.setAge(26);
		
		Member m2 = new Member();
		m2.setName("iu");
		m2.setAge(24);
		
		ArrayList<Member> list = new ArrayList<>();
		
		list.add(m1);
		list.add(m2);
		
		HashSet<Member> hashset = new HashSet<>();
		
		hashset.add(m1);
		hashset.add(m2);
		
		
		Member m3 = new Member();
		m3.setName("winter");
		m3.setAge(26);
		
		list.add(m1);
		hashset.add(m1);
		
		System.out.println(list.size());
		System.out.println(hashset.size());
		
		
		System.out.println(list.contains(m1));
		System.out.println(hashset.contains(m1));
		
		
	}
	
}
