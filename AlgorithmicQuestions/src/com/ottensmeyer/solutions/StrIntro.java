package com.ottensmeyer.solutions;

import java.io.*;
import java.util.*;

public class StrIntro {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		System.out.println("enter two strings");
		String A = sc.next();
		String B = sc.next();
		sc.close();
		
		/* Enter your code here. Print output to STDOUT. */
		System.out.println(op(A, B));
		

	}

	public static String op(String a, String b) {
		if (a.equals("") || a.equals(null) || b.equals("") || b.equals(null)) {
			return "";
		}

		StringBuilder sb = new StringBuilder();
		int length = a.length() + b.length();
		String sizeCompare = a.compareTo(b)>0?"Yes":"No";
		
		String aAndB = a.substring(0, 1).toUpperCase() +
				a.substring(1, a.length()) +" " + 
				b.substring(0, 1).toUpperCase() + 
				b.substring(1, b.length());
		
		String result = sb.append(length + "\n" +
								  sizeCompare + "\n" +
								   aAndB).toString();

		return result;
	}
}
