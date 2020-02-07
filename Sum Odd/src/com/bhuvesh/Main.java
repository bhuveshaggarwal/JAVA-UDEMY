package com.bhuvesh;

public class Main {

    public static void main(String[] args) {
        System.out.println(SumOddRange.isOdd(5));
        System.out.println(SumOddRange.isOdd(4));
        System.out.println(SumOddRange.isOdd(-5));

        System.out.println(SumOddRange.sumOdd(10,30));
        System.out.println(SumOddRange.sumOdd(-10,20));
        System.out.println(SumOddRange.sumOdd(10,2));
        System.out.println(SumOddRange.sumOdd(10,10));
        System.out.println(SumOddRange.sumOdd(17,17));

    }
}
