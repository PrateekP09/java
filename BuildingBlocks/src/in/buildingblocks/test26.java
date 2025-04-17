package in.buildingblocks;

public class test26 {

	public static int power(int a, int b) {
		if(b==0) {
			
			return 1;
		}
				
			return 3 * power(3,4-1);// base*power(base,exp-1)
		}
		
	public static void main(String[] args) {
		int a=3;	
		int b=4;
		int res= power(a,b);
		System.out.println(  res);
	}

}
