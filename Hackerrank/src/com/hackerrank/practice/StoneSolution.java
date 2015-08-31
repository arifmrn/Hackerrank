package com.hackerrank.practice;
import java.io.*;
import java.util.Scanner;
public class StoneSolution {
	public static void main(String[] args) throws IOException {
		Scanner s = new Scanner(System.in);
		String sb="";
		int input= s.nextInt();
		for(int T = input; T > 0; --T){
            int N = s.nextInt();
            int A = s.nextInt();
            int B = s.nextInt();
             if (A > B){
            	 int temp = A;
                A = B;
                B = temp;
            }
            int val = ((int)--N)*A;
            int dval = B - A;
            sb+=val;
            if (dval > 0){
                while(N-- > 0){
                    sb+=" " + (val += dval);
                }
            }
            sb+="\n";
        }
        System.out.print(sb);
    }
    
}