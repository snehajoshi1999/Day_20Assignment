package com.brizlabs.Testcase.Maven.testcases.junit;

import java.io.PrintWriter;
import java.io.StringWriter;
import java.util.Scanner;

import org.junit.Assert;
import org.junit.Test;

public class testnumber {
	
	@Test
	public void testAdd(){
		testnumber ap = new testnumber();
		
		Scanner sc = new Scanner (System.in);
		System.out.println(" Enter the no : ");
		int var=sc.nextInt();
	int actual = var;
	int expected = 98;
	Assert.assertEquals(expected,actual);
	}
}
