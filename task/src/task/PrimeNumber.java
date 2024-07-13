package task;

import java.util.Scanner;

//write a java program to find all prime number between user input
public class PrimeNumber {

	public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the first number: ");
        int firstnum = scanner.nextInt();

        System.out.print("Enter the second number: ");
        int secondnum = scanner.nextInt();

        System.out.println("Prime numbers between " + firstnum + " and " + secondnum + " are: ");

        for (int i = firstnum; i <= secondnum; i++) {
            if (isPrime(i)) {
                System.out.print(i + " ");
            }
        }
    }

    public static boolean isPrime(int num) {
        if (num <= 1) {
            return false;
        }
        for (int i = 2; i <= Math.sqrt(num); i++) {
            if (num % i == 0) {
                return false;
            }
        }
        return true;
    }

}
