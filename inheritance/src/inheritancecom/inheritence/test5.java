package inheritancecom.inheritence;


class Base{
	Base(){
		System.out.println("from parent");
		
	}
}
class Derived extends Base{
	Derived(){
		//super();
		this(10);
		System.out.println("from child");
	}
	Derived(int a){
		System.out.println("from one-arg coonstructor");
	}
}
public class test5 {

	public static void main(String[] args) {
		Derived d= new Derived();
	}

}
