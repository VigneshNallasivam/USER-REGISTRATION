package com.java.basics;
import java.util.Arrays;
import java.util.Collection;
import org.junit.jupiter.api.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;

@RunWith(Parameterized.class)
class ParameterJunitTest 
{
	String regex;
	String input;
	boolean result;
	ParameterJunitTest(boolean result,String regex,String input)
	{
		this.regex = regex;
		this.input = input;
		this.result = result;
	}
	@Test
	public void chectTest()
	{
		ParameterJunit objx = new ParameterJunit();
		objx.assertEquals(result, regex, input);
	}

	@Parameterized.Parameters
	public static Collection givings() 
	{
		return Arrays.asList(new Object[][] 
				{
			{ true,"[a-zA-Z]+","Vignesh"},
			{true,"[a-zA-z]+","Waran" },
			{true,"[a-z]+[@][a-z]+[.][a-z]+","vickyshanestark@gmail.com"},
			{true,"^(91)[-][0-9]+","91-7339370023"},
			{ true,"[#]+[A-Za-z0-9]+[@]+","##733ABXcx@@"}

				});

	}

}
