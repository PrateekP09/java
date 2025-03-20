package in.buildingblocks;

class car{
	public boolean isSameObject(car obj) {
		if(obj==this)return true;
		return false;
	}
}

public class test13 {
	public static void main(String[] args) {
		car c = new car();
		System.out.println(c.isSameObject(c));
		
		car c1 = new car();
		System.out.println(c1.isSameObject(c1));
	}

}
