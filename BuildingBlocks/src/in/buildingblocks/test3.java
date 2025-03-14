package in.buildingblocks;

public class test3 {
	public static void main(String[]args){
		byte a= 100;//converting from data type to higher data type 
		short b = a;
		
		System.out.println(a+" "+b);
		
		
		int x = 140;// converting from higher data type to lower data type
		byte y =(byte) x;
		System.out.println(x+" "+y);
	}

}
