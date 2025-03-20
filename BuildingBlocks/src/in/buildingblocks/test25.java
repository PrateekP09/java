package in.buildingblocks;

public class test25 {

		public static int getSum(int i) {
		 int sum=0;
			if(i==6) return sum;
			sum +=i;
			return getSum (i+1);
			}
			
		
	public static void main(String[] args) {
		
		System.out.println(getSum(1));
	}
		
}
