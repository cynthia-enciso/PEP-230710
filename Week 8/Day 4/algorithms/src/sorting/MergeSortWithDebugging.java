package sorting;

import java.util.Arrays;

public class MergeSortWithDebugging {
    public static void main(String[] args) {
        int[] arr = { 64, 34, 25, 12, 22, 11, 90 };

        // Call the merge sort function
        mergeSort(arr, 0, arr.length - 1);

        // Print the sorted array
        System.out.println(Arrays.toString(arr));
    }

    public static void mergeSort(int[] arr, int left, int right) {
        System.out.println("Current array: ");
        System.out.print("[ ");
        for (int i = left; i <= right; i++) {
            System.out.print(arr[i] + " " );
            
        }
        System.out.print("]\n");
        System.out.println("Left: " + left + " and right: " + right);

        // if you are working with an array of 2+ (if left and right are not equal)
        if (left < right) {
            // find the midpoint
            int middle = (left + right) / 2;

            // Recursively sort the left and right sub-arrays
            System.out.println("======== Merge Sort called on Left Array! ========");
            mergeSort(arr, left, middle);
            System.out.println("======== Merge Sort called on Right Array! ========");
            mergeSort(arr, middle + 1, right);

            // Merge the sorted sub-arrays
            System.out.println("Merging: ");
            System.out.print("[ ");
            for (int i = left; i <= middle; i++) {
                System.out.print(arr[i] + " " );
                
            }
            System.out.print("] and ");
            System.out.print("[ ");
            for (int i = middle + 1; i <= right; i++) {
                System.out.print(arr[i] + " " );
                
            }
            System.out.print("]\n");
            merge(arr, left, middle, right);
        }
        
    }

    public static void merge(int[] arr, int left, int middle, int right) {
        // Find the sizes of the left and right sub-arrays
        int size1 = middle - left + 1; 
        int size2 = right - middle;

        // Create temporary arrays to hold the left and right sub-arrays
        int[] leftArr = new int[size1];
        int[] rightArr = new int[size2];

        // Copy the elements of the left and right sub-arrays into the temporary arrays
        for (int i = 0; i < size1; i++) {
            leftArr[i] = arr[left + i];
        }

        for (int i = 0; i < size2; i++) {
            rightArr[i] = arr[middle + 1 + i];
        }

        // Merge the temporary arrays back into the original array
        int i = 0;
        int j = 0;
        int k = left;

        while (i < size1 && j < size2) {
            if (leftArr[i] <= rightArr[j]) {
                arr[k] = leftArr[i];
                i++;
            } else {
                arr[k] = rightArr[j];
                j++;
            }
            k++;
        }

        // Copy any remaining elements from the left sub-array (should already be
        // sorted)
        while (i < size1) {
            arr[k] = leftArr[i];
            i++;
            k++;
        }

        // Copy any remaining elements from the right sub-array (should already be
        // sorted)
        while (j < size2) {
            arr[k] = rightArr[j];
            j++;
            k++;
        }

    }
}
