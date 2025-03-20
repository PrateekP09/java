package in.buildingblocks;

public class test22 {
	
	public static void m1() {
		System.out.println("m1() method started");
		m2();
		System.out.println("m1() method completed");
	}
	public static void m2() {
		System.out.println("m2() method started");
		System.out.println("m2() method completed");
	}
	public static void main(String[] args) {
		System.out.println("main() method started..");
		m1();
		System.out.println("main() method completed");
	}

}
