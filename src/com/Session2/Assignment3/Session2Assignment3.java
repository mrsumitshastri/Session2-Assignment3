package com.Session2.Assignment3;

import java.util.Scanner;

public class Session2Assignment3 {

	public static void main(String[] args) {
		
		/*
		 * 
		 * Write a code using loops to print following pattern.
				1
				12
				123
				1234
				12345
				1234
				123
				12
				1
		 * 
		 * Output 
		 * Enter Length : 10
			1
			12
			123
			1234
			12345
			1234
			123
			12
			1
		 * 
		 */
		
		Scanner keyboard = new Scanner(System.in);
		System.out.println("Enter Length : ");
		int length = keyboard.nextInt();
		int midPoint =(int) Math.ceil(length/2);
		for(int i=1; i<=midPoint ; i++)
		{
			for(int j = 1; j<=i; j++)
			{
				System.out.print(j);
			}
			System.out.println();
		}
		for(int i=midPoint-1; i>=1; i--)
		{
			for(int j =1; j<=i; j++)
			{
				System.out.print(j);
			}
			System.out.println();
		}
		
	}

	
}
