package in.buildingblocks;



public class test16 {
	public void m1() {
		System.out.println("m1()called");
		this.m2();
	}
	
	public void m2() {
		System.out.println("m2()called");
	}

	public static void main(String[] args) {
		test16 t= new test16();
		t.m1();
	}

}
