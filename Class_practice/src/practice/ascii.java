package practice;

import java.util.Scanner;

public class ascii {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		char ascii;
		System.out.println("Enter a character: ");
		ascii = scanner.next().charAt(0);
		
		int num = ascii;
		
		System.out.println(num);

	}

}
