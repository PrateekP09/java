package co.controlstatements;

import java.util.Scanner;

public class test8 {
    public static String greater(int a, int b) {
    	if(a>=b) return "x is greater y";
    	else
    		 return "y is greter than x";
    }
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("enter 2 numbers");
		int number= sc.nextInt();
		
		System.out.println(greater(number, number));
		
	}

}
