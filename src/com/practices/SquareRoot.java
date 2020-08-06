package com.practices;

public class SquareRoot {

	public double process(double number) {
		double temp = 0;
		double i = 0;
		for (i = 1; i < number; i++) {
			temp = i * i;
			if (temp > number) {
				break;
			}
		}
		return i;
	}

	public double squareRoot(double number) {
		double avg;
		double temp;
		avg = process(number) - 1;
		while (avg * avg != number) {
			temp = number / avg;
			avg = (temp + avg) / 2;
		}
		return avg;
	}

	public static void main(String... args) {
		double number = 1024032000;
		SquareRoot root = new SquareRoot();
		System.out.println(root.squareRoot(number));
	}
}
