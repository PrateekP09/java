package co.controlstatements;

import java.util.Scanner;

public class test5 {
	
	public static String getGrade(int marks) {
		if(marks>=80) return"distinction";
		else if(marks<80 && marks>=60) return "first class";
		else if(marks<60 && marks>=35) return "second class";
		else return "try next year";
	}
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("enter your marks");
		int marks= sc.nextInt();
		 System.out.println(getGrade(marks));
	}

}
