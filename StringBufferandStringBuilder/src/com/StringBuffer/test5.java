package com.StringBuffer;

import java.util.Scanner;
// count no of vowels in the string
public class test5 {

	
		public static int countVowel(String s) {
			int vowelCount = 0;
			for (int i = 0; i < s.length(); i++) {
				char ch = s.charAt(i);
				if (ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u' || ch == 'A' || ch == 'E' || ch == 'I'
						|| ch == 'O' || ch == 'U')
					vowelCount++;
			}
			return vowelCount; // Return the total count
		}

		public static void main(String[] args) {
			String str = "Hello World! This is a Test String.";
			int vowels = countVowel(str);

			System.out.println(str);
			System.out.println("Number of vowels: " + vowels);
		}
	}