package com.mypackage;

public class IfElseStatements {
	public static void main(String args[]) {
		//1 . Check Even or Odd Number
		
//		int number=18;
//		if(number%2==0) {
//			  System.out.println("number is even"); 
//		}
//		else {
//			  System.out.println("number is odd"); 
//		}
//		//2. Check if a Person Can Vote
//		
//		int age=21;
//		if(age>=18) {
//			  System.out.println("Eligible for Voting"); 
//		}
//		else {
//			  System.out.println(" Not Eligible for Voting"); 
//		}
//		//3 . Positive or Negative Number
//		
//		int num=4;
//		if(num>0) {
//			 System.out.println("Number is Psitive"); 
//		}
//		else if(num<0) {
//			  System.out.println(" Number is negative"); 
//		}
//		else {
//			 System.out.println(" Number is Zero"); 
//		}
		
		//4 . Write a program to compare two numbers and print the greater one.
		
		int num1=100;
		int num2=20;
		if(num1>num2) {
			System.out.println( "Greater Number is "+num1); 
		}
		else if(num2>num1) {
			  System.out.println("Greater Number is "+num2); 
		}
		else {
			 System.out.println(" Both Numbers are Equal"); 
		}
		}
}