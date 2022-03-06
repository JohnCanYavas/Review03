package com.neotech.review03;

import java.util.Scanner;

public class ScannerArray {
	// Ask the user: How many numbers do you want to store in the array?
	// Ask him to enter the numbers: Read numbers and enter them into the array
	// Print the numbers from the array

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);

		System.out.println("How many numbers do you want to store in the array?");
		int size = input.nextInt();

		// Declaring the array
		int[] array = new int[size];

		// Read numbers and enter them into the array
		for (int i = 0; i < size; i++) {
			System.out.println("Enter a number:");
			array[i] = input.nextInt();
		}

		// Print the numbers from the array
		System.out.println("Let's print the number from the array");
		for (int i = 0; i < size; i++) {
			System.out.print(array[i] + " ");
		}

		System.out.println();
		System.out.println("Let's print the sum of the numbers in the array");
		// Do it with enhanced for loop

		int total = 0;
		for (int el : array) {
			total += el;
		}
		System.out.println("The sum is -> " + total);

	}

}
