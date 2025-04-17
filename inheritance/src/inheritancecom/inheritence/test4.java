package inheritancecom.inheritence;


class X{
	X(){
		System.out.println("calling from X");
	}
}

class Y extends X{// before printing the child class the parent class is executed 
		Y(){
			//super();
			//this();
			System.out.println("calling from y");
			
		}
}
public class test4 {

	public static void main(String[] args) {
			Y obj= new Y();
			
	}

}
