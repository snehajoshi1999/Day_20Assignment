package com.brizlabs.Testcase.Maven.testcases.junit;

import java.util.Scanner;

import org.junit.Test;

public class validateEmail {
	
	@Test
	public void fName() {
	Scanner sc=new Scanner(System.in);
	System.out.println("Enter your email");
String email=sc.next();

String regex="[a-zA-Z0-9+_.-]+@[a-zA-Z0-9+.-]+$";

boolean result=email.matches(regex);

System.out.println(result);

if (result==true)
{
System.out.println("your email is valid");

}
else
{
System.out.println("your email is not valid");
}
}

}
