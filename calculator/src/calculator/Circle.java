package calculator;

import java.util.Scanner;

public class Circle {
	public void Area()
	{
		float pi = 3.14f;
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Enter The radius of circle: ");
		
		double radius = sc.nextDouble();
		
		double area = pi * radius *radius;
		
		System.out.println("THE AREA OF CIRCLE: " + area);
		
	}
		
		
		
	

}
