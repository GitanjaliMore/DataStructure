package com.edu;

import java.util.Scanner;


public class LinearSearchMain {


	public static void main(String[] args) {
		int a[]=new int[5];
		int key,pos=0;
		
		//accept array elements
		//get input from user
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter array elements");
		for(int i=0;i<a.length;i++) {
			a[i]=sc.nextInt();
		}
		
		System.out.println("Enter key element to search in an array");
		key=sc.nextInt();
		
		//Search : Linear Search
		for(int i=0;i<a.length;i++) {  //{4,3,1,9,9}  //key =9
			if(a[i] == key) {  //4==9  ,3==9  1==9  9==9
				pos=i+1; //pos=3+1
				break;
			}
		}
         if(pos>0) {
        	 System.out.println("Successful search");
        	 System.out.println(key+" found at postion "+pos);
         }else {
        	 System.out.println("Unsuccessful Search");
         }
	}


}

