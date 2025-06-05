package com.set;

import java.util.Set;
import java.util.HashSet;

public class test2 {

	public static void main(String[] args) {
		Set<Integer> set1 = new HashSet<>();
		Set<Integer> set2 = new HashSet<>();
		
		int arr[]= {1,2,3,4};
		int arr1[]= {5,2,3,4};
		
		for(int ele:arr) {
			set1.add(ele);
		}
		for (int ele:arr1) {
			set2.add(ele);
		}
		System.out.println(set1);
		System.out.println(set2);
		
		//set1.addAll(set2);
		//System.out.println(set1);
		//set1.removeAll(set2);
		//System.out.println(set2);
		
		set1.retainAll(set2);
		System.out.println(set1);
	}

}
