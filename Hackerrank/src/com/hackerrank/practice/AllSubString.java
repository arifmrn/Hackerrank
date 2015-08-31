package com.hackerrank.practice;

public class AllSubString {

	static void allSubString(String input){
		for(int i=1;i<=input.length();i++){
			for(int j=0;j+i<=input.length();j++){
			   System.out.println(input.substring(j,j+i));
			}
	}
	}
	
	public static void main(String[] args){
		allSubString("abc");
	}
}
