package PizzaRest;

//import java.util.Iterator;
import java.util.Scanner;

public class array_pritc {

	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);
		System.out.println("enter array size: ");
		int size = scanner.nextInt();
		int array[] = new int[size];
		for (int i = 0; i < array.length; i++) {
			System.out.println("Enter a element: "+i);
			array[i] = scanner.nextInt();
		}
		for (int i = 0; i < array.length; i++) {
			for (int j = i + 1; j < array.length; j++) {
				if (array[i] > array[j]) {
					int temp = array[i];
					array[i] = array[j];
					array[j] = temp;
				}
			}
		}
		System.out.println(" sorted array : ");
		for (int i = 0; i < array.length; i++) {
			System.out.println("sorted : " + array[i] + " ");
		}

	}

}
