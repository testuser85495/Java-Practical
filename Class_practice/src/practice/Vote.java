/*W.A.J.P to create the validate method that takes integer value as a parameter. If the 
age is less than 18, then throw an Arithmetic Exception otherwise print a message 
welcome to vote.
O/P- Enter your age: 16
Exception in thread main java. Lang. Arithmetic Exception: not valid*/
package practice;

import java.util.Scanner;

public class Vote {

	public static void main(String[] args) throws ArithmeticException{
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter your age");
		int age = scanner.nextInt();
		validate(age);
	}
	public static void validate(int age) {
		
		
		if (age < 18) {
			throw new ArithmeticException(" not valid");
			
		} 
		else {
			System.out.println("welcome to vote");
		}
	}

}
