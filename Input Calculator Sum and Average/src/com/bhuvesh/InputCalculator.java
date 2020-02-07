package com.bhuvesh;
import java.util.Scanner;

public class InputCalculator {
    public static void inputThenPrintSumAndAverage(){
        Scanner scanner=new Scanner(System.in);
        int sum=0, count=0;
        while (true) {
            boolean hasNextInt=scanner.hasNextInt();
            if(hasNextInt){
                int inputNumber=scanner.nextInt();
                sum += inputNumber;
                count++;
            }
            else{
                long avg=Math.round((double)sum/(double)count);
                System.out.println("SUM = "+sum+" AVG = "+avg);
                break;
            }
        }
    }
}