package com.atm_simulation;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		
		int attempt = 1;
		char resp;
		while (attempt<4) {
			System.out.println("welcome to XYZ bank.");
			System.out.println("enter your pin to continue");
			Scanner sc= new Scanner(System.in);
			int enteredPin=sc.nextInt();
			if(BankServer.validateLength(enteredPin) && enteredPin==BankServer.getPin()) {
			    do {
			    	System.out.println("1.deposit 2.withdraw 3.balEnq");
			    	System.out.println("select one option");
			    	int option= sc.nextInt();
			    	
			    	switch(option) {
			    	case 1:System.out.println(ATMUTIL.deposit(sc));
			    	break;
			    	case 2:System.out.println(ATMUTIL.withdrawAmount(sc));
			    	break;
			    	case 3:System.out.println(ATMUTIL.getBal());
			    	break;
			    	default:System.out.println("invalid option");
			    	}
			    	System.out.println("do you want to continue:y/n");
			    	resp=sc.next().charAt(0);
			    }while(resp=='y');
				break;	
			} else {
				System.out.println("wrong pin.");
				System.out.println("remaining attempts:" +(3-attempt));
				attempt++;
				if(attempt==4) {
					System.out.println("card blocked for next 24hrs.Connect to your nearest bank");
				}
				
			}
				
		}
		System.out.println("Thanks for banking with us");
	}

}
