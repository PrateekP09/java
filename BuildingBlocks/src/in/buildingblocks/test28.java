package in.buildingblocks;

public class test28 {

	 public static int numbers(int n) {
		 if(n == 0) 
			 return 1;
		 
			 
				 return n* numbers(n-1);
		 
		 
		 
	 }
	public static void main(String[] args) {
		System.out.println(numbers(3));
	}

}
