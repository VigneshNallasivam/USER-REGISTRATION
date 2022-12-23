package com.java.basics;

import java.util.regex.Pattern;

public class MobileNumber 
{
	public static void main(String[] args)
	{
		boolean result = Pattern.matches("[0-9]{2}\\s{1}[6-9]{1}[0-9]{9}","91 9339370023");
		System.out.println("Is User-Input & Regex Pattern for User-Input Are Matching..? : "+result);
	}

}
