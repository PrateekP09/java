package in.buildingblocks;

public class test24 {
	
	public static void printnumber(int i) {
		if(i==0) return;
		printnumber(i-1);
		System.out.println(i);
		
	}
	public static void main(String[]args) {
		printnumber(5);
		
	}

}
