public class MultiThread {
  // Create subclass of Thread
  public static class SomeThread extends Thread {
    // Name of the thread
    private String name;

    // Constructor assigns name to thread
    public SomeThread(String name) {
      this.name = name;
    }

    // Run method prints message to standard output.
    public void run() {
      System.out.println("Hello from " + name + " Thread");
    }
  }

  // Create Runnable Thread
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
}
