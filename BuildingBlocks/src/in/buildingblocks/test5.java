package in.buildingblocks;

public class test5 {
	static int data = 200;

	public static void main(String[] args) {
      
		//ClassName.varName;
		System.out.println(test5.data);
		
		test5 obj = new test5();
		test5 obj2 = new test5();
		System.out.println(obj.data);
		System.out.println(obj2.data);
		
		obj.data = 500;
		System.out.println(obj.data);
		System.out.println(obj2.data);
		
		
	}

}
	