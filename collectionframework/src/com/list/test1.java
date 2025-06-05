package com.list;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.concurrent.CopyOnWriteArrayList;
public class test1 {

	public static void main(String[] args) {
		ArrayList<Integer> list= new ArrayList<>();
		//Collections.synchronizedList(list); // by using this we can synchornize and help multithreading
		//CopyOnWriteArrayList();  // automatically synchrnized and process is fast
		
		// It maintains insertion order
		// insert
		list.add(10);
		list.add(30);
		list.add(20);
		list.add(30);
		//list.add(null); it allows null
		System.out.println(list);
		
		ArrayList<Integer> list2 = new ArrayList<>();
		list2.add(100);
		list2.add(200);
		list.addAll(list2);
		System.out.println(list);
		
		System.out.println(list.isEmpty());
		
		// get()
		System.out.println(list.get(2));
		
		for (int i=0; i<list.size();i++) {
			System.out.println(list.get(i));
			
		}
		System.out.println("___________________");
		for(Integer obj: list) {
			System.out.println(obj);
		}
		System.out.println("__________________");
		
		Iterator <Integer> iterator = list.iterator();
		while(iterator.hasNext()) {
			System.out.println(iterator.next());
		}
		
		// updations
		list.set(2, 2000);// 2 is index 2000 is value
		System.out.println(list);
		
		//
		list.remove(2);
		System.out.println(list);
    }

	
		
	}


