package com.winter.app.langs;

import java.util.Scanner;

public class Study2String5 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		String name1 = "iu";
		String name2 = "iu";
		String name3 = new String("iu");
		String name4 = sc.next();
		
		System.out.println(name1);
		System.out.println(name2);
		System.out.println(name3);
		
		System.out.println(name1==name2);
		System.out.println(name1==name3);
		System.out.println(name1==name4);
		System.out.println(name3==name4);
	}
	
}
