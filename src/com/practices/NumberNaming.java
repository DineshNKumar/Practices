package com.practices;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class NumberNaming {

	static String stringName = "";

	public static void takeNumber(long number) {
		String string = numberAsString(number);
		String list = "";
		for (int i = 1; i <= string.length(); i++) {
			if (i % 3 == 0 && i < 6) {
				list += " ";
				list += string.charAt(i - 1);
				list += " ";
			} else {
				if (i % 2 == 0 && i > 5) {
					list += " ";
				}
				list += string.charAt(i - 1);
			}
		}
		arrange(list);
	}

	public static void arrange(String list) {
		String[] str = list.split(" ");
		Map<Long, String> m = new HashMap<>();
		int i = 1;
		StringBuilder builder = new StringBuilder();
		for (String s : str) {
			m.put((long) i, builder.append(s).reverse().toString());
			i += 1;
			builder.setLength(0);
		}
		m.forEach((a, b) -> {
			stringName += name(a, b) + "\n";
		});
		String[] s = stringName.split("\n");
		for (i = s.length - 1; i >= 0; i--) {
			System.out.print(s[i] + "");
		}
	}

	public static String name(long key, String str) {
		String s = name(str);
		if (!s.isEmpty()) {
			switch ((int) key) {
			case 1:
				return name(str);
			case 2:
				return name(str) + "Hundred ";
			case 3:
				return name(str) + "Thousand ";
			case 4:
				return name(str) + "Lac ";
			case 5:
				return name(str) + "Crore ";
			case 6:
				return name(str) + "Arab ";
			case 7:
				return name(str) + "Kharab ";
			default:
				return "";
			}
		} else {
			return "";
		}
	}

	public static String name(String str) {
		int strAsNum = Integer.valueOf(str);
		if (strAsNum < 20) {
			return name(strAsNum);
		}
		return name((strAsNum / 10) * 10) + name(strAsNum % 10);
	}

	public static String name(int number) {
		String str = "";
		for (Map.Entry<Integer, String> m : readFile().entrySet()) {
			if (m.getKey() == number) {
				str += m.getValue();
			}
		}
		return str;
	}

	public static String numberAsString(long number) {
		return new StringBuilder(String.valueOf(number)).reverse().toString();
	}

	public static Map<Integer, String> readFile() {
		File file = new File("src\\com\\files\\numbers.txt");
		Map<Integer, String> map = new HashMap<Integer, String>();
		try {
			Scanner scan = new Scanner(new FileInputStream(file));
			while (scan.hasNext()) {
				String[] splits = scan.nextLine().split(",");
				map.put(Integer.valueOf(splits[0]), splits[1]);
			}
			scan.close();
		} catch (IOException e) {
			e.printStackTrace();
		}
		return map;
	}

	public static void main(String[] args) {
		NumberNaming.takeNumber(1325340005);
	}

}
