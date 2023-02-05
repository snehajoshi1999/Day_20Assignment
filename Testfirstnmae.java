package com.brizlabs.Testcase.Maven.testcases.junit;
import java.util.Scanner;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

import org.junit.*;



public class Testfirstnmae {
	
		
		
			
			Scanner sc = new Scanner (System.in);
			//User_Registration user = new User_Registration();
			
			
			// pattern for first name
			
			@Test
			public void fName() {

				System.out.println(" Enter the First Name: ");
				String fname = sc.next();
				
				String actual = (fname);
				String excepted = "sneha";

				Assert.assertEquals(excepted,actual);
	}
		}



