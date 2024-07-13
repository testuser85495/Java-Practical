/*1. small pizza (150) if 4 so ->500mlcoke free
2. medium pizza(250)if 3 so ->11t coke free
3.large pizza(500) if 2 so -> 1ltt ice cream free
4. monster pizza(700)if 5 so -> all (1.5ltr + ice) free
*/

package PizzaRest;

import java.util.Scanner;

public class main {

	public static void main(String[] args) {
		int grand_total = 0;
		char userinput;
		Scanner scanner = new Scanner(System.in);
		do {
			System.out.println("--------------PIZZA MENU---------------");
			System.out.println("1.Small Pizza Rs 150/-");
			System.out.println("2.Medium Pizza Rs 250/-");
			System.out.println("3.Large Pizza Rs 500/-");
			System.out.println("4.Monster Pizza Rs 700/-");
			System.out.print("Select Your Pizza Size (1-4): ");

			byte choice = scanner.nextByte();

			if (choice >= 1 && choice <= 4) {
				if (choice == 1) {
					System.out.print("Enter Number of Small Pizza quantity: ");
					byte num = scanner.nextByte();
					if (num >= 4) {
						int Freeitem = num / 4;
						System.out.println("You have " + Freeitem + " (500ml Coke) free ");
					}
					int total = 150 * num;
					grand_total += total;

					System.out.println("Total: Rs " + total + "/-");
				} else if (choice == 2) {
					System.out.print("Enter Number of Medium Pizza quantity: ");
					byte num = scanner.nextByte();
					if (num >= 3) {
						int Freeitem = num / 3;
						System.out.println("You have " + Freeitem + " (1 ltr Coke) free");
					}
					int total = 250 * num;
					grand_total += total;
					System.out.println("Total: Rs " + total + "/-");
				} else if (choice == 3) {
					System.out.print("Enter Number of Large Pizza quantity: ");
					byte num = scanner.nextByte();
					if (num >= 2) {
						int Freeitem = num / 2;
						System.out.println("You have " + Freeitem + " (1ltr Coke + Ice cream) free");
					}
					int total = 500 * num;
					grand_total += total;
					System.out.println("Total: Rs " + total + "/-");
				} else if (choice == 4) {
					System.out.print("Enter Number of Monster Pizza quantity: ");
					byte num = scanner.nextByte();
					if (num >= 5) {
						int Freeitem = num / 5;
						System.out.println("You have " + Freeitem + "(1.5ltr Coke + Ice cream) free");
					}
					int total = 700 * num;
					grand_total += total;
					System.out.println("Total: Rs " + total + "/-");
				}
			} else {
				System.out.println("Invalid!!! Choice");
				
			}

			System.out.print("Do you want to continue? (y/n):");
			userinput = scanner.next().charAt(0);

		} while (userinput == 'y');

		System.out.println("Your Total Bill: Rs " + grand_total + "/-");
		System.out.println("Thank You :) Visit Again");

		scanner.close();
	}

}
