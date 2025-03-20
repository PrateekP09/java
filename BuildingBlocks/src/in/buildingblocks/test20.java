package in.buildingblocks;


class product3{
	int productId;
	String productName;
	float productPrice;
	public product3(int productId, String productName, float productPrice) {
		super();
		this.productId = productId;
		this.productName = productName;
		this.productPrice = productPrice;
	}

 public product3 showdetails() {
	 return this;
 }
 public  String toString(){
	 return this.productId+" "+this.productName+" "+this.productPrice;
 }
}
public class test20 {

	public static void main(String[] args) {
		product3 p1= new product3(4,"tablet",2222f);
	   System.out.println(p1.showdetails());
	
	    
	    
	}

}


