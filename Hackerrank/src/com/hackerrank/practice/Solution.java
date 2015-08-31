package com.hackerrank.practice;
/*import java.io.*;
import java.util.Scanner;
public class Solution {
	 private int maxSize;
	   private long[] stackArray;
	   private int top;
	   public Solution(int s) {
	      maxSize = s;
	      stackArray = new long[maxSize];
	      top = -1;
	   }
	   public void push(long j) {
	      stackArray[++top] = j;
	   }
	   public long pop() {
	      return stackArray[top--];
	   }
	   public long peek() {
	      return stackArray[top];
	   }
	   public void increment(int x,int d){
		   for(int i=0;i<x;i++){
			   stackArray[i]+=d; 		   
		   }
	   }
	   public boolean isEmpty() {
	      return (top == -1);
	   }
	   public boolean isFull() {
	      return (top == maxSize - 1);
	   }
	   public static void main(String[] args) {
		   Scanner s= new Scanner(System.in);
		   int n=s.nextInt();
		   Solution superStack = new Solution(n);
		   String result="";
		   for(int i=0;i<n+1;i++){
		       String op=s.nextLine();
			   if(op.startsWith("push")){
				   superStack.push(Long.parseLong(op.split(" ")[1]));
				   result+=superStack.peek()+"\n";
			   }
			   if(op.startsWith("pop")){
				   superStack.pop();
				   if(superStack.isEmpty())
					   result+="EMPTY"+"\n";
				   else	   
				   result+=superStack.peek()+"\n";
				   
			   }
			   if(op.startsWith("inc")){
				   String[] values=op.split(" ");
				   int x=Integer.parseInt(values[1]);
				   int d=Integer.parseInt(values[2]);	  
				   superStack.increment(x,d);
				   result+=superStack.peek()+"\n";   
		   }
		  
	   }
		   System.out.println(result);
	   }
}
	   
 */

import java.util.*;
import java.text.*;
import java.io.BufferedWriter;
import java.math.*;
import java.util.regex.*;

public class Solution {

	static String calculateScore(String text, String prefix, String suffix) {
		String result = "";
		int maxpre = 0;
		int maxpost = 0;
		int maxpattern = 0;

		for (int i = 0; i < text.length(); i++) {
			int pretext = 0;
			int posttext = 0;
			int pattern = 0;

			if (prefix.endsWith(text.substring(0, i))) {
				pretext = i;
				if (pretext > maxpre) {
					maxpre = pretext;
				}
			}
			if (suffix.startsWith(text.substring(i,text.length()-1))) {
				posttext = i;
				if (posttext > maxpost) {
					maxpost = posttext;
				}
			}
			pattern = maxpre + maxpost;
			if (pattern > maxpattern) {
				maxpattern = pattern;
				
			}
		}

		return result;
	}

	public static void main(String[] args) {
		//System.out.println(calculateScore("nothing", "bruno", "ingenious"));
	
	}
	
}