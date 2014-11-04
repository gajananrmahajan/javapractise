package org.javatutorials.collections;

import java.util.HashMap;
import java.util.Map;

public class MapTest {

	private static void fillData(Map<Integer, String> mp){
		mp.put(1, "One");
		mp.put(2, "Two");
		mp.put(3, "Three");
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Map<Integer, String> mp = new HashMap<>();
		fillData(mp);
	

		for(Integer key: mp.keySet()){
			System.out.println(key + ": " + mp.get(key));
		}
	}

}
