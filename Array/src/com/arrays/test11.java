package com.arrays;

import java.util.Collections;
import java.util.PriorityQueue;
//wap to find k largest ele
public class test11 {

	public static void main(String[] args) {
  int [] arr= {4,8,1,6,9,2,12,10};
  int k=5;
  int count =0;
   PriorityQueue<Integer> priorityQueue = new PriorityQueue<>(Collections.reverseOrder());
   for(int ele:arr) {
	   priorityQueue.add(ele);
   }
   while(count<k) {
	   priorityQueue.poll();
	   count++;
   }
   System.out.println(priorityQueue.peek());
	}

}
