package com.practices;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class TextSearching {

	public static void main(String... args) {
		String text = "I am using Eclipse for java programming, Eclipse is very famous IDe for programming";
		String p = "ing";
		Pattern pattern = Pattern.compile(p);
		Matcher matches = pattern.matcher(text);
		while (matches.find()) {
			System.out.println(matches.group());
		}

	}

}
