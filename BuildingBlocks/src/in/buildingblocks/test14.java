package in.buildingblocks;

class box{
	box(){
		System.out.println("current value of this-->"+this.hashCode());
	}
}
public class test14 {
	public static void main(String[]args) {
		box b= new box();
		System.out.println("current value of b"+b.hashCode());
		
		box b1 = new box();
		System.out.println("current value of b"+b1.hashCode());
		
	}

}
