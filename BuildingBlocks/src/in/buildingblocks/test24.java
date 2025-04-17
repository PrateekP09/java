package in.buildingblocks;

public class test24 {
	
	public static void printnumber(int i) {
		if(i==0) return;
//		printnumber(i-1); this prints the number in ascending order or from beginn to end
		System.out.println(i);
		printnumber(i-1);// this position aftr the sysout prints in reverse
		
		
	}
	public static void main(String[]args) {
		printnumber(6);
		
	}

}
