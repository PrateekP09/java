package com.set;

import java.util.Collections;
import java.util.TreeSet;

public class test4 {

	public static void main(String[] args) {
		TreeSet<String> treeSet = new TreeSet<>(Collections.reverseOrder());// output comes in descending order after using reverse
		treeSet.add("prateek");
		treeSet.add("rithwik");
		treeSet.add("Dboss");
		System.out.println(treeSet);
		
		treeSet.add(null);
	}

}
