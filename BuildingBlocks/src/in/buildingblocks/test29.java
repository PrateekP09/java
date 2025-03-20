package in.buildingblocks;

public class test29 {

	public static int digits(int a){
		
		if(a==0) return 0;
		
		 return(a%10)+digits(a/10);
		
	}
	public static void main(String[] args) {
		System.out.println(digits(49768));
	}

}
