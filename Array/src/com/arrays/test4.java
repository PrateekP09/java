package com.arrays;

public class test4 {

	public static int[] reverse(int[] arr) {
		
		
		int length = arr.length;

		for (int i = 0; i < length / 2; i++) {
			int temp = arr[i];
			arr[i] = arr[length - 1 - i];
			arr[length - 1 - i] = temp;
		}

		
		
		return arr;
	}
	
	
	public static void main(String[] args) {
		int[] arr = { 1, 2, 3, 4, 5 };
		reverse(arr);
		for(int ele:arr)
		System.out.print(ele);
		
}
}

