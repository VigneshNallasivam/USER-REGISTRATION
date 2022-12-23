package com.java.basics;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import java.util.regex.PatternSyntaxException;
public class Exception 
{
	/*
	 * EXCEPTION CODING FOR USER-NAME
	 */
	String input = "N.VigneshWaran";
	String regex = "^(N)[.][A-Za-z+";
	String replace = "^(N)[.][A-Za-z]+";
	boolean result;
	public void nameCheck()
	{
		boolean result = false;
		try
		{
			System.out.println("Given Input : "+input);
			System.out.println("Given Regex : "+regex);
			result = Pattern.matches(regex,input);

		}
		catch(PatternSyntaxException e)
		{
			System.out.println(e.getMessage());
			System.out.println("Is Valid : NAME : "+result);
		}
		finally
		{
			name();
		}
	}
	public void name()
	{
		System.out.println("Replace Regex is : "+replace);
		result = Pattern.matches(replace, input);
		System.out.println("Is Valid : NAME : "+result);
	}
	/*
	 * EXCEPTION CODING FOR USER-MOBILE NUMBER
	 */
	String input1 = "91-7339370023";
	String regex1 = "^(91)[-][0-9+";
	String replace1 = "^(91)[-][0-9]+";
	boolean result1;
	public void phoneCheck()
	{
		try
		{
			System.out.println();
			System.out.println("Given Input : "+input1);
			System.out.println("Given Regex : "+regex1);
			result1 = Pattern.matches(regex1,input1);

		}
		catch(PatternSyntaxException e)
		{
			System.out.println(e.getMessage());
			System.out.println("Is Valid : MOBILE NUMBER : "+result1);
		}
		finally
		{
			phone();
		}
	}
	public void phone()
	{
		System.out.println("Replace Regex is : "+replace1);
		result1 = Pattern.matches(replace1,input1);
		System.out.println("Is Valid : MOBILE NUMBER : "+result1);
	}
	/*
	 * EXCEPTION CODING FOR USER-MAIL ID
	 */
	String input2 = "vickyshanestark@gmail.com";
	String regex2 = "[a-z]+[@][a-z]+[.][a-z+";
	String replace2 = "[a-z]+[@][a-z]+[.][a-z]+";
	boolean result2;
	public void mailCheck()
	{
		try
		{
			System.out.println();
			System.out.println("Given Input : "+input2);
			System.out.println("Given Regex : "+regex2);
			result2 = Pattern.matches(regex2,input2);

		}
		catch(PatternSyntaxException e)
		{
			System.out.println(e.getMessage());
			System.out.println("Is Valid : MAIL ID : "+result2);
		}
		finally
		{
			mail();
		}
	}
	public void mail()
	{
		System.out.println("Replace Regex is : "+replace2);
		result2 = Pattern.matches(replace2,input2);
		System.out.println("Is Valid : MAIL ID : "+result2);
	}
	/*
	 * EXCEPTION CODING FOR USER-PASSWORD
	 */
	String input3 = "#vignesh@0023$$";
	String regex3 = "[#][a-z]+[@][0-9]+[$+";
	String replace3 = "[#][a-z]+[@][0-9]+[$]+";
	boolean result3;
	public void passwordCheck()
	{
		try
		{
			System.out.println();
			System.out.println("Given Input : "+input3);
			System.out.println("Given Regex : "+regex3);
			result2 = Pattern.matches(regex3,input3);

		}
		catch(PatternSyntaxException e)
		{
			System.out.println(e.getMessage());
			System.out.println("Is Valid : PASSWORD : "+result3);
		}
		finally
		{
			password();
		}
	}
	public void password()
	{
		System.out.println("Replace Regex is : "+replace3);
		result3 = Pattern.matches(replace3,input3);
		System.out.println("Is Valid : PASSWORD : "+result3);
	}
	/*
	 * MAIN/DRIVER CODING
	 */
	public static void main(String[] args)
	{
		Exception objx = new Exception();
		objx.nameCheck();
		objx.phoneCheck();
		objx.mailCheck();
		objx.passwordCheck();
	}
}
