package in.buildingblocks;

public class test23 {
	
	public static void printone(int a) {
		System.out.println(a);
		printtwo(a+1);
	}
	public static void printtwo(int b) {
		System.out.println(b);
		printthree(3);
		
	}
	public static void printthree(int c) {
		System.out.println(c);
		printfour(4);
		
	}
	public static void printfour(int d) {
		System.out.println(d);
		printfive(5);
	}
	public static void printfive(int e) {
		System.out.println(e);
		return;
	}
	public static void main(String[] args) {
		printone(1);
	}

}
