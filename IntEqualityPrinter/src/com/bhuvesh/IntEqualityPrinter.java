package com.bhuvesh;

public class IntEqualityPrinter {
    public static void printEqual(int First, int Second, int Third){
        if(First <0 || Second <0 || Third <0){
            System.out.println("Invalid Value");
        } else if (First == Second && Second == Third){
            System.out.println("All numbers are equal");
        } else if (First != Second && Second != Third && First != Third){
            System.out.println("All numbers are different");
        } else {
            System.out.println("Neither all are equal or different");
        }
    }
}
