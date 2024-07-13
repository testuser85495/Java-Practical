package calculator;

import java.util.Scanner;

public class Square{
	public void sqr() {
		Scanner scanner = new Scanner(System.in);
		//float square;
		System.out.print("Enter Side of square: ");
		int square = scanner.nextInt();
		int s = square * square;
		System.out.println("The Area OF Square: "+s);
	}
}
