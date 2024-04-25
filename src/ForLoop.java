public class ForLoop {
  public static void main(String[] args) {
    int n;
    for (n = 1; n <= 10; n++) {
      System.out.println(n);
    }

    // Print all even numbers between 1 - 20
    System.out.print("Even numbers\n");
    int num;
    for (num = 1; num <= 20; num++) {
      if (num % 2 != 0) {
        continue;
      }
      System.out.println(num);
    }
  }
}

/*
 * For loop statement are similar to the while loop but easier to write. In a for loop, the
 * initialization, continuation condition and counter updating are combined in the first line of the
 * loop. This keeps everything involved in the control in one place.
 * 
 * Syntax for(<initialization>; <continuation-condition>; <updpate>) <statement>
 * 
 * The continuation condition must be a boolean-valued expression, the initilization is usually a
 * declaration or an assignment statement, the update can be any simple statement but is usually an
 * increment, a decrement or an assignment statement. If the continuation condition is empty, it
 * would be treated as true and the loop will run infinitely. for (;;) instead of while(true)
 */
