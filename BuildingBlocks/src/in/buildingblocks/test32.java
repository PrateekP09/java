package in.buildingblocks;

class A{
	static int counter=0;
static {
	System.out.println("static block exected");
}

{
	counter++;
}
public static void printcounter() {
	System.out.println(counter);
}
}


public class test32 {

	public static void main(String[]args) {
		A a=new A();
		A a1= new A();
		A a2= new A();
		A a3= new A();
		A a4= new A();
		A a5= new A();
		A.printcounter();
	}
}


	

