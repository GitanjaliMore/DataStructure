package com.edu;

import java.util.Scanner;


public class BubbleSort {


	public static void main(String[] args) {
		int a[];
		int n;
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Size of an array");
		n=sc.nextInt();
		a=new int[n];
		
	System.out.println("Enter "+n+" elements to an array");
	for(int i=0;i<n;i++) {
		a[i]=sc.nextInt();
	}
	
	//BubbleSort
	for(int i=0;i<n;i++) {
		for(int j=0;j<n-1-i;j++) { //4 2 12 9 3 4
			                   //  2 4 9 3 4 12
			if(a[j]>a[j+1]) {
				int t=a[j];   //t=4
				a[j]=a[j+1];  //a[0]=2  a[1]=2 
				a[j+1]=t;
				 
			}
		}
	}
	 System.out.println("Soted elements are ");
	  for(int i=0;i<n;i++) {
			System.out.println(a[i]);
		}


	}


}