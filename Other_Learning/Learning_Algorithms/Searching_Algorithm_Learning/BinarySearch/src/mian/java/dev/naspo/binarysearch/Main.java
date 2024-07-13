package mian.java.dev.naspo.binarysearch;

public class Main {

    // Binary Search
    // Assumes list is sorted.
    // It works by repeatedly dividing in half the portion of the list that could contain the item,
    // until you've narrowed down the possible locations to just one

    public static void main(String[] args) {
        // our sorted array of integers
        int[] arr = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14, 15, 16, 17, 18, 19, 20};
        System.out.println("Target of 17 found at index " +
                binarySearch(arr, 17, 0, arr.length - 1) +
                "!");

    }

    public static int binarySearch(int[] arr, int target, int floorIndex, int cielIndex) {
        // If there is no more list to iterate, target was never in the array. (Base case)
        if (floorIndex > cielIndex) {
            System.out.println("Target not found!");
            return -1;
        }

        // Get the middle index of the current range.
        int middleIndex = Math.floorDiv(floorIndex + cielIndex, 2);

        // If middle number == target, we are done.
        if (arr[middleIndex] == target) {
            return middleIndex;
        }

        if (target < arr[middleIndex]) {
            return binarySearch(arr, target, floorIndex, middleIndex - 1);
        }

        if (target > arr[middleIndex]) {
            return binarySearch(arr, target, middleIndex + 1, cielIndex);
        }

        return -1;
    }
}