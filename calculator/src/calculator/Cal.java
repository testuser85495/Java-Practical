package calculator;

import java.util.Scanner;

public class Cal {
	public void calq() {
		Scanner scanner = new Scanner(System.in);
		System.out.print("Enter num1: ");
		int num1 = scanner.nextInt();
		System.out.print("Enter num2: ");
		int num2 = scanner.nextInt();
		
		System.out.println("ADD OF " + num1 + " + " + num2 + " = " + (num1 + num2));
		System.out.println("SUB OF " + num1 + " - " + num2 + " = " + (num1 - num2));
		System.out.println("MUL OF " + num1 + " * " + num2 + " = " + (num1 * num2));
		System.out.println("DIV OF " + num1 + " / " + num2 + " = " + (num1 / num2));
		System.out.println("MOD OF " + num1 + " % " + num2 + " = " + (num1 % num2));
	}

}
