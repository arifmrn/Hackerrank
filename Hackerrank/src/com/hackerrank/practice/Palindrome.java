package com.hackerrank.practice;

public class Palindrome {


public static boolean isPalindrome(String input) {
    if (input == null||input.isEmpty()) {
        return false;
    }
    input=input.toLowerCase();
    int left = 0;
    int right = input.length() - 1;
    while (left < right) {
        if (input.charAt(left++) != input.charAt(right--)){ 
            return false;
        }
    }
    return true;
}


}
