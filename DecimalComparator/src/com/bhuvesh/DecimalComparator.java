package com.bhuvesh;

public class DecimalComparator {
    public static boolean areEqualByThreeDecimalPlaces(double FirstNumber , double SecondNumber){
        if ( (int) (FirstNumber * 1000) == (int) (SecondNumber * 1000) ){
            return true;
        }
        else {
            return false;
        }
    }
}
