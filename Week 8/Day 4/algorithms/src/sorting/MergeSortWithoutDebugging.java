package sorting;

import java.util.Arrays;

public class MergeSortWithoutDebugging {
    public static void main(String[] args) {
        int[] arr = { 64, 34, 25, 12, 22, 11, 90 };

        // Call the merge sort function
        mergeSort(arr, 0, arr.length - 1);

        // Print the sorted array
        System.out.println(Arrays.toString(arr));
    }

    public static void mergeSort(int[] arr, int left, int right) {
        // if you are working with an array of 2 +
        if (left < right) {
            int middle = (left + right) / 2;
            // Recursively sort the left and right sub-arrays
            mergeSort(arr, left, middle);
            mergeSort(arr, middle + 1, right);
            // Merge the sorted sub-arrays
            merge(arr, left, middle, right);
        }
    }

    public static void merge(int[] arr, int left, int middle, int right) {
        // Find the sizes of the left and right sub-arrays

        // all values to the left of mid and mid as well go into left array
        int size1 = middle - left + 1; 

        // all values to the right of mid go into right array
        int size2 = right - middle; 

        // Create temporary arrays to hold the left and right sub-arrays
        int[] leftArr = new int[size1];
        int[] rightArr = new int[size2];

        // Copy the elements of the left and right sub-arrays into the temporary arrays
        for (int i = 0; i < size1; i++) {
            leftArr[i] = arr[left + i]; // left is the first element in the left subarray. adding i leads to the correct position in the original array.
        }
        for (int j = 0; j < size2; j++) {
            rightArr[j] = arr[middle + 1 + j]; // middle + 1 = first element in right subarray. adding j leads to correct position in the original array.
        }

        // Merge the temporary arrays back into the original array
        int i = 0, j = 0; // left and right array's variable
        int k = left; // original array's variable

        // while both subarrays still have elements to iterate over...
        while (i < size1 && j < size2) {
            // compare values from each array, add lesser value to original array
            if (leftArr[i] <= rightArr[j]) {
                arr[k] = leftArr[i];
                i++;
            } else {
                arr[k] = rightArr[j];
                j++;
            }
            k++; // after the comparison, change original array position
        }

        // Copy any remaining elements from the left sub-array, if any (should already be sorted)
        while (i < size1) {
            arr[k] = leftArr[i];
            i++;
            k++;
        }

        // Copy any remaining elements from the right sub-array, if any (should already be sorted)
        while (j < size2) {
            arr[k] = rightArr[j];
            j++;
            k++;
        }
    }
}
