package com.set;

import java.util.LinkedHashSet;

public class test3 {

	public static void main(String[] args) {
		LinkedHashSet<String> linkedHashSet = new LinkedHashSet<>();
		linkedHashSet.add("prateek");
		linkedHashSet.add("rithwik");
		linkedHashSet.add("Dboss");
		
		System.out.println(linkedHashSet);
		linkedHashSet.add(null);
		System.out.println(linkedHashSet);
	}

}
