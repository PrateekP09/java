package com.polymorphism;


class Dimension{
	public static void area(double d) {
		System.out.println("area of circle:"+(Math.PI*d*d));
	}
	public static void area(int length, int breadth) {
		System.out.println("Area of rectangle:" +(length*breadth));
	}
	public static void area(float side) {
		System.out.println("Area of square:"+(side*side));
	}
}
public class test1 {

	public static void main(String[] args) {
     Dimension.area(12,13);
     Dimension.area(12.5);
     Dimension.area(12.34f);
     
     String[]arr= {1,2,3,4};
     main(arr);
     
	}
	public static void main(Integer msg) {// we can overload main method but jvm doesnt call
		Dimension.area(12,13);
		Dimension.area(12.5);
		Dimension.area(12.34f);
	}

}
