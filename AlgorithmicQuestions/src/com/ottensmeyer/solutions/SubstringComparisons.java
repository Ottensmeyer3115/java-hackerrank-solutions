package com.ottensmeyer.solutions;

import java.util.Scanner;

public class SubstringComparisons {
	public static String getSmallestAndLargest(String s, int k) {
		String smallest = "";
		String largest = "";

		// We have two conditions for our String.
		// s.length must be >= 1 and <= 1000
		// s.length must contain only English Alphabet Letters
		// The following code takes care of these conditions
		s = s.replaceAll("[^a-zA-Z]+", "");
		if (s.length() < 1 && s.length() > 1000) {
			System.out.println("Invalid String length");
		}
		// Now here is my solution
		smallest = s.substring(0, k);
		largest = s.substring(0, k);
		for (int i = 0; i <= s.length() - k; i++) {
			String str = s.substring(i, k + i);
			if (smallest.compareTo(str) > 0) {
				smallest = str;
			}
			if (largest.compareTo(str) < 0) {
				largest = str;
			}
		}
		return smallest + "\n" + largest;
	}

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		String s = scan.next();
		int k = scan.nextInt();
		scan.close();

		System.out.println(getSmallestAndLargest(s, k));
	}
}
