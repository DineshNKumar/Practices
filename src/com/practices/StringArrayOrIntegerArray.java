package com.practices;

public class StringArrayOrIntegerArray {

	public static void main(String[] args) {
		String[] strArray = { "Mohan", "Ravi", "Deepak", "Sonu" };
		int[] intArray = { 1, 2, 3, 6, 7, 4, 2 };
		int lenghtOfString = strArray.length;
		int lengthOfInteger = intArray.length;

		while (true) {
			if (lenghtOfString > 0) {
				System.out.println("String -: " + strArray[lenghtOfString - 1]);
			}
			if (lengthOfInteger > 0) {
				System.out.println("Integer :- " + intArray[lengthOfInteger - 1]);
			}
			if (lengthOfInteger != 0 && lenghtOfString != 0) {
				lenghtOfString -= 1;
				lengthOfInteger -= 1;
			} else {
				break;
			}
		}
	}

}
