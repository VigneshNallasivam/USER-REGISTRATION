package com.java.basics;
import java.util.ArrayList;
import java.util.function.Supplier;
import java.util.regex.Pattern;
public class LambdaExpression 
{
	
	String fName = "Vignesh";
	String lName = "Waran";
	String mNo = "91-7339370023";
	String eMail = "vickyshanestark@gmail.com";
	String pWord = "#vignesh0023$";
	
	String fNameRegex = "[A-Za-z]+" ;
	String lNameRegex = "[A-Za-z]+" ;
	String mNoRegex = "^(91)[-][0-9]+";
	String eMailRegex = "[a-z]+[@][a-z]+[.][a-z]+" ;
	String pWordRegex = "[#][a-z0-9]+[$]" ;
	
	public void firstName()
	{
		boolean fNameResult = Pattern.matches(fNameRegex,fName);
		Supplier obj = () -> {return fNameResult;};
		System.out.println(obj.get());
	}
	
	public void lastName()
	{
		boolean lNameResult = Pattern.matches(lNameRegex, lName);
		Supplier obj = () -> {return lNameResult;};
		System.out.println(obj.get());
	}
	 
	public void mobileNumber()
	{
		boolean mNoResult = Pattern.matches(mNoRegex, mNo);
		Supplier obj = () -> {return mNoResult;};
		System.out.println(obj.get());
		
	}
	
	public void emailID()
	{
		boolean eMailResult = Pattern.matches(eMailRegex, eMail);
		Supplier obj = () -> {return eMailResult;};
		System.out.println(obj.get());
	
		
	}
	
	public void password()
	{
		boolean pWordResult = Pattern.matches(pWordRegex, pWord);
		Supplier obj = () -> {return pWordResult;};
		System.out.println(obj.get());

		
	}
	
	public String toString()
	{
		return ("***The Inputs Are***" +"\nFIRST NAME : "+fName+"\nLAST NAME : "+lName+"\nMOBILE-NUMBER : "+mNo+"\nEMAIL-ID : "+eMail+"\nPASSWORD : "+pWord);
	}
	
	public void show()
	{
		System.out.println("\n***The Regex Inputs Are***");
		System.out.println("FIRST NAME REGEX IS : "+fNameRegex);
		System.out.println("LAST NAME REGEX IS : "+lNameRegex);
		System.out.println("LAST NAME REGEX IS : "+mNoRegex);
		System.out.println("EMAIL-ID REGEX IS : "+eMailRegex);
		System.out.println("PASSWORD REGEX IS : "+pWordRegex);
		
	}
	public static void main(String[] args)
	{
		LambdaExpression objx = new LambdaExpression();
		System.out.println(objx.toString());
		objx.show();
		System.out.println("\nThe Result Is : ");
		objx.firstName();
		objx.lastName();
		objx.mobileNumber();
		objx.emailID();
		objx.password();
	}

}
