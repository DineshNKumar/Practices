package com.practices;

public class MatrixRowColumnSum {

	public static void main(String[] args) {
		int[][] matrix = { { 1, 2, 4 }, { 2, 6, 1 }, { 4, 6, 8 } };
		int row = 0;
		int col = 0;
		for (int i = 0; i < matrix.length; i++) {
			row = 0;
			for (int j = 0; j < matrix[i].length; j++) {
				row += matrix[i][j];
				System.out.print(" " + matrix[i][j] + " ");
			}
			System.out.println(" | " + row);
		}
		System.out.println("-----------");
		for (int i = 0; i < matrix.length; i++) {
			col = 0;
			for (int j = 0; j < matrix[i].length; j++) {
				col += matrix[j][i];
			}
			System.out.print(" " + col + " ");
		}

	}

}
