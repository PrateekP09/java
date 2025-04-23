package com.abstraction;

class T{
	public void m1() {
		System.out.println("m1 called");
	}
	
}
 
interface T2{
	void m1();
}

class G extends T implements T2{
	
}
public class test7 {

	public static void main(String[] args) {
		new G().m1();
	}

}
