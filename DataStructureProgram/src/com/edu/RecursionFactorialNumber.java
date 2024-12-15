package com.edu;

public class RecursionFactorialNumber {
	private static int findFact(int n) {
		if(n==0|| n==1)
			return 1;
		else return(n*findFact(n-1));
	}
	
	public static void main(String[]args) {
		int n=6;
		int f=findFact(n);
		System.out.println("Factorial of "+n+" is"+f);
	}
}
