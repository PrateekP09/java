package com.StringBuffer;

public class test7 {
// given 2 strings s1 and s2, The task is to find if s1 is substring of s2.if yes, return the index of first occurance, else return-1. input:s1="for", s2="abcforxyz"
	public static int findSubstring(String S1, String S2) {
		return S2.indexOf(S1);
	}
	public static void main(String[] args) {
		String S1 = "for";
		String S2 = "abcforxyz";

		int index = findSubstring(S1, S2);

		if (index != -1) {
			System.out.println("Substring found at index: " + index);
		} else {
			System.out.println("-1");
		}
	}
}
