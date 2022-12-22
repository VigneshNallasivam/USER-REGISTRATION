package com.java.basics;

import java.util.regex.Pattern;

import junit.framework.Assert;

public class ParameterJunit
{
	public boolean assertEquals(boolean result,String regex,String input)
	{
		result = Pattern.matches(regex, input);
		return result;
	}
}