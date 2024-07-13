import java.util.Arrays;

// Bubble Sort algorithm
// Upon each pass of iterating the list, compare each pair of values and swap if necessary.

public class Main {
    public static void main(String[] args) {
        int[] arr = {10, 7, 8, 9, 1, 3, 7, 5};
        System.out.println("Array before sorting: " + Arrays.toString(arr));
        bubbleSort(arr);
        System.out.println("Array after sorting: " + Arrays.toString(arr));
    }

    public static void bubbleSort(int[] arr) {
        // Main iterator. Iterate over the length of the array.
        for (int i = 0; i < arr.length; i++) {
            boolean swapped = false;

            // Upon each array iteration, iterate every element and compare, and swap if necessary.
            for (int j = 0; j < arr.length - 1; j++) {
                if (arr[j + 1] < arr[j]) {
                    //swap
                    int temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                    swapped = true; // set swapped to true
                }
            }

            // If nothing has been swapped this iteration, then the list is sorted and
            // there is no need to continue comparing. Exit.
            if (!swapped) {
                break;
            }
        }
    }
}