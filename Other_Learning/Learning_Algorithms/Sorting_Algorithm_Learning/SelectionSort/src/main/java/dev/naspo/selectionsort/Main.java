package main.java.dev.naspo.selectionsort;

import java.util.Arrays;

public class Main {

    // Selection Sort
    // It works by taking the smallest element in an unsorted array and bringing it to the front

    public static void main(String[] args) {
        int[] arr = {2, 8, 5, 3, 9, 4, 1};
        System.out.println("Array before sorting: " + Arrays.toString(arr));
        selectionSort(arr);
        System.out.println("Array after sorting: " + Arrays.toString(arr));
    }

    public static void selectionSort(int[] arr) {
        // Iterating the array
        for (int i = 0; i < arr.length; i++) {
            int currentMinIndex = i;

            // At each iteration, check for a smaller number than the current.
            for (int j = i + 1; j < arr.length; j++) {
                if (arr[j] < arr[currentMinIndex]) {
                    currentMinIndex = j;
                }
            }

            // swap current number with current minimum.
            int temp = arr[i];
            arr[i] = arr[currentMinIndex];
            arr[currentMinIndex] = temp;
        }
    }
}