package com.sorting;

import java.util.Random;

public class RandomArray {
    public static int[] random(int size){
        int[] arr = new int[size];
        Random random = new Random();
        for (int i = 0; i < size; i++) {
            arr[i] = random.nextInt(1000);
        }
        return arr;
    }
}
