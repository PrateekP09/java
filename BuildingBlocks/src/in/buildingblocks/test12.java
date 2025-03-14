package in.buildingblocks;

public class test12 {

		int data =100;
		static int data2 = 500;// memory stored in class loading
		
		public void m1() {
			System.out.println(data+""+test12.data2);//non static and static data can be accessed through non static method.
			
		}
		
		public static void m2(test12 t) {
			System.out.println(test12.data2);
			System.out.println(t.data);
		}
	public static void main(String[]args) {
		test12 t= new test12();
		t.m1();
		test12.m2(t);
		
	}
}
