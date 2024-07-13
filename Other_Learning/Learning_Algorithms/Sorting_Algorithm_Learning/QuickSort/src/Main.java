import java.util.Arrays;

// Learning Quicksort Algorithm
public class Main {

    public static void main(String[] args) {
        int[] arr = {10, 7, 8, 9, 1, 3, 7, 5};
        System.out.println("Before: " + Arrays.toString(arr));
        quicksort(arr, 0, arr.length - 1);
        System.out.println(("After: " + Arrays.toString(arr)));
    }

    public static void quicksort(int[] arr, int floorIndex, int cielIndex) {
        // Base case.
        if (floorIndex >= cielIndex) {
            return;
        }

        int pivot = arr[cielIndex];

        int i = floorIndex - 1;
        for (int j = floorIndex; j < cielIndex; j++) {
            if (arr[j] < pivot) {
                i++;
                // swap j and i
                int temp = arr[j];
                arr[j] = arr[i];
                arr[i] = temp;
            }
        }

        i++;
        // swap i and pivot
        int temp = arr[i];
        arr[i] = pivot;
        arr[cielIndex] = temp;

        quicksort(arr, floorIndex, i - 1);
        quicksort(arr, i + 1, cielIndex);
    }
}