package com.day4.collections;

import java.util.HashMap;
import java.util.Map;

public class HashMapExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		HashMap<Integer, String> hm=new HashMap<Integer, String>();
		
		hm.put(1, "java");
		hm.put(2, "python");
		hm.put(3, "oracle");
		hm.put(4, "Mysql");
		hm.put(5, "jquery");
		
		for(int i=1;i<hm.size();i++) {
			System.out.println("Key "+i+" "+hm.get(i));
		}
		for(Map.Entry<Integer, String>e:hm.entrySet()) {
			System.out.println("key: "+e.getKey()+" value: "+e.getValue());
		}
	}

}
