package com.java.basics;

import java.util.regex.Pattern;

public class PasswordSpecial 
{
	public static void main(String[] args)
	{
		boolean result = Pattern.matches("[A-Za-z0-9]{8}[#]+","hefBvjn9#");
		System.out.println("Is User-Input & Regex Pattern for User-Input Are Matching..? : "+result);
	}
}
