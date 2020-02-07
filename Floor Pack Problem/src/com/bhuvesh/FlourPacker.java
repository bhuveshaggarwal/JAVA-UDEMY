package com.bhuvesh;

public class FlourPacker {
    public static boolean canPack(int bigCount, int smallCount, int goal) {
        if (bigCount < 0 || smallCount < 0 || goal < 0)
            return false;
        bigCount *= 5;
        int sum = bigCount + smallCount;
        if (sum == goal || goal <= smallCount || goal == bigCount || sum >= goal && (smallCount - goal % 5) >= 0) {
            return true;
        } else
            return false;
    }
}
