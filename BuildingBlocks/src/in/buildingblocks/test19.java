package in.buildingblocks;

class Vehicle{
	int numberofwheels;
	String vehicleName;
	Vehicle(int numberofwheels,String vehicleName ){
		this.numberofwheels= numberofwheels;
		this.vehicleName= vehicleName;
		
	}
	
	Vehicle(Vehicle obj){
		this.numberofwheels= obj.numberofwheels;
		this.vehicleName = obj.vehicleName;
	}
	@Override
	public String toString() {
		return this.numberofwheels+" "+this.vehicleName;
	}
	
}

public class test19 {

	public static void main(String[] args) {
		Vehicle v1= new Vehicle(4,"bus");
		System.out.println(v1);
		
		Vehicle v2= new Vehicle(v1);
		System.out.println(v2);
		
	}

}
