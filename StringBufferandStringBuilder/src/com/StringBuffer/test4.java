package com.StringBuffer;

//1. reverse string
//2.check palindrome or not
public class test4 {

	public static String reverse(String str) {
        char[] s = str.toCharArray();
        String rev = "";
        for (int i = str.length() - 1; i >= 0; i--) {
            System.out.print(s[i] + " "); 
            rev += s[i];
        }
        System.out.println();
        return rev;
    }

    public static void main(String[] args) {
        String str = "java";
        String temp = str;
        String reversedStr = reverse(str);
        if (reversedStr.equals(temp))
            System.out.println("palindrome");
        else 
            System.out.println("not palindrome");
    }
}
