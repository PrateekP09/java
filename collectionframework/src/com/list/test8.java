package com.list;

import java.util.Vector;

public class test8 {

	public static void main(String[] args) {
		Vector<Integer> vector = new Vector<>();
		for(int i=0; i<=10;i++) {
			vector.add(i);)
		}
		System.out.println(vector);
		
		for(int i=0;i<vector.size();i++) {
			System.out.println(vector.get(i));
		}
		
		vector.set(2,200);
		System.out.println(vector);
		
		vector.remove(2);
		System.out.println(vector);
	}

}
