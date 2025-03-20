package co.controlstatements;

import java.util.Scanner;

public class test9 {
 
	public static String character(char a) {
		
		if(a=='a'||a=='e'||a=='i'||a=='o'||a=='u') return "vowel";
		else  return "consonent";
		
	}
	public static void main(String[] args) {
		char a,e, i, o, u;
Scanner sc= new Scanner(System.in);
System.out.println("enter the character");
    a=sc.next().charAt(0);
	}

}
