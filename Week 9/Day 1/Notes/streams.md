# Stream API
- the Stream API allows you to create pipelines, or sequences of aggregate operations, on streams of data.
- Stream: sequence of data 
- Streams do not STORE the data (like collections), they move the elements through the pipeline
- Streams do not manipulate the original source of data 
- functional programming - useful for completing a series complex tasks on the data to get a result

---

# Pipelines
- require a source of data, like a collection
- can contain zero or more intermediate operations

---

# Intermediate Operations
- produce a new stream
- filter()
- map()

---

# Terminal Operations
- produces a non-stream value OR no value at all
- forEach()
- reduction operation: a type of terminal operation that produce a single result
- reduce()
- max()
- min()
- average()
- collect() uses the help of the Collectors class for a more specific return value (supplmentary): https://docs.oracle.com/javase/8/docs/api/java/util/stream/Collectors.html

---

# Resources
- https://docs.oracle.com/javase/tutorial/collections/streams/index.html
- https://docs.oracle.com/javase/8/docs/api/java/util/stream/Stream.html

