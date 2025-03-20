package in.buildingblocks;

public class test27 {

	public static void number(int i){
		if(i>=8) return ;
			System.out.println(i);
			number(i+1);
		}
	
	public static void main(String[] args) {
		number(1);
	}

}
