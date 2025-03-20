package in.buildingblocks;


class category{
	int categoryId;
	String categoryName;
	
	
	public category(int categoryId, String categoryName) {
		super();
		this.categoryId = categoryId;
		this.categoryName = categoryName;
	}

// this method is present in object class
	@Override
	public String toString() {
		return "category [categoryId=" + categoryId + ", categoryName=" + categoryName + "]";
	}

	
	
	
	
}
public class test18 {

	public static void main(String[] args) {
		category c1 = new category(101,"electronics");
		category c2 = new category(102,"mobile");
		System.out.println(c1);
		System.out.println(c2);
		

	}

}
