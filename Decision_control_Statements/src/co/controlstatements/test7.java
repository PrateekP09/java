package co.controlstatements;

import java.util.Scanner;

public class test7 {
	 
	public static String positivenegativeorzero(int a) {
		if(a>0) return "positve";
		else if(a<0) return "negative";
		else if(a==0) return "zero";
		return null;
	}
	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
		System.out.println("enter the number");
		int number= sc.nextInt();
		System.out.println(positivenegativeorzero(number));
	}	

}
