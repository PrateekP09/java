package com.atm_simulation;

import java.util.Scanner;
public class ATMUTIL {
 private static final int minBal=500;
 private static  int currentBal=minBal;
 
	public static String deposit(Scanner sc) {
		System.out.println("enter the amount to deposit");
		int depositAmount = sc.nextInt();
		if(depositAmount >=100) {
			currentBal +=depositAmount;
			return "amount credited successfully";
		}
		return "invalid amount";
	}
	
		public static String withdrawAmount(Scanner sc) {
			System.out.println("enter the amount to be withdrawn:");
			int withdrawnAmount = sc.nextInt();
			
			if(withdrawnAmount <=(getBal()-minBal)) {
				currentBal-=withdrawnAmount;
				return "amount debited successfully";
				
				
			}
			return "insufficient balance";
		}
		
		public static int getBal() {
			return currentBal;
		}

}
