package PizzaRest;

import java.util.Scanner;

public class desc_array_sort {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("Enter a size of array: ");
		int size = scanner.nextInt();
//		take size and stor to arr[]
		int arr[] = new int[size];
		
//		loop to enter array by user
		for (int i = 0; i < arr.length; i++) {
			System.out.println("Enter a element: ");
			arr[i] = scanner.nextInt();
		}
		
		for (int i = 0; i < arr.length; i++) {
			for (int j = i+1; j < arr.length; j++) {
				if (arr[i] < arr[j]) {
					int temp = arr[i];
					arr[i] = arr[j];
					arr[j] = temp;
				}
			}
		}
		
		System.out.println("Sorted array: ");
		for (int i = 0; i < arr.length; i++) {
			System.out.println("DESC : "+arr[i]);
		}
		 

	}

}
