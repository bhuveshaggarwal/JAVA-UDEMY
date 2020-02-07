package com.bhuvesh;

public class PerfectNumber {
    public static boolean isPerfectNumber (int number){
        int i , Sum = 0;
        if(number < 1){
            return false;
        }else {
            for(i = 1 ; i < number ; i++) {
                if(number % i == 0)  {
                    Sum = Sum + i;
                }
            }
            if (Sum == number){
                return true;
            }else
                return false;
        }
    }
}
