package com.bhuvesh;

public class SumOddRange {
    public static boolean isOdd(int number) {
        if (number < 0) {
            return false;
        } else if (number % 2 != 0) {
            return true;
        } else
            return false;
    }

    public static int sumOdd(int start, int end) {
        if (start<0 || end<0 || start>end){
            return -1;
        }
        int sum = 0;
        for (int i = start; i <= end; i+=2) {
            if(start % 2 == 0){
                start++;
            }
            for (i = start; i <= end; i+=2) {
                // i will always be odd
                sum+=i;
            }
        }
        return sum;
    }
}