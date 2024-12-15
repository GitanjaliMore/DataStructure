package com.edu;

import java.util.Scanner;

public class BinarySearch {
    public static void main(String[] args) {
        // Sorted array in ascending order
        int[] arr = {1, 2, 3, 4, 5, 6};
        int n = arr.length;
        
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the key to search: ");
        int key = sc.nextInt(); // Input the key to be searched
        
        int l = 0;        
        int h = n - 1;     
        int pos = -1;      
        
        while (l <= h) {
            int mid = (l + h) / 2;  // Calculate mid index
            
            if (key == arr[mid]) {  // Check if key matches mid element
                pos = mid;          // Store the position
                break;              
            } else if (key > arr[mid]) {  // Check if key is greater than mid element
                l = mid + 1;        
            } else {                
                h = mid - 1;        
                }
        }
        
        // Output the result
        if (pos >= 0) {
            System.out.println("Successful search");
            System.out.println(key + " found at position " + (pos + 1));
        } else {
            System.out.println("Unsuccessful search");
            System.out.println(key + " is not found in the array.");
        }
    }
}