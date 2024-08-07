import java.util.Scanner;

public class Scanners {
  public static void main(String[] args) {
    // Creates a variable stdin that initializes the scanner class with the InputStream constructor (in).
    Scanner stdin = new Scanner(System.in);

    System.out.print("What is your name: ");
    String name = stdin.next(); // get String using .next() subroutine

    System.out.print("How old are you: ");
    int age = stdin.nextInt(); // get int using .nextInt() subroutine

    System.out.print("What is your height: ");
    double height = stdin.nextDouble(); // get double using .nextDouble() subroutine

    System.out.print("True or False: ");
    boolean myBool = stdin.nextBoolean(); // get boolean using .nextBoolean() subroutine

    // Output result of input values
    System.out.println("\nYour name is " + name);
    System.out.println("Your are " + age + " year's old");
    System.out.println("You are " + height + " feet tall");
    System.out.println("Your boolean value is " + myBool);

    // ! Note: By default, the code above will only work when single values are entered into the
    // input.
    // This is the default behaviour of the scanner which breaks down it's inputs into tokens using
    // a delimiter pattern, which by default matches whitespace.
    // Source: https://docs.oracle.com/javase/8/docs/api/java/util/Scanner.html


    // Solution, you can utilize the .nextLine() subroutine or use a new-line (\n) delimiter
    // If a .nextLine() subroutine precedes a .next() subroutine, the .nextLine() subroutine will
    // get skipped. To fix this, define the .nextLine() subroutine at the top to ignore the
    // whitespace character.
    // Solution: https://stackoverflow.com/a/78351134/14021166
    System.out.print("Enter a long text: ");
    stdin.nextLine();
    String longText = stdin.nextLine();
    System.out.println(longText);

    // Add delimiter pattern to Scanner.
    System.out.println("Enter another long text");
    Scanner stdinNewLine = stdin.useDelimiter("\n");
    String longTextDel = stdinNewLine.next();
    System.out.println(longTextDel);

    // Close the scanner to save memory and avoid resource leak.
    stdin.close();
  }
}

/*
 * Scanner is a class in Java found in the java.util package (java.util.Scanner) that is used to
 * read input from a user. This class breaks the inputs into tokens using a delimiter. The default
 * delimiter is a whitespace.
 * 
 * It also provides many subroutines for reading, and parsing primitive values and strings.
 * 
 * Steps to initialize and use Scanner Initialize the Scanner class by using the appropraite
 * constructor based on the input type such as InputStream, File, or String. The second step is to
 * wait for the input token using the hasNext() subroutine. Then use the next() method to read the
 * token and process them one by one. Finally, close the Scanner instance to release the system
 * resources.
 * 
 * Delimiter Other than whitespaces, you can specify the delimiter you want to use on the Scanner
 * class To specifiy the delimiter, use the subroutine useDelimiter("") which takes in a string
 * pattern. Scanner stdin = new Scanner(System.in).useDelimiter(",")
 */
