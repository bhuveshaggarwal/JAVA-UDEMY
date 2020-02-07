package com.bhuvesh;

public class Main {

    public static void main(String[] args) {
        System.out.println(NumberOfDaysInMonth.isLeapYear(2020));
        System.out.println(NumberOfDaysInMonth.isLeapYear(2017));
        System.out.println(NumberOfDaysInMonth.isLeapYear(-2020));

        System.out.println(NumberOfDaysInMonth.getDaysInMonth(1,-2020));
        System.out.println(NumberOfDaysInMonth.getDaysInMonth(2,2020));
        System.out.println(NumberOfDaysInMonth.getDaysInMonth(5,2017));
        System.out.println(NumberOfDaysInMonth.getDaysInMonth(-9,2020));


    }
}
