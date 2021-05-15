package com.ottensmeyer.solutions;

import java.io.*;
import java.util.*;

public class JavaStringTokensDriver {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter a word");
        String s = scan.nextLine();
        // Write your code here.
        scan.close();
        
        s = removeLeadingNonLetters(s);
        System.out.println(splitStringIntoTokens(s));
    }
    
    public static String splitStringIntoTokens(String s) {
    	s = removeLeadingNonLetters(s);
    	if(s.length()==0) {
    		return "0";
    	}
    	
    	String[] words = s.split("[^a-zA-Z]+");
    	int numOfWords = words.length;
    	StringBuilder sb = new StringBuilder();
    	sb.append(String.valueOf(numOfWords) + "\n");
    	
    	for(String word: words) {
    		sb.append(word + "\n");
    	}
    	
    	return sb.toString();
    }
    
    public static String removeLeadingNonLetters(String str) {
        int i;
        for (i = 0; i < str.length(); i++) {
            if (Character.isLetter(str.charAt(i))) {
                break;
            }
        }
        return str.substring(i);
    }
}
