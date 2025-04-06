package com.arrays;

import java.util.Collections;
import java.util.PriorityQueue;
//wap to find k smallest ele
public class test12 {

	public static void main(String[] args) {
		int [] arr= {4,8,1,6,9,2,12,10};
		int k=3;
		int count=1;
		PriorityQueue<Integer> priorityQueue = new PriorityQueue<>();
		   for(int ele:arr) {
			   priorityQueue.add(ele);
		   }
		   while(count < k) {
			   priorityQueue.poll();
			   count++;
		   }
		   System.out.println(priorityQueue.peek());
			}

		}