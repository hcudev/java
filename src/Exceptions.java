import java.util.Scanner;

public class Exceptions {
  public static void main(String[] args) {
    Scanner stdin = new Scanner(System.in);
    int dividend;
    int divisor;
    int quotient;

    // Catching ArithmeticException: / by zero
    try {
      System.out.println("Division Calculator");
      System.out.println("Enter the first integer");
      dividend = stdin.nextInt();

      System.out.println("Enter the second integer");
      divisor = stdin.nextInt();

      quotient = dividend / divisor;
      System.out.println("The result is: " + quotient);
    } catch (ArithmeticException error) {
      System.out.println(error + "\nPlease enter a divisor greater than zero");
    }
    
    double x;
    try {
      x = Double.parseDouble("string"); // illegal number. 
      System.out.println("The number is " + x);
    } catch (NumberFormatException e) {
      System.out.println("Not a legal number");
      x = Double.NaN;
    } finally {
      System.out.println("The program is ended.");
    }
    stdin.close();
  }
}

/*
Exceptions are erroneous conditions that breaks the normal flow of a program.
When an error occurs during the execution of a program,
the default behavior is to terminate the program and to print an error message.
However, Java makes it possible to “catch” such errors and program a response
different from simply letting the program crash. This is done with the try.catch statement.

Exceptions in Java are represented as objects of type Exception.
There are different types of exception in the exception subclass.
For example: NumberFormatException, ArithmeticException: / by zero.

The NumberFormatException can occur when an attempt is made to convert a string into a number.
Such conversion are done using Integer.parseInt and Integer.parseDouble.
An ArithmeticException: / by zero can occur when an attempt to divide an integer by zero is made.

* Try Catch
When an exception is thrown, (for example if Integer.parseInt(str) is called with a string
that does not evaluate to a number, it throws an exception).
It is possible to catch the exception before it happens to prevent it from crashing the program.

try {
  < Statemen(s) >
} catch(< exception class name > < variable name >) {
  < statement(2) >
}

The statement in the try block first gets executed, if no exception error occurs,
the program skips the catch statement and proceeds with the rest of the program.
However, if an exception occurs, the statement in the catch block gets executed.
The exception class name could be any of the exception examples shown earlier like NumberFormatException
and the variable name could be anything used to store the value of the exception object.
This object contains subroutines that can be used to get certain values from the Exception object.
For example error.getmessage() prints the error message from the Exception object

The try catch statement contains an optional block called finally.
This block gets executed at the end of the try catch statement. The "finally" statement
does not depend on any of the other two statements. It will get executed regardless of the options.
*/