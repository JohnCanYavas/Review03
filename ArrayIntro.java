package com.neotech.review03;

public class ArrayIntro {

	public static void main(String[] args) {
		// funny way
		int a1 = 5;
		int a2 = 6;
		int a3 = 9;
		int a4 = 7;

		int sum = a1 + a2 + a3 + a4;
		System.out.println("Sum is -> " + sum);

		// 1st serious way
		int[] arr = new int[4];
		arr[0] = 5;
		arr[1] = 6;
		arr[2] = 9;
		arr[3] = 7;

		int sumArr = 0;
		for (int i = 0; i < arr.length; i++) {
			sumArr += arr[i];
		}
		System.out.println("Sum of the array is -> " + sumArr);

		// 2nd serious way
		int[] arr2 = { 5, 6, 9, 7 };

		int sumArr2 = 0;
		for (int num : arr2) {
			sumArr2 += num;
		}
		System.out.println("Sum of the array2 is -> " + sumArr2);

		System.out.println("--------------------------------");
		String[] animals = { "dog", "cat", "mouse", "elephant", "human", "horse" };

		for (int i = 0; i < animals.length; i++) {
			System.out.print(animals[i] + " ");
		}
		System.out.println();

		for (String element : animals) {
			System.out.print(element + " ");
		}
		System.out.println();

		System.out.println("--------------------------------");
		System.out.println("Let's print the animals in reverse order");

		for (int i = animals.length - 1; i >= 0; i--) {
			System.out.print(animals[i] + ", ");
		}

	}

}
