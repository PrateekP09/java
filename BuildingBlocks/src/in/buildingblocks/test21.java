package in.buildingblocks;

// constructor calling another constructor is called constructor chaining;
class pro{
	pro(){
		System.out.println("no arg constructor");
	}
	pro(int a){
		this();// we cannot call this(); after using the constructor statement
		System.out.println("one-arg constructor");
		
	}
}

public class test21 {

	public static void main(String[] args) {
		pro obj= new pro(10);

	}

}
