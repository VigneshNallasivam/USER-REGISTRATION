package com.java.basics;
import java.util.regex.Pattern;
public class ValidMails 
{
	public static void main(String[] args)
	{
		boolean result1 = Pattern.matches("[a-z]+[@][a-z]+[.][a-z]+[,]","abc@yahoo.com,");
		System.out.println("Is Valid..? : "+result1);
		
		boolean result2 = Pattern.matches("[a-z]+[-][0-9]+[@][a-z]+[.][a-z]+[,]","abc-100@yahoo.com,");
		System.out.println("Is Valid..? : "+result2);
		
		boolean result3 = Pattern.matches("[a-z]+[.][0-9]+[@][a-z]+[.][a-z]+","abc.100@yahoo.com");
		System.out.println("Is Valid..? : "+result3);
		
		boolean result4 = Pattern.matches("[a-z]+(1){3}[@][a-z]+[.][a-z]+[,]","abc111@abc.com,");
		System.out.println("Is Valid..? : "+result4);
		
		boolean result5 = Pattern.matches("[a-z]+[-][0-9]+[@][a-z]+[.][a-z]+[,]","abc-100@abc.net,");
		System.out.println("Is Valid..? : "+result5);
		
		boolean result6 = Pattern.matches("[a-z]+[.][0-9]+[@][a-z]+[.][a-z]+[.][a-z]+","abc.100@abc.com.au");
		System.out.println("Is Valid..? : "+result6);
		
		boolean result7 = Pattern.matches("[a-z]+[@](1)[.][a-z]+[,]","abc@1.com,");
		System.out.println("Is Valid..? : "+result7);
		
		boolean result8 = Pattern.matches("[a-z]+[@][a-z]+[.][a-z]+[.][a-z]+","abc@gmail.com.com");
		System.out.println("Is Valid..? : "+result8);
		
		boolean result9 = Pattern.matches("[a-z]+[+][0-9]+[@][a-z]+[.][a-z]+","abc+100@gmail.com");
		System.out.println("Is Valid..? : "+result9);
	}
}
