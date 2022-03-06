package com.neotech.review03;

public class TwoD_ArrayIntro {

	public static void main(String[] args) {
		int[][] numbers = new int[3][4]; // [rows][columns]

		numbers[1][2] = 3;
		numbers[2][1] = 7;
		numbers[0][0] = 5;
		numbers[2][0] = 6;

		// re-assign a value to an element
		numbers[2][0] += 2;

		numbers[1][0] = 9;
		numbers[1][3] = 4;
		numbers[0][1] = 2;
		numbers[0][3] = 1;

		// numbers[3][1] = 9; //run-time error
		int rows = numbers.length;
		System.out.println("The number of rows is -> " + rows);

		// The length of the row with index 1
		int cols1 = numbers[1].length;
		System.out.println("The number of columns in the row with index 1 -> " + cols1);

		for (int row = 0; row < numbers.length; row++) {

			for (int col = 0; col < numbers[row].length; col++) {
				System.out.print(numbers[row][col] + " ");
			}

			System.out.println();
		}
	}

}
