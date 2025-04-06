package com.arrays;

import java.util.Arrays;

public class test16 {

	
		public static void sortArray(int[] arr) {
	        int count0 = 0, count1 = 0, count2 = 0;

	      
	        for (int num : arr) {
	            if (num == 0) count0++;
	            else if (num == 1) count1++;
	            else count2++;
	        }

	       
	        for (int i = 0; i < count0; i++) arr[i] = 0;
	        for (int i = count0; i < count0 + count1; i++) arr[i] = 1;
	        for (int i = count0 + count1; i < arr.length; i++) arr[i] = 2;
	    }

	    public static void main(String[] args) {
	        int[] arr = {0, 1, 1, 0, 0, 2, 2, 1, 1};
	        sortArray(arr);
	        System.out.println(Arrays.toString(arr));
	    }
	}
