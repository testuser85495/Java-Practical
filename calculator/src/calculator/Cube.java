package calculator;

import java.util.Scanner;

public class Cube {
	public void find_cube() {
		double side;
		Scanner scanner = new Scanner(System.in);
		System.out.print("Enter Side of Cube: ");
		side = scanner.nextDouble();
		
		double area = 6.0 * side * side;
		
		System.out.println("The area of Cube: "+area);
	}

}
