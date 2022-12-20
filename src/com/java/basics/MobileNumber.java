package com.java.basics;

import java.util.regex.Pattern;

public class MobileNumber 
{
	public static void main(String[] args)
	{
		boolean result = Pattern.matches("^(91)[ ][0-9]+","91 7339370023");
		System.out.println("Is User-Input & Regex Pattern for User-Input Are Matching..? : "+result);
	}

}
