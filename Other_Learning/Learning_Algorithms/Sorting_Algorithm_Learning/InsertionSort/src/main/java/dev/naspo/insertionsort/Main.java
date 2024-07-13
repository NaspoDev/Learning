package main.java.dev.naspo.insertionsort;


import java.util.Arrays;

public class Main {

    // Insertion Sort
    // To sort an array of size N in ascending order iterate over the array and compare the current
    // element (key) to its predecessor, if the key element is smaller than its predecessor, compare it to the
    // elements before. Move the greater elements one position up to make space for the swapped element.

    public static void main(String[] args) {
        // We will be sorting by ascending order.

        int[] arr = {3, 2, 8, 5, 3, 9, 4};
        int temp = 0;

        System.out.println("Starting array: " + Arrays.toString(arr));
        System.out.println("Insertion sort steps:");

        // Starting at the second element because there is nothing before the first to compare.
        for (int i = 1; i < arr.length; i++) {

            // while current is less than previous, swap them.
            while (arr[i] < arr[i - 1]) {
                temp = arr[i -1];
                arr[i -1] = arr[i];
                arr[i] = temp;


                if (i >= 2) {
                    i--;
                    // stop comparing backwards if we've reached the beginning of the array.
                } else {
                    break;
                }
            }

            System.out.println(Arrays.toString(arr));
            // otherwise they are sorted, continue to compare the next pair.
        }

        System.out.println("Sorted array: " + Arrays.toString(arr));
    }
}
