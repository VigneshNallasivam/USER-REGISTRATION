package com.java.basics;

import java.util.regex.Pattern;

public class PasswordOne 
{
	public static void main(String[] args)
	{
		boolean result = Pattern.matches("[a-z]{8}+","hefbvjno");
		System.out.println("Is User-Input & Regex Pattern for User-Input Are Matching..? : "+result);
	}
}
