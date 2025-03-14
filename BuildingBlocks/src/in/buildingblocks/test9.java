package in.buildingblocks;

public class test9 {
	public void m1() {
		System.out.println("m1() called");
	}
	public static void main(String[]args) {
		System.out.println("main started");
		test9 obj= new test9();
		obj.m1();
		System.out.println("main completed");
		}

}
