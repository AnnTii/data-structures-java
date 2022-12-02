package com.altafjava.string;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class SubstringCounter {

	public static void main(String[] args) {
		String s = "abcdabceabcfabch";
		String sub = "abc";
		SubstringCounter substringCounter = new SubstringCounter();
		int count = substringCounter.countSubstringRegex(s, sub);
		System.out.println(count);
	}

	public int countSubstringRegex(String s, String sub) {
		int count = 0;
		Pattern pattern = Pattern.compile("abc");
		Matcher matcher = pattern.matcher(s);
		while (matcher.find()) {
			count++;
		}
		return count;
	}

	public int countSubstring(String s, String sub) {
		int count = 0;
		for (int i = 0; i < s.length() - 3; i++) {
			char c = s.charAt(i);
			if (c == sub.charAt(0)) {
				String substring = s.substring(i, i + 3);
				if (substring.equals(sub))
					count++;
			}
		}
		return count;
	}
}
