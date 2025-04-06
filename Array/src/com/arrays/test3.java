package com.arrays;

public class test3 {

	public static int[] sortAnarray(int[] arr) {
        int n = arr.length;
        for (int i = 0; i < n - 1; i++) {
            for (int j = 0; j < n - i - 1; j++) {
                if (arr[j] > arr[j + 1]) {
                    int temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                }
            }
        }
		return arr;
    }


	public static void main(String[] args) {
		int[] arr = { 4, 1, 3, 7, 6, 2, 5 };
		sortAnarray(arr);
		
		for(int num:arr) System.out.print(num +" ");
		
	}
}
