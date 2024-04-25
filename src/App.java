
public class App {
 public static void main(String[] args) {
	 System.out.println("Hello World!");
	 System.out.println(2 + 2);
	 System.out.println("I said, \"Are you listening!\"");
	 System.out.println("é is a special \t character \r");
	 
	 // Declarations
	 
 }
}

//The Basic Java Application

/* Syntax are rules that specify the basic vocabulary of a language and how programs are constructed.
While Semantics refers to the meaning of a program; It is essentially a program that does what you want it to do.
Platform Independence: Java includes excellent support for network protocols, and it's platform independence makes it possible to write network programs that work on many different computers. 
 
The standard version of Java comes with support for many technologies such as cryptography, data compression, sound processing, and graphics. 

Java is also used to write programs for Android smartphones. */

//Variables and the Primitive Types
/* The most basic names are identifiers.

Identifiers can be used to name classes, variables and sub routines. 
Reserved Words/Identifiers include: class, public, static, if, else,
while. ETC. 
Style guidelines: It is customary for names of class to begin with upper
case letters, while names of variables and of subroutines begin with
lower case letters

Variables
Programs manipulate data that are stored in memory. In machine language,
data can only be referred to by giving the numerical address of the 
location in memory where the data is stored.
Variables are containers or boxes used to refer to data stored in memory.

Types:
Java is a strongly typed language because it only allows assignments of values to their 
appropriate type. Java has two categories of data types: primitive data types and 
reference data types.

Primitive Data Types
There are 8 primitive types built into Java: byte, short, int, long, floats, double, char, boolean, 
 
byte: A string of 8bits. A bit is simply 0 or 1 in binary. This represents integers
between -128 and 127.

short: corresponds to two bytes (16 bits) with values between the range: -32768 to
32767

int: corresponds to four bytes (32 bits) with values between the range: -2147483648
2147483647.

long: corresponds to eight bytes (64 bits) with values between the range of 
-9223372036854775808 to 9223372036854775807

float: 4 bytes floating point number. Corresponds to 32 bits
double: 8 bytes floating point number. Corresponds to 64 bits

The first four hold integers by different ranges. Floats and double hold real numbers 
(3.6, -535.5).
A variable of type char holds a single character from the Unicode char set. And a 
variable of type boolean holds one of the two logical values true or false.
*/

// Any numeric literal that contains a decimal point or exponential is a literal of type double

// In other to define a program, a class must contain a subroutine called main.