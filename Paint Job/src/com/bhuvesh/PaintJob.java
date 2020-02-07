package com.bhuvesh;

public class PaintJob {
    public static int getBucketCount(double width, double height, double areaPerBucket, int extraBucKets) {
        if (width <= 0 || height <= 0 || areaPerBucket <= 0 || extraBucKets < 0) {
            return -1;
        }
        double wallArea = width * height;
        double totalBuckets = Math.ceil(wallArea / areaPerBucket);
        int requiredBuckets = (int) totalBuckets - extraBucKets;
        return requiredBuckets;
    }

    public static int getBucketCount(double width, double height, double areaPerBucket) {
        if ((width <= 0) || (height <= 0) || (areaPerBucket <= 0)) {
            return -1;
        }
        double wallArea = width * height;
        double totalBuckets = Math.ceil(wallArea / areaPerBucket);
        return (int) totalBuckets;
    }

    public static int getBucketCount(double area, double areaPerBucket) {
        if ((area <= 0) || (areaPerBucket <= 0)) {
            return -1;
        }
        double totalBuckets = Math.ceil(area / areaPerBucket);
        return (int) totalBuckets;
    }
}