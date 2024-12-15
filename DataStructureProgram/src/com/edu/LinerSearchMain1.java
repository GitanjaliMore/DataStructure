package com.edu;

import java.util.Scanner;


public class LinerSearchMain1 {


	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n;
		
		System.out.println("Enter the size of array :");
		n=sc.nextInt();
		int arr[] = new int[n];
		int pos=0;
		int count=0;
		System.out.println("Enter the Array elements");
		
		//get input from user
		for(int i=0;i<n;i++) {
			arr[i]=sc.nextInt();
		}
		System.out.println("Enter the key value");
		int key =sc.nextInt();
		
		//search element
		for(int i=0;i<n;i++) {
			if(arr[i]==key) {
				pos=i+1;
				System.out.println(arr[i]+" Position "+pos);
				count++;
			}
		}
		if(count>0) {
			System.out.println("Successful Search");
			System.out.println(key +" found at position ="+pos);
			System.out.println("count ="+count);
		}
		else {
			System.out.println("Unsuccessful search");
		}
		


	}


}