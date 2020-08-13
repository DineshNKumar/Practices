package com.practices;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class NumberNaming {

	public static void takeNumber(int number) {
		String numberAsString = String.valueOf(number);
		int temp = 0;
		int index = 0;
		for (int i = 0; i < numberAsString.length(); i++) {

			int divider = checkNumberLenght(numberAsString);
			if (readFile().containsKey(String.valueOf(number))) {
				temp = number / divider;
				number = number % divider;
				numberAsString = numberAsString.substring(i + 1);
				System.out.println(readFile().get(number));
			}
		}

	}

	public static String searchNumber(int temp) {
		String name = "";
		for (Map.Entry<String, String> m : readFile().entrySet()) {
			if (Integer.valueOf(m.getKey()).equals(Integer.valueOf(temp))) {
				name += m.getValue();
			}
		}
		return name;
	}

	public static int checkNumberLenght(String string) {
		int length = string.length();
		switch (length) {
		case 2:
			return 10;
		case 3:
			return 100;
		case 4:
			return 1000;
		case 5:
			return 10000;
		case 6:
			return 100000;
		default:
			return 1;
		}
	}

	public static Map<String, String> readFile() {
		File file = new File("src\\com\\files\\numbers.txt");
		Map<String, String> map = new HashMap<String, String>();
		try {
			Scanner scan = new Scanner(new FileInputStream(file));
			while (scan.hasNext()) {
				String[] splits = scan.nextLine().split(",");
				map.put(splits[0], splits[1]);
			}
			scan.close();
		} catch (IOException e) {
			e.printStackTrace();
		}
		return map;
	}

	public static void main(String[] args) {
		NumberNaming.takeNumber(239);
	}

}
