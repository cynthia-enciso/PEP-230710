# Searching and Sorting Algorithms
- Linear Search: O(n) - method of finding an element in a group of elements by starting at one end of the group and chekcing every element until value is found, or end of group is reached.

- Binary Search: O(log n) - method of finding an element in a group of elements by comparing the target element to the element at the middle. If the midpoint is not the target element, only the relevant half of the remaining elements are looked through. This process is repeated until element is found or there are no more elements to search through. 

- Bubble Sort: O(n^2) - method of sorting elements using a loop nested inside another. The outer loop represents the amount of "passes" to make over the group of elements. The inner loop is used to compare and swap adjacent elements. When the inner loop goes over the entire group of elements, this is one "pass". 

- Merge Sort: O(n log n) - method of sorting elements using recursion (method calls itself). If the current section of the group is more than one element, keep "breaking apart" the group in half. Do this until you have only are working with one element for each half. At this point, start merging all the halves together, working backwards.