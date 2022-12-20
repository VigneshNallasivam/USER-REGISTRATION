package com.java.basics;
import java.util.regex.Pattern;
public class FirstName 
{
	public static void main(String[] args) 
	{
		boolean result = Pattern.matches("[A-Za-z]+","Vignesh");
		System.out.println("Is User-Input & Regex Pattern for User-Input Are Matching..? : "+result);
	}
}
