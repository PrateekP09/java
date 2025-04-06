package co.controlstatements;

import java.util.Scanner;

public class test6 {
	 public static String evenorodd(int a) {
		 if(a%2==0) return "even";
		 else
			 return "odd";
		 
	 }
	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
		System.out.println("enter a number");
		int number= sc.nextInt();
		System.out.println(evenorodd(number));
	}
		
}
