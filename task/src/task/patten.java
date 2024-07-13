package task;

import java.util.Scanner;

//*****
// ****
//  ***
//   **
//    *
public class patten {

	// Driver Function
	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		int i, j, count = 1;
		int n = 5;

		// calculating number of spaces
		int num = 2 * n - 2;
		int n1 = sc.nextInt();

		// outer loop to handle rows
		for (i = n; i > 0; i--) {
			// inner loop to print spaces.
			for (j = 0; j < n - i; j++) {
				System.out.print(" ");
			}
			// Decrementing value of num after each loop
			num = num - 2;
			// inner loop to print stars.
			for (j = 0; j < i; j++) {
				if (count <= n1) {
					System.out.print("*");
					count++;
				}

			}

			// printing new line for each row
			System.out.println();
		}
	}
	}
