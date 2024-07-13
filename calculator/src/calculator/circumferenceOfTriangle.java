package calculator;

import java.util.Scanner;

public class circumferenceOfTriangle {
	void circumfrTringle() {
		Scanner scanner = new Scanner(System.in);
		
		System.out.print("Enter a 1st side of tringe: ");
		int side1 = scanner.nextInt();
		System.out.print("Enter a 2nd side of tringe: ");
		int side2 = scanner.nextInt();
		System.out.print("Enter a 3rd side of tringe: ");
		int side3 = scanner.nextInt();
		
		int tringle = side1 + side2 + side3;
		
		System.out.print("circumference of Triangle: " + tringle);
	}

}
