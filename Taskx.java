package com.neotech.review03;

public class Taskx {

	public static void main(String[] args) {

		// Task: Find the biggest number in a 2D Array
		int[][] arrays = { { 2, 3, 5 },
				{ 2, 4, 7 }, 
				{ 8, 1, 9 }, 
				{ 3, 5, 1 } 
				};

		int largest = arrays [0][0];
		
		for (int row = 0 ; row < arrays.length; row++) {
			
			for (int col=0; col<arrays[row].length; col++) {
				
				if (arrays[row][col] > largest) {
					largest= arrays[row][col];
				}
			}
		}
		
		
		System.out.println("Largest number: "+ largest);
		
		
		
		
	}

}
