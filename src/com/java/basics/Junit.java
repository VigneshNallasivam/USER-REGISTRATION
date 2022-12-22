package com.java.basics;
import static org.junit.jupiter.api.Assertions.*;
import java.util.regex.Pattern;
import org.junit.jupiter.api.Test;
import junit.framework.Assert;
class Junit 
{
	@Test
	void test1() 
	{
		System.out.println("REGEX : FIRST-NAME");
		boolean result1 = Pattern.matches("[A-Za-z]+","Vignesh");
		Assert.assertEquals(true, result1);
	}
	
	@Test
	void test2() 
	{
		System.out.println("REGEX : LAST-NAME");
		boolean result2 = Pattern.matches("[A-Za-z]+","Waran");
		Assert.assertEquals(true, result2);
	}
	
	@Test
	void test3() 
	{
		System.out.println("REGEX : MOBILE-NUMBER");
		boolean result3 = Pattern.matches("^(91)[-][0-9]+","91-7339370023");
		Assert.assertEquals(true, result3);
	}
	
	@Test
	void test4() 
	{
		System.out.println("REGEX : MAIL");
		boolean result4 = Pattern.matches("[a-z]+[@][a-z]+[.][a-z]+","vickyshanestark@gmail.com");
		Assert.assertEquals(true, result4);
	}
	
	@Test
	void test5() 
	{
		System.out.println("REGEX : PASSWORD");
		boolean result5 = Pattern.matches("[#]+[A-Za-z0-9]+[@]+","##733ABXcx@@");
		Assert.assertEquals(true, result5);
	}
}
