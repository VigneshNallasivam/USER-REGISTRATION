package com.java.basics;

import java.util.regex.Pattern;

public class ClearEmail 
{
	public static void main(String[] args)
	{
		/*
		 * abc,bl,co are Mandatory so '*' is added at end position
		 * xyz,in are Optional so '+' is added at end position
		 */
		boolean result1 = Pattern.matches("[a-z]*[.][a-z]+[@][a-z]*[.][a-z]*[.][a-z]+","abc.xyz@bl.co.in");
		System.out.println("Is User-Input & Regex Pattern for User-Input Are Matching..? : "+result1);
		
		boolean result2 = Pattern.matches("[.][a-z]+[@][a-z]*[.][a-z]*[.][a-z]+",".xyz@bl.co.in");
		System.out.println("Is User-Input & Regex Pattern for User-Input Are Matching..? : "+result2);
		
		boolean result3 = Pattern.matches("[a-z]+[@][a-z]*[.][a-z]*[.][a-z]+","xyz@bl.co.in");
		System.out.println("Is User-Input & Regex Pattern for User-Input Are Matching..? : "+result3);
		
		boolean result4 = Pattern.matches("[a-z]*[.][a-z]*[.][a-z]+","bl.co.in");
		System.out.println("Is User-Input & Regex Pattern for User-Input Are Matching..? : "+result4);
		
		boolean result5 = Pattern.matches("[.][a-z]*[.][a-z]+",".co.in");
		System.out.println("Is User-Input & Regex Pattern for User-Input Are Matching..? : "+result5);
		
		boolean result6 = Pattern.matches("[a-z]*[.][a-z]+","co.in");
		System.out.println("Is User-Input & Regex Pattern for User-Input Are Matching..? : "+result6);
		
		boolean result7 = Pattern.matches("[.][a-z]+",".in");
		System.out.println("Is User-Input & Regex Pattern for User-Input Are Matching..? : "+result7);
		
		boolean result8 = Pattern.matches("[a-z]+","in");
		System.out.println("Is User-Input & Regex Pattern for User-Input Are Matching..? : "+result8);
		
		boolean result9 = Pattern.matches(" "," ");
		System.out.println("Is User-Input & Regex Pattern for User-Input Are Matching..? : "+result9);
	}

}
