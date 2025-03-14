package in.buildingblocks;

class AImpl{
	int data= 10;
}
public class test10 {
	public void showdata(AImpl obj) {
	System.out.println(obj.data);
	}

	public static void main (String[]args) {
		test10 obj= new test10();
		AImpl a= new AImpl();
		obj.showdata(a);
	}
}
