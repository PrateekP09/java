package com.arrays;

public class test8 {

	public static int findPeakElement(int[] arr) {
		int n = arr.length;
		if (n == 1) {
			return 0;
		}
		if (arr[0] >= arr[1]) {
			return 0;
		}
		if (arr[n - 1] >= arr[n - 2]) {
			return n - 1;
		}
		for (int i = 1; i < n - 1; i++) {
			if (arr[i] >= arr[i - 1] && arr[i] >= arr[i + 1]) {
				return i;
			}
		}
		return -1;
	}

	public static void main(String[] args) {
		int[] arr1 = { 8055, 3, 20, 400, 1, 0 };
		int peakIndex1 = findPeakElement(arr1);
		System.out.println("Peak element index: " + peakIndex1 + " (Value: " + arr1[peakIndex1] + ")");
	}
}