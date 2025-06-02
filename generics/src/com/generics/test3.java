package com.generics;

import java.util.Arrays;
import java.util.List;

public class test3 {

	public <T> void print(List<T> list) {
		System.out.println(list);
	}
	public static void main(String[] args) {
		List<Integer> list = Arrays.asList(1,2,3,4);
		test3 Obj = new test3();
		obj.print(list);
		
		List<String> list2 = Arrays.asList("hello", "hi");
		obj.print(list2);
		
		List<Double> list3 =Arrays.asList("10.5","12.8");
	}

}
