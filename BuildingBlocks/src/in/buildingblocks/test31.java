package in.buildingblocks;

public class test31 {

		public static void arithmeticoperators(){
			int a=5;
			int b=10;
			System.out.println(a+b);
			System.out.println(a-b);
			System.out.println(a*b);
			System.out.println(a/b);
			System.out.println(a%b);
			
		}
		public static void relationaloperators() {
			int a=10;
			int b=20;
			System.out.println(a>b);
			System.out.println(a>=b);
			System.out.println(a<b);
			System.out.println(a<=b);
			System.out.println(a==b);
			System.out.println(a!=b);

		}
		public static void logicaloperators() {
			int a=5;
			int b=10;
			System.out.println((a!=b&&(a==b)));
			System.out.println((a!=b||(a==b)));
			System.out.println(!((a!=b)||(a==b)));
		}
		public static void unaryoperators() {
			int a=10;
			int b=a++;
			System.out.println(a+" "+b);
			
			int x= -12;
			System.out.println(~x);
		}
		public static void bitwiseoperators() {
			int a= 5;
			int b= 10;
			System.out.println(a&b);
			System.out.println(a|b);
			System.out.println(a^b);
		}
		
		public static void shiftoperators() {
			int a=20;
			System.out.println(a<<2); // a* 2^2
			System.out.println(a>>3); // a/ 2^3
		}
		public static void ternaryoperators() {
			// var result = condition)? exp1 : exp2
			boolean flag=true;
			String result= !flag ?"java" :"python";
			System.out.println(result);
		}
		
		public static void assignmentoperators() {
			int a=10;
			a +=20;// a=a+20;
			System.out.println(a);
			
			a%=10;
			System.out.println(a);
		}
		
		public static void instanceOf() {
			String str="java";
			if(str instanceof String) {
				System.out.println(str.length());
			}
		}
		
	public static void main(String[] args) {
		arithmeticoperators();
		System.out.println("______________________");
		
		relationaloperators();
		System.out.println("______________________");
		
		logicaloperators();
		System.out.println("______________________");
		
		unaryoperators();
		System.out.println("______________________");
		bitwiseoperators();
		System.out.println("______________________");
		
		shiftoperators();
		System.out.println("______________________");
		
		ternaryoperators();
		System.out.println("______________________");
		
		assignmentoperators();
		System.out.println("______________________");
		
		instanceOf();
		System.out.println("_______________________");
		
	}

}
