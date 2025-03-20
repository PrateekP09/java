package in.buildingblocks;

public class test30 {
	
	
	   
	    public static int reverse(int n, int rev) {
	        if (n == 0) {
	            return rev;
	        }
	        return reverse(n/10,rev*10+n % 10);
	    }

	    public static void main(String[] args) {
	        int num = 12345;
	        int reversenum = reverse(num, 0);
	        System.out.println( reversenum);
	    }
	}



