package com.ottensmeyer.solutions;

import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Substring1 {
	
	

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String S = in.next();
        int start = in.nextInt();
        int end = in.nextInt();
        
        S = S.substring(start, end);
        
       System.out.println(S);
       in.close();
    }
}
