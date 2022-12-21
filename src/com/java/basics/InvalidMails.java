package com.java.basics;
import java.util.regex.Pattern;
public class InvalidMails 
{
	public static void main(String[] args)
	{
	boolean result1 = Pattern.matches("[a-z]*","abc");
	System.out.println("1).Is Valid..? : "+result1);
	
	boolean result2 = Pattern.matches("[a-z]*[@][.][a-z]*[.][a-z]*","abc@.com.my");
	System.out.println("2).Is Valid..? : "+result2);
	
	boolean result3 = Pattern.matches("[a-z0-9]*[@][a-z]*[.](a)","abc123@gmail.a");
	System.out.println("3).Is Valid..? : "+result3);
	
	boolean result4 = Pattern.matches("[a-z0-9]+[@][.][a-z]*","abc123@.com");
	System.out.println("4).Is Valid..? : "+result4);
	
	boolean result5 = Pattern.matches("[a-z0-9]+[@][.][a-z]*[.][a-z]*","abc123@.com.com");
	System.out.println("5).Is Valid..? : "+result5);
	
	boolean result6 = Pattern.matches("[.][a-z]+[@][a-z]*[.][a-z]*",".abc@abc.com");
	System.out.println("6).Is Valid..? : "+result6);
	
	boolean result7 = Pattern.matches("[a-z]*[(][)][*][@][a-z]+[.][a-z]+","abc()*@gmail.com");
	System.out.println("7).Is Valid..? : "+result7);
	
	boolean result8 = Pattern.matches("[a-z]+[@%*.]+[a-z]+","abc@%*.com");
	System.out.println("8).Is Valid..? : "+result8);
	
	boolean result9 = Pattern.matches("[a-z]+[..]+[0-9]+[@][a-z]+[.][a-z]+","abc..2002@gmail.com");
	System.out.println("9).Is Valid..? : "+result9);
	
	boolean result10 = Pattern.matches("[a-z]+[.@]+[a-z]+[.][a-z]+","abc.@gmail.com");
	System.out.println("10).Is Valid..? : "+result10);
	
	boolean result11 = Pattern.matches("[a-z(@)]+[a-z]+[.][a-z]+","abc@abc@gmail.com");
	System.out.println("11).Is Valid..? : "+result11);
	
	boolean result12 = Pattern.matches("[a-z]+[@][a-z]+[.][a-z]+[.](.a)","abc@gmail.com.1a");
	System.out.println("12).Is Valid..? : "+result12);
	
	boolean result13 = Pattern.matches("[a-z]+[@][a-z]+[.][a-z]+[.](.a)[.](.u)","abc@gmail.com.aa.au");
	System.out.println("13).Is Valid..? : "+result13);
	}
}
