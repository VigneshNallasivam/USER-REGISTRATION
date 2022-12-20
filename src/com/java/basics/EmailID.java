package com.java.basics;
import java.util.regex.Pattern;
public class EmailID 
{
	public static void main(String[] args)
	{
		/*
		 * abc,bl,co are Mandatory so '*' is added at end position
		 * xyz,in are Optional so '+' is added at end position
		 */
		boolean result = Pattern.matches("[a-z]*[.][a-z]+[@][a-z]*[.][a-z]*[.][a-z]+","abc.xyz@bl.co.in");
		System.out.println("Is User-Input & Regex Pattern for User-Input Are Matching..? : "+result);
	}
}
