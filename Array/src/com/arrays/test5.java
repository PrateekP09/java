package com.arrays;

public class test5 {

	public static int Index(int[] arr, int key) {
        if (arr == null) {
            return -1; 
        }
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == key) {
                return i; 
            }
        }
        return -1; 
    }
public static void main(String[] args) {
	 int[] arr = {1, 2, 3, 4, 5};
     int key = 3;
     int index = Index(arr, key);
     if (index != -1) 
         System.out.println("Element " + key + " found at index " + index);
     else
         System.out.println("Element " + key + " not found in the array.");
}
}
