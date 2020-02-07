package com.bhuvesh;

public class EqualSumChecker {
    public static boolean hasEqualSum (int FirstNumber, int SecondNumber, int ThirdNumber){
        if ( (int) (FirstNumber) + (int) (SecondNumber) == (int) (ThirdNumber)){
            return true;
        }
        else{
            return false;
        }
    }
}
