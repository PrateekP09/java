package co.controlstatements;

public class test3 {
	public static String isEvenorOdd(int n) {
		//if(n%2==0)
		//	return "Even";
		//else
		//	return "Odd";
			return (n%2==0) ?"Even" :"Odd";
	}
public static void main(String[] args) {
	System.out.println(isEvenorOdd(23));
}
}
