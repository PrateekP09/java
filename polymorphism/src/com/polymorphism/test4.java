package com.polymorphism;


interface BroadBand{

	void getnetworkname();
	
}
class Airtel implements BroadBand{
	public void getnetworkname() {
		System.out.println("airtel");
	}
}
class Vodafone implements BroadBand{
	public void getnetworkname() {
		System.out.println("vodafone");
	}
}

class mobile{
	private BroadBand obj;
	mobile(BroadBand obj){
		this.obj=obj;
	}

public void getname() {
	this.obj.getnetworkname();
}
}
public class test4 {

	public static void main(String[] args) {
		mobile m= new mobile(new Airtel());
		m.getname();
	}

}
