package calculator;

import java.util.Scanner;

public class AreaOfRectangle {
	public void rectangle() {
		Scanner scanner = new Scanner(System.in);
		
		System.out.print("Enter the Length of Rectangle: ");
		int len = scanner.nextInt();
		
		System.out.print("Enter the Width of Rectangle: ");
		int wid = scanner.nextInt();
		
		int area = len * wid;
		
		System.out.println("Area OF Rectangle: "+area);
		
	}
}
