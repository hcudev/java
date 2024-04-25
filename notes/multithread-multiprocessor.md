## Multithreading

This is a fundamental concept in concurrent programming that allows for the execution of multiple threads within a single process. It enables developers design and implement applications that can perform multiple task concurrently, thereby improving efficiency and responsiveness.

To use the full potential of all the computer processor, you will need to write programs that can do **parallel processing**. There are several reasons to use parallel programming:

- Doing comuptations faster, by setting several processors to work on them simultaneously.
- Dealing with **blocking** operations, where a process can't proceed until a some event occurs.

Threads make it possible for one part of a program to continue to do useful work while another part is blocked, waiting for some event to occur. In this context, threads are a vital programming tool even for a computer that has only a single processing unit.

In Java, a single task is called a **thread**, which refers to a "thread of control", or "thread of execution", meaning a sequence of instructions that are executed one after another.

Every Java program has at least one thread, which is created when the Java machine runs the program. it creates a thread that is responsible for executing the main routine of the program. This main thread can in turn create other threads that can continue even after the main thread has terminate

## Creating and Running Threads

In Java, a thread is represented by an object belonging to the class `java.lang.Thread`, or to a subclass of this class. The purpose of a `Thread` object is to execute a single method and to execute it just once. This method represents the task to be carried out by the thread.

Once this happens, there is no way to restart the thread or to use the same `Thread` object to start another thread.

There are two ways to program a thread, one is to create a subclass of Thread and to define the method `public void run()` in the subclass. The method defines the task that will be performed by the thread. For example:

### 1. Define Subclass of Thread

```java
// Create subclass of Thread
public class Multithread {
  public class SomeThread extends Thread {
    private String name // name of this thread

    // Constructor assigns name to thread
    public SomeThread(String name) {
      this.name = name;
    }

    // Run method prints message to standard output.
    public void run() {
      System.out.println("Hello from thread " + name);
    }
  }

  public static void main(String[] args) {
    SomeThread greetings = new SomeThread("John");
    greetings.start();
  }
}
```

The purpose of the `start()` method is to create the new thread of control that will execute the Thread object's `run()` method. The new thread runs in parallel with the thread in which the `start()` method was called, along with any other threads that already existed.

## Indetermincay in Threads

In a simplest Java program, there is a guarantee of order-of-execution: the first line in `main()` will be executed first, then the next, and so on, with appropriate tracing in and out of other methods. Thread weakens this guarantee.

In a multithreaded program, "Hello 5 from thread B" might appear on your screen before or after "Hello 1 from thread A" and the order might differ on successive executions of the same program, even on the same computer.

```java
SomeThread greetings = new SomeThread("Carlos");
greetings.start();
System.out.println("Thread Begins");
```

After `greetings.start()` is executed, there are two threads. One of them will print "Thread has been started", while the other one wants to print "Hello from Thread Carlos". Both thread prints simultaneously and will competer for access to standard output. Whichever thread happens to be the first to get access will be the first to print its message. In a normal, single-threaded program, things happen in a definite, predictable order from beginning to end. In a multi-threaded program, there is a fundamental indeterminacy. You can’t be sure what order things will happen in.

### 2. Runnable

This is the second way of creating a thread. This involves defining a class that implements the interface `java.lang.Runnable`.

## When to use Runnable

Object orientation in Java defines singly inherited classes, which has consequences for multithreading coding. In an object design that already involves inheritance, this simply wouldn't work. You cannot simultaneously inherit from `RenderedObject` or `ProductionLine` or `MessageQueue` alongside `Thread`.

```java
  public static class SomeRunnable implements Runnable {
    private String name;

    public SomeRunnable(String name) {
      this.name = name;
    }

    public void run() {
      System.out.println("Hello from " + name + " Runnable");
    }
  }

  public static void main(String[] args) {
    // Create Thread object to use it
    SomeThread greetings = new SomeThread("Ben");

    // Run the thread
    greetings.start();
    System.out.println("Thread Started!");

    // Create Runnable object
    SomeRunnable runnable = new SomeRunnable("Peter");
    Thread greetings2 = new Thread(runnable);

    greetings2.start();
  }
```

The advantage of doing things this way is that any object can implement the Runnable interface
and can contain a run() method, which can then be executed in a separate thread

So for those classes that cannot extend Thread, you must create a runnable to take advantage of multithreading
