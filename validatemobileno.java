package com.brizlabs.Testcase.Maven.testcases.junit;

import java.util.Scanner;

import org.junit.Test;

public class validatemobileno {
	
	@Test
	public void fName() {
		
	
	Scanner sc=new Scanner(System.in);
	System.out.println("Enter your phone no");
        String phone=sc.next();

String regex="^\\d{10}$";

boolean result=phone.matches(regex);

System.out.println(result);

}
}