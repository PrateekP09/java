package com.arrays;

// find the freq of the given ele of the array
public class test7 {

	public static int findFrequency(int[] arr, int element) {
        int frequency = 0;
        for (int num : arr) {
            if (num == element) {
                frequency++;
            }
        }
        return frequency;
    }
 public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 2, 2, 5, 6, 2, 7};
        int key = 4;
        int frequency = findFrequency(arr, key);
        System.out.println("Frequency of "+ key + " is "+ frequency);
}
}
