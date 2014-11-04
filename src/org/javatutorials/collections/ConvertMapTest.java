package org.javatutorials.collections;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class ConvertMapTest {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Map<Integer, String> mp = new HashMap<>();
		
		mp.put(1, "One");
		mp.put(2, "Two");
		mp.put(3, "Three");
		
		List<Integer> keys = getKeys(mp);
		
		List<String> values = getValues(mp);
		
		for(Integer key: keys){
			System.out.println(key);
		}
		
		for(String value: values){
			System.out.println(value);
		}

	}
	
	private static List<Integer> getKeys(Map<Integer, String> mp){
		List<Integer> keys = new ArrayList<>();
		
		for(Integer key: mp.keySet()){
			keys.add(key);
		}
		return keys;
	}
	
	private static List<String> getValues(Map<Integer, String> mp){
		List<String> values = new ArrayList<>();
		
		for(Integer key: mp.keySet()){
			values.add(mp.get(key));
		}
		return values;
	}

}
