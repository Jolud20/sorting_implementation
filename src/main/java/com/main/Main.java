package com.main;

import com.sorting.RandomArray;
import static com.sorting.BubbleSort.bubbleSort;
import static com.sorting.QuickSort.quickSort;
import static com.sorting.util.Cycle.arrCycle;
import static com.sorting.InsertionSort.insertionSort;
import static com.sorting.MergeSort.mergeSort;
import static com.sorting.SelectionSort.selectionSort;

public class Main {
    public static void main(String[] args) {

        //Пузырьковый метод
        int[] arr = RandomArray.random(100);
        System.out.println("Массив до сортировки: ");
        System.out.println(arrCycle(arr));
        long startTime =System.currentTimeMillis();
        bubbleSort(arr);
        long endTime = System.currentTimeMillis();
        long executionTime = endTime - startTime;
        System.out.println("Время выполнения сортировки вставками: " + executionTime + " мс");
        System.out.println("Отсортированный массив  пузырьковый метод:");
        System.out.println(arrCycle(arr));
        System.out.println("\n");

        //Метод вставками
        System.out.println("\nМассив до сортировки: ");
        arr = RandomArray.random(100);
        System.out.println(arrCycle(arr));
        startTime =System.currentTimeMillis();
        insertionSort(arr);
        endTime = System.currentTimeMillis();
        executionTime = endTime - startTime;
        System.out.println("Время выполнения сортировки вставками: " + executionTime + " мс");
        System.out.println("Отсортированный массив, метод вставками:");
        System.out.println(arrCycle(arr));
        System.out.println("\n");

        //Метод выборки
        System.out.println("\nМассив до сортировки: ");
        arr = RandomArray.random(100);
        System.out.println(arrCycle(arr));
        startTime =System.currentTimeMillis();
        selectionSort(arr);
        endTime = System.currentTimeMillis();
        executionTime = endTime - startTime;
        System.out.println("Время выполнения сортировки вставками: " + executionTime + " мс");
        System.out.println("Отсортированный массив  методом выборки:");
        System.out.println(arrCycle(arr));
        System.out.println("\n");

        //Метод слиянием
        System.out.println("\nМассив до сортировки: ");
        arr = RandomArray.random(100);
        System.out.println(arrCycle(arr));
        startTime =System.currentTimeMillis();
        mergeSort(arr, 0, arr.length - 1);
        endTime = System.currentTimeMillis();
        executionTime = endTime - startTime;
        System.out.println("Время выполнения сортировки вставками: " + executionTime + " мс");
        System.out.println("Отсортированный массив  слиянием:");
        System.out.println(arrCycle(arr));
        System.out.println("\n");

        //Метод быстрой сортировки
        System.out.println("\nМассив до сортировки: ");
        arr = RandomArray.random(100);
        System.out.println(arrCycle(arr));
        startTime =System.currentTimeMillis();
        quickSort(arr, 0, arr.length-1);
        endTime = System.currentTimeMillis();
        executionTime = endTime - startTime;
        System.out.println("Время выполнения сортировки вставками: " + executionTime + " мс");
        System.out.println("Отсортированный массив  быстрой сортировки:");
        System.out.println(arrCycle(arr));
    }
}
