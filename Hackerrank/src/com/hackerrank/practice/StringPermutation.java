package com.hackerrank.practice;

public class StringPermutation {
	
	
public static void permute(String input, int start,int end){
  char[] arrayInput=input.toCharArray();	
  if(start==end) 
	  System.out.println(input);
  else{
	  for(int i=start;i<end;i++){
		char c=arrayInput[start];
		arrayInput[start]=arrayInput[i];
		arrayInput[i]=c;
		permute(new String(arrayInput),start+1,end);
		c=arrayInput[start];
		arrayInput[start]=arrayInput[i];
		arrayInput[i]=c;
	  }
  }
}


	
	
public static void main(String[] args){
	String input="arif";
	permute(input,0,input.length());
}
}
