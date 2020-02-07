package com.bhuvesh;

public class LargestPrime {
    public static int getLargestPrime(int number){
        int count = 0;
        int Prime = 0;
        if (number <= 1) {
            return -1;
        } else {
            for (int i = 2; i <= number; i++) {
                if (number % i == 0) {
                    for (int j = 2; j <= i; j++) {
                        if (i % j == 0) {
                            count++;
                        }
                    }
                    if (count == 1) {
                        if (Prime < i) {
                            Prime = i;
                        }
                    }
                    count = 0;
                }
            }
            return Prime;
        }
    }
}
