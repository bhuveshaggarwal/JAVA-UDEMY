package com.bhuvesh;

public class FirstLastDigitSum {
    public static int sumFirstAndLastDigit(int number) {
        int first = number, last = 0;
        if (number < 0) {
            return -1;
        } else if (number < 10 && number > 0) {
            return number+number;
        } else
            while (first >= 10) {

                first = first/10;
                last = number % 10;
            } return first + last;
    }
}
