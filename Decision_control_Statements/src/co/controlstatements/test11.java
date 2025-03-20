package co.controlstatements;

import java.util.Scanner;

public class test11 {
	public static void square(float l, float b) {
		if(l==b||b==l)System.out.println("the given rectangle is a square");
		else System.out.println("Not a square");
	}
public static void main(String[] args) {
	Scanner in =new Scanner(System.in);
	float a,b;
	System.out.println("Enter length and breadth of a rectangle");
	a=in.nextFloat();
	b=in.nextFloat();
	square(a,b);

}
}
