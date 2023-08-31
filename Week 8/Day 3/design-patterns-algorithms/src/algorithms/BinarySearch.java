package algorithms;

public class BinarySearch {
    public static void main(String[] args) {
        // binary search only works on SORTED values
        int result = binarySearch(new int[] {1, 2, 3, 4, 5, 6, 7, 8, 9, 10}, 2);
        System.out.println(result);
    }

    public static int binarySearch(int[] array, int targetValue) {
        // create variables needed
			// beginning index
            int beginningIndex = 0;

			// end index
            int endIndex = array.length - 1;
		
		// WHILE we still have at least one element to iterate over
        while (beginningIndex <= endIndex) {
            // find the midpoint
            int midpointIndex = (endIndex + beginningIndex) / 2;

            // get value at midpoint
            int midpointValue = array[midpointIndex];

            // IF value of midpoint == target value 
            if (midpointValue == targetValue) {
                // THEN return midpoint
                return midpointIndex;
            }
			// ELSE IF value of midpoint < target value 
            else if (midpointValue < targetValue) {
                // THEN change the beginning index to midpoint + 1
                beginningIndex = midpointIndex + 1;
            } else {
                // ELSE change the end index to midpoint - 1
                endIndex = midpointIndex - 1;
            }
        }
		// END OF WHILE LOOP

		// RETURN -1 if target not found
        return -1;
    }
}
