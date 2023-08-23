# Set
- collection that does not contain duplicates
- this interface provides set operations (union, intersection, difference)

---

# Implementations
- HashSet: insertion order not guaranteed
- LinkedHashSet: maintains insertion order
- TreeSet: elements are sorted

---

# Useful Methods
- addAll() - (union) adds elements from one set to the other, no duplicates 
- retainAll() - (intersection) retains only common elements between two sets
- removeAll() - (difference) removes all elements from first set that are contained in second set