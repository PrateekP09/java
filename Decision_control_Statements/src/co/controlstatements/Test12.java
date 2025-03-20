package co.controlstatements;


	import java.util.Scanner;

	public class Test12 {
		public static void main(String[] args) {
			Scanner in = new Scanner(System.in);

			System.out.print("Enter the quantity of items purchased: ");
			int quantity = in.nextInt();

			int Price = 100;
			int totalCost = quantity * Price;

			if (totalCost > 1000) {
				double discount = 0.10 * totalCost;
				totalCost -= discount;
				System.out.println("Discount applied: 10%");
				System.out.println("Total cost after discount: " + totalCost);
			} else 
				System.out.println("Total cost: " + totalCost);
		}
	}

