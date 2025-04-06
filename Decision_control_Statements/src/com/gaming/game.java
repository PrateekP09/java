package com.gaming;

import java.util.Scanner;
public class game {

	public static void generatenumber() {
		Scanner in= new Scanner(System.in);
		int random=(int)(Math.random() * 10) +1;
		int attempt=100;
		int score=0;
		
		System.out.println("user has 10 attempts to choose the number");
		
		for ( int i=0;i<attempt;i++) {
			System.out.println("enter your number");
			int number= in.nextInt();
			
			if(number==random) {
				score++;
				break;
			} else if (number < random) {
                System.out.println("low number,Try again.");
            } else {
                System.out.println("high number, Try again.");
            }
			}
		System.out.println("The correct number was " + random);
        System.out.println("Game Over, Your score " + score);
        in.close();
			}
		
	
	public static void main(String[] args) {
		generatenumber();
	}

}