package co.controlstatements;

public class test4 {
	static boolean flag=true;
	public static boolean ispositiveeven(int n) {
		/*if(n>0) {
			if(n%2==0) {
				flag=true;
			}
		}
		return flag;*/
		return (n>0)?(n%2==0)?true:false:false;
	}
	public static void main(String[] args) {
		
		
		System.out.print(ispositiveeven(3));
	}

}
