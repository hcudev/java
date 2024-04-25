import java.util.Scanner;

public class WhileLoop {
  public static void main(String[] args) {
    Scanner stdin = new Scanner(System.in);

    // While loop
    while (true) {
      System.out.println("Infinite Loop\n"); // This line alone will produce an infinite loop because the base case (condition) is always true.
      break; // Terminates the loop
    }

    // Loop that prints 1 - 5
    int number = 1;
    while (number < 6) {
      System.out.println(number);
      number++;
    }
    System.out.println("While Loop Done!");

    // Loop to calculate average of a set of integers
    // formulae: average = sum of numbers / number of integers

    int num; // integer input by the user
    int sum; // sum of all integers
    int count; // number of integers input by the user
    double average; // average of num input

    sum = 0;
    count = 0;

    System.out.print("Enter your first number: ");
    num = stdin.nextInt();

    while (num != 0) {
      sum += num; // Add number to running sum
      count++; // Count the input by adding 1 to count

      System.out.print("Enter your next number, or 0 to end: ");
      num = stdin.nextInt();
    }

    // Display the result
    if (count == 0) {
      System.out.println("You didn't enter any number");
    } else {
      average = ((double) sum) / count;
      System.out.println("\nYou entered " + count + " positive integers.");
      System.out.printf("Total average is %.3f", average);
    }

    System.out.println("\n-------- Interest Calculation --------");

    // Compute the amount of an interest earned over an investment over a period of 5 years.
    // formulae = rate / 100 * principlal amount
    double principal;
    double rate;
    int years = 0;
    double totalInterest = 0;

    System.out.println("What is the Principal Amount? ");
    principal = stdin.nextDouble();

    System.out.println("What is the Interest Rate? ");
    rate = stdin.nextDouble();

    while (years < 5) {
      double interest;
      interest = rate / 100 * principal;
      System.out.printf("The interest of year %d is %.2f \n", years + 1, interest);

      years++;

      totalInterest += interest;
    }
    // Calculate total interest for 5 years
    System.out.printf("The total interest of %f for %d years is %.2f", principal, years, totalInterest);

    // Do While Loop
    System.out.println("\n-------- Do While Loop --------");

    boolean playAgain;
    String prompt;
    int someNum;

    do {
      playAgain = true;
      System.out.println("Pick a number");
      someNum = stdin.nextInt();
      System.out.println("You picked number " + someNum);

      System.out.println("Do you want to play again? 'Yes' or 'No'");
      prompt = stdin.next().toLowerCase();
 
      if (prompt.equals("no")) {
        playAgain = false;
      } else if (prompt.equals("yes")){
        playAgain = true;
      } else {
        System.out.println("Invalid Response");
        break;
      }
      
    } while (playAgain);
    System.out.println("Game over :(");
    stdin.close();
  }
}

/*
Compound statements, such as while loops and if statements, are used to
organize simple statements into complex structures, which are called control structures because
they control the order in which the statements are executed.

* While Loop
A while loop is a control structure used to repeat a given statement while a certain condition remains true.
The format for the while statement:
while (〈boolean-expression 〉)
〈statement 〉

or using the block form:
while (〈boolean-expression 〉) {
〈statements 〉
}

* Semantics of While Loop
When the computer comes to a while statement, the boolean expression (condition) is first evaluated, if the condition is true, the statement inside the loop is executed, and the process is repeated continuously until the condition is fale. If the condition is false, the loop is terminated.

The while loop only terminates when the condition is false at the begining of executing the loop statement. If the condition is false somewhere in the middle of the loop, the loop still continues to the end of the expression. It goes back to the begining to test the condition again before it can be terminated.

* Loop to calculate average of a set of integers
Let sum = 0 // The total sum of integers entered by the user
Let count = 0 // The number of integers entered by the user

Read an integer
while the integer is not zero:
  Add the integer to the sum
  Count it
  Read an integer
Divide sum by count to get average
Print out the average

* Do While Loop
Sometimes it is more convenient to test the continuation condition at the end of the loop, instead of at the beginning, as is done in the while loop. The do..while statement is very similar
to the while statement, except that the word “while,” along with the condition that it tests,
has been moved to the end.

do
〈statement 〉
while ( 〈boolean-expression 〉 );

do {
〈statements 〉
} while ( 〈boolean-expression 〉 );

* Semantics of Do While Loop
To execute a do while loop, the computer first executes the statemen(s) inside the body of the loop, and then it evaluates the boolean expression. If the value of the expression is true, it returns to the beginning of the do loop and repeates the process until it is false and then the loop is terminated.

Since the boolean conditon is not tested until the end of the loop, the body of a do loop is always executed at least once.

* Example: Loop to prompt a user to continue a game after a yes response

do {
  Play a Game
  Ask the user if he wants to play another game.
  Read the user's response
} while (the user's response is yes);

This can be futher simplified as:
boolean wantsToContinue;  // True if user wants to play again

do {
  Checkers.playGame();
  System.out.print("Do you want to play again?");
  wantsToContinue = stdin.nextBoolean();
} while (wantsToContinue);

Although a do..while statement is sometimes more convenient than a while statement, any problem that can be solved using do..while loops can also be solved using only while statements, and vice versa.

For example, this:

do {
  doSomething();
} while (expression);

is the same as

while(expression) {
  doSomething();
}

and as: 

if ( 〈boolean-expression 〉 ) {
do {
〈doSomething 〉
} while ( 〈boolean-expression 〉 );
}

* Break and Continue

The break and continue statements are jump statements that allow us skip some statements inside a loop or terminate the loop immediately

* Break
The break statement is used for breaking out of the middle of any loop. When a break statement in a loop is executed, it will immediately jump out of the loop, and continue on to whatever follows the loop in the program.
*/