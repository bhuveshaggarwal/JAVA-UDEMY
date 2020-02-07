package com.bhuvesh;

public class MinutesToYearsDaysCalculator {
    public static void printYearsAndDays(long minutes) {
        if (minutes<0){
            System.out.println("Invalid Value");
        } else {
            long Years = minutes/525600;
            long Days = minutes % 525600;
            Days = Days / 1440;
            System.out.println(minutes + " min " + "= " + Years + " y " + "and " + Days + " d"  );
        }

    }
}
