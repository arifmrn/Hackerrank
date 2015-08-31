package com.hackerrank.practice;
import java.util.Scanner;


public class EncodeTo7 {

	public static String convertTo7(int num){
		String k="";
		while(num!=0){
			k+=num%7;
			num=num/7;
		}
		return reverse(k);
	}
    public static String reverse(String inp){
    	String reverse="";
    	 for ( int i = inp.length() - 1 ; i >= 0 ; i-- ){
             reverse = reverse + inp.charAt(i);
    	    }
    	return reverse;
    }
	public static void main(String[] args){
		Scanner s = new Scanner(System.in);
		int input= s.nextInt();
		String result=convertTo7(input);
		System.out.println(result);
		String encode="0atlsin";
		              // 0coupns
		int l=result.length()-1;
		String encoded="";
		 for ( int i = result.length()-1 ; i >= 0 ; i-- ){
			 char c=result.charAt(i); 
			 encoded+=encode.charAt(Integer.parseInt(Character.toString ((char) c)));
    	    }
		System.out.println(reverse(encoded));
			}
}
