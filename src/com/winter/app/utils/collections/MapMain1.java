package com.winter.app.utils.collections;

import java.util.HashMap;
import java.util.Iterator;

public class MapMain1 {

	public static void main(String[] args) {
		
//		List, Set => Collection
		
		//Map 
		HashMap<String, Integer> map = new HashMap<>();
		// 추가 put 
		map.put("k9", 999);
		map.put("k8", 888);
		map.put("k7", 777);
		
		map.put("k9", 1000);
		
		System.out.println(map);
		System.out.println(map.size());
		System.out.println(map.get("k9"));
		System.out.println(map.containsKey("k7"));
		System.out.println(map.get("k5"));
		
		
		Iterator<String> keys = map.keySet().iterator();
		
		while(keys.hasNext()) {
			String k = keys.next();
			System.out.println("key: "+ k);
			Integer v = map.get(k);
			System.out.println("value: "+ v);
			
			
		}
	
	}
	
}
