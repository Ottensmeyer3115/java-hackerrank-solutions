package com.ottensmeyer.solutions;

import java.util.Arrays;
import java.util.Scanner;

public class JavaAnagrams {
	static boolean isAnagram(String a, String b) {

		a = a.toUpperCase();
		b = b.toUpperCase();
		boolean ret = false;
		
		char[] aa = a.toCharArray();
		Arrays.sort(aa);
		a = Arrays.toString(aa);
		
		char[] bb = b.toCharArray();
		Arrays.sort(bb);
		b = Arrays.toString(bb);

		if (a.equals(b)) {
			return true;
		} else {
			return false;
		}

		/**
		 * if(a.length()==b.length()){ 
		 * 	for(int i=0; i<a.length();i++){ 
		 * 		for(int j=0;j<c.length();j++){ 
		 * 			if(a.charAt(i)==c.charAt(j)){ 
		 * 				c.deleteCharAt(j);
		 * 			}
		 * 			if(i==a.length()-1 && c.length()==0){
		 * 			    ret=true; break; } break;
		 * 			}
		 * 		} 
		 * 	} 
		 * }return ret;
		 **/

	}

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);
		System.out.println("Enter two words");
		String a = scan.next();
		String b = scan.next();
		scan.close();
		boolean ret = isAnagram(a, b);
		System.out.println((ret) ? "Anagrams" : "Not Anagrams");
	}
}
