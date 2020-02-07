package com.bhuvesh;

public class Main {

    public static void main(String[] args) {
        System.out.println(LastDigitChecker.hasSameLastDigit(25,35,555));
        System.out.println(LastDigitChecker.hasSameLastDigit(5,35,555));
        System.out.println(LastDigitChecker.hasSameLastDigit(25,-35,555));

        System.out.println(LastDigitChecker.isValid(2561));
        System.out.println(LastDigitChecker.isValid(251));
        System.out.println(LastDigitChecker.isValid(-2561));
    }
}
