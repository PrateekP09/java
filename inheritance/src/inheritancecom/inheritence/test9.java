package inheritancecom.inheritence;

class human {
	void speak() {
		System.out.println("this is speaking");

	}
}

class child extends human {
	void walk() {

		System.out.println("this is walking");
	}
}

class child2 extends human {
	void crawl() {
		System.out.println("this is crawling");
	}

}

public class test9 {

	public static void main(String[] args) {
		child obj= new child();
		child2 obj1= new child2();
		
		obj.speak();
		obj.walk();
		
		obj1.speak();
		obj1.crawl();
		

	}

}
