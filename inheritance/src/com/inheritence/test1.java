package com.inheritence;



class parent{
		int data=200;
		public int data2=200;
		protected int data3=300;
		private int data4=400;
	}
	class Child extends parent{
		public void getdata() {
			System.out.println(data);
			System.out.println(data2);
			System.out.println(data3);
			//System.out.println(data4); private cannot be accessed by child class
		}
	}
	public class test1 {
	public static void main(String[] args) {
		Child ch= new Child();
		
		ch.getdata();

	}

}
