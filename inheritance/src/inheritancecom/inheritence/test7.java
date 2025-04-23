package inheritancecom.inheritence;

// multilevel inheritance- single parent multiple child

class vehicle{
	void vehicle(){
		
		System.out.println("this is vehicle");
	}
}

class fourwheeler extends vehicle{
	void fourwheeler(){
		System.out.println("this is fourwheeler");
	}
}
class car extends fourwheeler{
	void car(){
		System.out.println("this is a car");
	}

	
}
public class test7 {

	public static void main(String[] args) {
		car obj= new car();
		obj.vehicle();
		obj.fourwheeler();
		obj.car();
	}

}
