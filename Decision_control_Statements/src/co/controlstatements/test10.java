package co.controlstatements;

import java.util.Scanner;

public class test10 {

		public static String celsius(int t) {
			if(t>30) return "hot";
			else if(t<20) return "cold";
			else if(t>=20 && t<=30) return "warm";
			return null;
			
			
		}
	public static void main(String[] args) {
		Scanner in= new Scanner(System.in);
		System.out.println("enter the temp");
		int temp= in.nextInt();
		System.out.println(celsius(temp));
		
		
	}

}
