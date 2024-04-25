public class StringFormatting {
  public static void main(String[] args) {
    System.out.println(Math.PI); // 3.141592653589793
    // System.out.printf() produces formatted output.
    double amount = 134004440.443;
    System.out.printf("%1.2f", amount); // returns a double to 2 decimal places
    System.out.println("");
    System.out.printf("%1.3f", amount); // returns a double with 3 decimal places
    System.out.println();

    // %d acts as a variable for substituting values
    int x = 10;
    int y = 15;
    System.out.printf("The sum of %d and %d is %d", x, y, x + y); // %d will replace the parameters
                                                                  // passed into the formatted
                                                                  // output.
  }
}

/*
 * Text Input and Output The most basic output function is System.out.print(x). This expression is
 * output to a destination called standard output.
 * 
 * System.out.print outputs real numbers with as many digits after the decimal point as necessary.
 * For example ⊼ is output as 3.141592653589793. Java has a formatted output capability that makes
 * it easy to control how real numbers and other values are printed.
 * 
 * System.out.printf() produces formatted output. It takes in one or more parameters. The first is a
 * String that specifies the format of the output. This parameter is called the format string. The
 * remaining parameters specify the values that are to be output.
 * 
 * Format specifiers: %c character %d decimal (integer) number (base 10) %e exponential
 * floating-point number %f floating-point number %i integer (base 10) %o octal number (base 8) %s
 * String %u unsigned decimal (integer) number %x number in hexadecimal (base 16) %t formats
 * date/time %% print a percent sign \% print a percent sign
 * 
 * Width and padding %12d, %10s, %1.2f, %15.8e %1.8g.
 * 
 * Escpae Characters: \b backspace \f next line first character starts to the right of current line
 * last character \n newline \r carriage return \t tab \\ backslash
 * 
 * 
 * Every format specifier begins with a percent sign (%) and ends with a letter, possibly with some
 * extra formatting information
 */
