package com.hackerrank.practice;

public class Power {
	static int power(int x,int n){
		if(n==0)
			return 1;
		if(n==1)
			return x;
		int temp=n/2;
		int halfValue=power(x,temp);
		if(n%2==0)
			return halfValue*halfValue;
		else
			return halfValue*halfValue*x;
		
	}
public static void main(String[] args){
	System.out.println(power(5,0));
}
}
