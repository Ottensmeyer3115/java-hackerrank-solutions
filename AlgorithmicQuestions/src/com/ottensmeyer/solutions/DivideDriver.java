package com.ottensmeyer.solutions;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

import static java.util.function.Function.identity;
import static java.util.stream.Collectors.counting;
import static java.util.stream.Collectors.groupingBy;

public class DivideDriver {

	public static int MAX_CHAR = 256;

	public static void main(String[] args) {
		System.out.println(divide(4, 2));
		System.out.println(divide(3, 2));
		System.out.println(divide(1, 3));
		System.out.println(divide(16, 15));
	}

	public static String divide(int dividend, int divisor) {
		// handle special cases
		String answer = "";
		if (divisor == 0)
			return String.valueOf(Integer.MAX_VALUE);
		if (divisor == -1 && dividend == Integer.MIN_VALUE)
			return String.valueOf(Integer.MAX_VALUE);

		if (dividend % divisor == 0) {
			answer = String.valueOf(dividend / divisor);
			return answer;
		}

		int pDividend = Math.abs(dividend);
		int pDivisor = Math.abs(divisor);

		double result = (double) pDividend / pDivisor;
		answer = String.valueOf(result);

		String firstDigits = answer;
		String lastDigits = answer;
		String stuff = "welcometojava\n" + 
				"12312312453542323453245";
		
		stuff = stuff.replaceAll("[^a-zA-Z]+", "");
		System.out.println(stuff);
		firstDigits = firstDigits.replaceAll("\\d+$", "");
		lastDigits = lastDigits.replaceAll("^\\d*\\D{1}", "");

		if (isRepeated(lastDigits)) {

			String repeatedDigits = fractionToDecimal(pDividend, pDivisor);
			repeatedDigits = transform(repeatedDigits);

			return firstDigits + repeatedDigits;

		} else {
			return answer;
		}

	}

	public static boolean isRepeated(String str) {
		int n = str.length();
		int[] freq = new int[MAX_CHAR];
		for (int i = 0; i < n; i++) {
			freq[str.charAt(i)]++;
			if (freq[str.charAt(i)] > 2)
				return true;
		}

		int k = 0;
		for (int i = 0; i < n; i++)
			if (freq[str.charAt(i)] > 1)
				str.replace(str.charAt(k++), str.charAt(i));
		str.replace(str.charAt(k), '\0');
		if (isPalindrome(str, 0, k - 1)) {
			if ((k & 1) == 1) {
				if (k / 2 >= 1) {
					return (str.charAt(k / 2) == str.charAt(k / 2 - 1));
				}
			}
			return false;
		}
		return true;
	}

	public static boolean isPalindrome(String str, int l, int h) {
		while (h > l) {
			if (str.charAt(l++) != str.charAt(h--))
				return false;
		}
		return true;
	}

	public static String fractionToDecimal(int numr, int denr) {
		// Initialize result
		String res = "";

		// Create a map to store already
		// seen remainders. Remainder is
		// used as key and its position in
		// result is stored as value.
		// Note that we need position for
		// cases like 1/6. In this case,
		// the recurring sequence doesn't
		// start from first remainder.
		HashMap<Integer, Integer> mp = new HashMap<>();
		mp.clear();

		// Find first remainder
		int rem = numr % denr;

		// Keep finding remainder until
		// either remainder becomes 0 or repeats
		while ((rem != 0) && (!mp.containsKey(rem))) {
			// Store this remainder
			mp.put(rem, res.length());

			// Multiply remainder with 10
			rem = rem * 10;

			// Append rem / denr to result
			int res_part = rem / denr;
			res += String.valueOf(res_part);

			// Update remainder
			rem = rem % denr;
		}
		return res;
	}

	public static String transform(String str) {
		StringBuilder sb = new StringBuilder();
		String str1 = "";
		String str2 = "";

		int resultLength = str.length();
		switch (resultLength) {
		case 0:
			sb.append("");
			return sb.toString();
		case 1:
			while (sb.toString().length() < 8) {
				sb.append(str);
			}
			return "(" + sb.toString() + ")";
		case 2:
			str1 = str.substring(0, 1);
			str2 = str.substring(1, 2);
			while (sb.toString().length() < 7) {
				sb.append(str2);
			}
			sb.append(")");
			return str1 + "(" + sb.toString();
		case 3:
			str1 = str.substring(0, 2) + "(";;
			str2 = str.substring(2, 3);
			sb.append(str1);
			while (sb.toString().length() < 8) {
				sb.append(str2);
			}
			sb.append(")");
			return sb.toString();

		default:
			throw new NullPointerException();
		}
	}

}
