package calculator;

import java.util.Scanner;

public class Triangle {
	public void FindTringle() {
		Scanner scanner = new Scanner(System.in);
		System.out.print("Enter The Height of Tringle: ");
		double height = scanner.nextDouble();
		System.out.print("Enter The base of Tringle: ");
		double breadth = scanner.nextDouble();
		
		double area = 0.5 * breadth * height;
		
		
		System.out.println("Area of tringle is: "+area);
		
		
		
	}

}
