package in.buildingblocks;

// differentiating between instance and local variable when they have same name
class Student{
	int studentId = 101;
	String studentName = "prateek";
	
	
	public void showdetails() {
		int studentId = 201;
		System.out.println(this.studentId+" "+studentName);// applying this keyword executes the instance variable directly i.e 101.
		
	}
}
public class test15 {

	public static void main(String[] args) {
		Student s1 = new Student();
		s1.showdetails();
       
	}

}
