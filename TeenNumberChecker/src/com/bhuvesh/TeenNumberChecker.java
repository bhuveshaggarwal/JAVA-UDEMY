package com.bhuvesh;

public class TeenNumberChecker {
    public static boolean hasTeen(int First, int Second, int Third){
        if((First >=13 && First <=19) || (Second >=13 && Second <=19) || (Third >=13 && Third <=19)){
            return true;
        }
        else {
            return false;
        }
    }
    public static boolean isTeen(int Number){
        if(Number >=13 && Number <=19){
            return true;
        }
        else {
            return false;
        }
    }
}
