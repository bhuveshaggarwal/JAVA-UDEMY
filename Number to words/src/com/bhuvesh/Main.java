package com.bhuvesh;

public class Main {

    public static void main(String[] args) {
	NumberToWords.numberToWords(2560);
	NumberToWords.numberToWords(-2);
        System.out.println(NumberToWords.reverse(-2));
        System.out.println(NumberToWords.reverse(-3554));
        System.out.println(NumberToWords.reverse(565258));
    }
}
