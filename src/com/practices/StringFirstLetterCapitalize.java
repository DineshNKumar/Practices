package com.practices;

public class StringFirstLetterCapitalize {

	public static void main(String[] args) {
		String str = "I AM JAVA PROGRAMMER";
		String[] splits = str.toLowerCase().split(" ");
		for (String split : splits) {
			if (!split.isEmpty()) {
				String newString = String.valueOf(split.charAt(0)).toUpperCase() + split.substring(1);
				System.out.print(newString + " ");
			}
		}

	}

}
