package com.bhuvesh;

public class NumberPalindrome {
    public static boolean isPalindrome (int number){
        int reverse = 0;
        int remainder;
        int temp = number;
        while( number != 0 )
        {
            remainder = number % 10;
            reverse = reverse * 10 + remainder;
            number = number/10;
        }
        if (temp == reverse){
            return true;
        }else
            return false;
    }
}
