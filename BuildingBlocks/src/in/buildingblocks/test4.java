package in.buildingblocks;

public class test4 {
	 int data = 100;

	public static void main(String[] args) {
      test4 obj = new test4();
      
      // accessing an instance variable:
      // objName.varName
      
      System.out.println(obj.data);
      
      test4 obj2 = new test4();
      System.out.println(obj2.data);
      
      obj.data = 200;	
      System.out.println(obj.data);
      System.out.println(obj2.data);
	}

}
