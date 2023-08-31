# Algorithm
- step by step instructions for performing a task
- there are many common programming problems, such as:
    - finding a value in a group of values
    - sorting a group of values

---

# Measuring Algorithms
- a reliable way to measure performance of an algorithm is to figure out what its running time tends to be based on when it receives more and more input
    - algorithms that slow down if they are given a lot of input don't perform well
    - algorithms that still perform fast even if given a lot of input are more ideal
- another thing to consider is that algorithms don't perform exactly the same every time they receive input of the same size
    - consider searching 10 values linearly and the correct value is right at the front (best case)
    - consider searching 10 values linearly and the correct value is at the back (worst case)
- Big O Notation represents the worst case running time of an algorithm as is the most commonly used notation to use to measure

---

# Running Time Categories (From Best to Worst)
- O(1): constant. runtime is the same regardless of input size.
- O(log n): logarithmic. as input increases, runtime doesn't increase too much
    - algorithms that are in this category reduce the size of the input it cares about in each step
- O(n): linear. as input increases, runtime increases linearly, or at a consistent rate
    - algorithms that are in this category perform actions for every value in the input
- O(n log n) : linearithmic or quasilinear. as input increases, runtime increases linearly and then some
    - algorithms that are in this category could be dividing the input into halves repeatedly, but then performs a linear operation on the results (merging for the sorting algorithms)
- O(n^2): quadratic. as input increases, runtime increases exponentially (a whole lot)
    - algorithms that are in this category might need to perform actions for every value, and the actions themselves need to perform actions on every value
- bigocheatsheet.com has a nice graph that can help to visualize these notations

