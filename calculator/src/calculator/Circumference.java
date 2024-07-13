package calculator;

import java.util.Scanner;

public class Circumference {
	 public void findcircumference() {
		 Scanner scanner = new Scanner(System.in);
		 
		 System.out.print("Enter The Length of the rectangle: ");
		 double length = scanner.nextDouble();
		 System.out.print("Enter The Breadth of the rectangle: ");
		 double breadth =  scanner.nextDouble();
		 
		 double perimeter = 2 * (length + breadth);
		 
		 System.out.println("circumference of Rectangle: "+ perimeter);

	}

}
