package org.javatutorials.collections;

import java.util.List;
import java.util.ArrayList;

public class MyArrayList {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<String> ls = new ArrayList<>();
		
		ls.add("One");
		ls.add("Two");
		
		for(String s: ls){
			System.out.println(s);
		}

	}

}
