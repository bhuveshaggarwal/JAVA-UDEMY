package com.bhuvesh;

public class LastDigitChecker {
    public static boolean hasSameLastDigit(int a, int b, int c){
        if (a<10|| a>1000 || b<10|| b>1000 || c<10|| c>1000 ){
            return false;
        } else if(a%10==b%10 || b%10==c%10 || a%10==c%10){
            return true;
        }else
            return false;
    }
    public static boolean isValid(int d){
        if(d<10 || d>1000){
            return false;
        } else
            return true;
    }
}
