public class ControlStructures {
  public static void main(String[] args) {
    // Block statement
    {
      double PI = 3.14; // inaccessible local variable outside this block.
      System.out.println("What is the value of PI?");
      System.out.printf("The value of PI is: %.2f", PI);
      System.out.println(PI);
    }
    System.out.println("\nEnd of block statement");
  }
}

/*
Control structures are essentially ways to perform complex tasks in programming: In Java, there are six control structures:

* block,
* while loop,
* do while loop, 
* for loop,
* if else statement,
* switch statement.

Block
The block statement is the simples statement used to group a seqeunce of statements into a single statement.
The format of the block statement:
{
〈 statements 〉
}

Variables declared inside a block is not accessible ouside of the block. This is legal and can be useful for certain scenarios. A good example is to save memory. When the computer executes the variable statement, it allocates memory to hold the value of the variable. When the block ends, this variable is then discarded from memory.
*/