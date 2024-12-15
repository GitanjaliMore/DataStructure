package com.edu;

class Stack1{
	static final int MAX =10;
	int top ;
	char a[] = new char[MAX];
	
	 boolean isEmpty() 
	    { 
	        return (top < 0); 
	    } 
	    Stack1() 
	    { 
	        top = -1; 
	    } 


	    boolean push(char x) 
	    { 
	        if (top >= (MAX - 1)) { 
	            System.out.println("Stack Overflow"); 
	            return false; 
	        } 
	        else { 
	            a[++top] = x; 
	            System.out.println(x + " pushed into stack"); 
	            return true; 
	        } 
	    } 
	
    char peek() 
    { 
        if (top < 0) { 
            System.out.println("Stack Underflow"); 
            return 0; 
        } 
        else { 
            char x = a[top]; 
            return x; 
        } 
    } 


}


public class CharStack {


	public static void main(String[] args) {
		Stack s = new Stack();
		s.push('a');
		s.push('b');
		s.push('c');
		System.out.println(s.peek()+"  is a top of the element");


	}


}