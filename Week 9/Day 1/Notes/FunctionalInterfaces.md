# Common Functional Interfaces
They are defined in the java.util.function package and are often used with streams and other Java classes.
https://docs.oracle.com/javase/8/docs/api/java/util/function/package-summary.html

## Supplier<T>
* 0 parameters
* T get()
* returns a value of type T

## Consumer<T>
* 1 parameter
* void accept(T)
* returns void

## BiConsumer<T, U>
* 2 parameters
* void accept(T, U)
* returns void

## Predicate<T>
* 1 parameter
* boolean test(T)
* returns a value of type boolean

## BiPredicate<T, U>
* 2 parameters
* boolean test(T, U)
* returns a value of type boolean

## Function<T, R>
* 1 parameter
* T apply(T)
* returns a value of type R

## BiFunction<T, U, R>
* 2 parameters
* R apply(T, U)
* returns a value of type R