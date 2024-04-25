## Functional Interfaces

A functional interface is used to specify the content of a single subroutine and how it can be legally used. It is similar to a class and it can be defined in a `.java` file.

```java
public interface ArrayProcessor {
  void process(String[] myArray, int count);
}
```

This could be in a file called `ArrayProcessor.java`. It specifies a function named `process` with two parameters of type `Array`, and `int`.

Java comes with many standard functional interface, example; `Runnable` which is already in Java:

```java
public interface Runnable {
  public void(run);
}
```

The name of a functional interface is a type, just as `String` and `double` are types. This means it can be used to declare variables and parameters to specify the return type of a function.
