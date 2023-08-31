package algorithms;

public class LinearSearch {
    public static void main(String[] args) {
        int result = linearSearch(new int[] {1, 2, 3, 4, 5}, 5);
		System.out.println(result);
    }

    public static int linearSearch(int[] array, int target) {
        // LOOP over each index of array
        for (int i = 0; i < array.length; i++) {
            // get element at index
            int currentElement = array[i];

            // IF current element is the same as the target element THEN
            if (currentElement == target) {
                // RETURN index of element
                return i;
            }
            // END IF
        }
        // END OF LOOP

        // RETURN -1 if we've made it this far (element not found)
        return -1;
    }
}
