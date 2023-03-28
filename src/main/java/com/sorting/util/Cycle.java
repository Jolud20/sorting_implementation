package com.sorting.util;

public class Cycle {
    public static String arrCycle(int [] arr){
        StringBuilder q= new StringBuilder();
        for (int j : arr) {
            q.append(j).append(" ");
        }
        return q.toString();
    }
}