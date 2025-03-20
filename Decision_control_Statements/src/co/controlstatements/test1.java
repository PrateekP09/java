package co.controlstatements;

public class test1 {
	
	static boolean flag= false;
	public static void m1() {
		if(flag) {
			System.out.println("if block executed");
		}
	}
	public static void main(String[] args) {
		System.out.println("main started");
		m1();
		System.out.println("main ended");
	}

}
