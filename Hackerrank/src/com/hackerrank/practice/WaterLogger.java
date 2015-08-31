package com.hackerrank.practice;
import java.util.*;import java.io.*;

import java.text.*;
import java.math.*;
import java.util.regex.*;

public class WaterLogger {

    static int calcWaterStored() {
    	//int[] input=buildingBlocks;
    	int waterQuantity=0;
    	//int[] input={2,4,6,7,9,8,5,3,1};
    	//int[]  input={4,6,3,2,8,5,1,8};
    	int[] input={2,4,6,7,9,8,5,3,1};
    	for(int i=0;i<input.length;i++){
    		
    		System.out.println("i beg"+i);
        		int wallLowest=0;
        	 	int quantity=0;
    		if(i+1!=input.length&&input[i]>input[i+1]){
    			int j=i+1;

    			if(j==input.length)
    				break;
    			for(;input[j]<input[i]&&j<input.length;){
    				j++;
    				if(j==input.length&&input[j-1]==input[i])
    					  j=j-1;
    					if(j==input.length)
    						break;
    			}
    			if(j!=input.length&&input[j]<=input[i]){
    				wallLowest=input[j];
    			}else if(j!=input.length){
    				wallLowest=input[i];
    			}else{
    				wallLowest=0;
    			}
    			
    			while(j!=input.length&&i<j-1&&wallLowest!=0){
    				i++;
    				
    				quantity +=wallLowest-input[i];
    				System.out.println(wallLowest+" "+quantity);
    			}
    			i=j-1;
    					}
    		
			System.out.println("i"+i+" "+quantity);
            waterQuantity +=quantity;
            quantity=0;
    	}
		return waterQuantity;


    }



	 public static void main(String[] args) { 
		 System.out.println(calcWaterStored());
	 }
	}