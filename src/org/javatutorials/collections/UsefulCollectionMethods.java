package org.javatutorials.collections;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class UsefulCollectionMethods {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<Integer> ls1 = new ArrayList<>();
		List<Integer> ls2 = new ArrayList<>();
		
		ls1.add(1);
		ls1.add(2);
		ls1.add(3);
		
		ls2.add(4);
		ls2.add(5);
		
		System.out.println("ls1 before:");
		
		for(Integer item: ls1){
			System.out.println(item);
		}
		
		Collections.copy(ls1, ls2);
		
		System.out.println("ls1 after copy:");
		
		for(Integer item: ls1){
			System.out.println(item);
		}
		
		System.out.println("ls1 after reverse:");
		
		Collections.reverse(ls1);
				
		for(Integer item: ls1){
			System.out.println(item);
		}
		
		System.out.println("ls1 after shuffle:");
		
		Collections.shuffle(ls1);
		
		for(Integer item: ls1){
			System.out.println(item);
		}
		
		System.out.println("ls1 after sort:");
		Collections.sort(ls1);
		
		for(Integer item: ls1){
			System.out.println(item);
		}
	}

}
