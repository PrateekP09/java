package in.buildingblocks;
 	
class product {
	String ProductId = "A123";
	String ProductName= "abc";
	static String Category = "ex" ;


public void showdetails() {
	System.out.println(ProductId);
	System.out.println(ProductName);
	System.out.println(Category);
}	
public class test11 {
	
	
	public static void main(String[] args) {
		product a= new product();
		a.showdetails();
	}


}
}

