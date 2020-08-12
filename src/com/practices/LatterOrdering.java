package com.practices;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class LatterOrdering {

	public static void sorted(Character[] ch) {
		List<Character> charList = Arrays.asList(ch);
		Collections.sort(charList);
		System.out.println(charList);
	}

	public static void main(String[] args) {
		Character[] ch = { 'B', 'R', 'L', 'A', 'D', 'E', 'Q', 'T', 'O' };
		LatterOrdering.sorted(ch);
	}
}
