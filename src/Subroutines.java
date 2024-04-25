public class Subroutines {
  public static void main(String[] args) {
    int num = 2;
    Integer.toString(num);

    getAge.age = 20;
    System.out.println(getAge.age);

    getAge.isAdult(16);
  }

  // playGame
  public static void playGame() {
    System.out.println("Play game subroutine");
  }

  // non-static subroutine
  int getNextN(int n) {
    return n + 2;
  }

  // lessThan
  static boolean lessThan(double x, double y) {
    return x > y;
  }
}

/* 
  * Subroutines
  Subroutines are essentially series of instructions or statements for carrying out a certain task grouped together and given a name. This is equivalent to what is known as a function in some other programming languages like JavaScript and Python. Although they have certain distinctions.

  Subroutines can be used over and over again. Every time a subroutine is called, it executes all the statements inside of it's body.

  In Java, subroutines can be either static or non-static.

  * General Ideas of Subroutines
  A subroutine is sometimes said to be a "black box" because you can't see what's inside it (typically hiding it's complexity). The black box usually provides an interface to interact with the items inside the box, like a button you can push, dials you can set, ETC.

  The black box contains the code in a subroutine that performs the tasks.
  A typical example of a black box is a TV set, telephone, mobile device. These are boxes that contains a series of subroutines that is used to interface with the box.
  
  * Rules of black boxes:
  - The interface of a black box should be fairly starightforward, well defined and easy to understand.
  - To use a black box, you shouldn’t need to know anything about its implementation; all you need to know is its interface.
  - The implementor of a black box should not need to know anything about the larger systems in which the box will be used

  * Static Subroutines and Static Variables
  Unlike other programming languages that allow free-floating, independent subroutines, every subroutine in Java must be defined inside a class.

  A single class definition can contain both static and non-static subroutines but behave differently when executed.

  * Static Subroutine
  In a running program, a static subroutine is a member of the class itself, while non-static subroutines are only there to be used when objects are created and it becomes members of the objects in which they are created. This means non-static subroutines are only relevant when working with objects.

  A subroutine in a class or object is often called a method; which is the term most people prefer for subroutines in Java. As far as Java is concerned, both terms are synonymous.
  
  Other terms are "procedures" and "functions". Functions are generally used only for subroutines that compute and returns a value.

  An example of a subroutine is the main() routine of a program.

  * Code Syntax
  Here's the syntax of a subroutine:
  <modifiers> <return-type> <subroutine-name> (<parameter-list>) {
    <statements>
  }

  * Modifiers:
  This is a keyword for setting the characteristics of a subroutine. Examples are: "static", "public". There are up to six possible modifiers.

  "public": This indicates the subroutine can be called from anywhere in a program, even from outside the class where the method is defined.

  "private": This indicates that the method can be called only from inside the same class.
  
  The modifiers, private and public are called access specifiers. 
  ! if no access specifier is indicated, then by default, the method can be called anywhere in the package that contains the class.

  * Statements:
  The statements make up the body of the subroutine. They include code expressions, computations,etc. These are the statements inside the "black box" that peforms the operations.

  * Return Type
  If a subroutine returns a value, the return-type is used to specify the type of value that is returned by the function. It can be a type name such as: "String", "int" or an array of double[].
  If the subroutine does not return any value, the return type is void.

  * Parameter List
  These are part of the interface of a subroutine. They represent information passed into the subroutine to be used by the subroutines internal computations.

  Ane example would be a TV that takes in a parameter of channel number to determine what channel to change the TV to. A parameter list can be empty or several values separated by a comma.

  * Examples
  public void getChannel(int channelNum) { ... }
  public static void main(String[] args) { ... }

  In the second example, the modifiers are public and static, the return type is void, the subroutine name is main, and the parameter list is “String[] args”. 
  In this case, the type for the parameter is the array type String[ ]

  public static void playGame() {
    "public" and "static" are modifiers; "void" is the
    return-type; "playGame" is the subroutine-name;
    the parameter-list is empty.
  . . . // Statements that define what playGame does go here.
  }

  int getNextN(int N) {
    There are no modifiers; "int" is the return-type;
    "getNextN" is the subroutine-name; the parameter-list
    includes one parameter whose name is "N" and whose
    type is "int".
  . . . // Statements that define what getNextN does go here.
  }

  static boolean lessThan(double x, double y) {
    "static" is a modifier; "boolean" is the
    return-type; "lessThan" is the subroutine-name;
    the parameter-list includes two parameters whose names are
    "x" and "y", and the type of each of these parameters
    is "double".
  . . . // Statements that define what lessThan does go here.
  }
  
  The second example is a non-static subroutine since it does not include the modfifier "static"

  * Calling a Subroutine
  To call a subroutine, we specify the name followed by a parenthesis of optional arguments. These arguments are used to interface with the parameters of the subroutine.

  For example. 
  playGame();
  getNextN(3);
  lessThan(3.14, 0.66);

  The above example can only be used within the same class the subroutine is defined. Since the subroutine playGame() is a static method, it can be called within other classes by specifying the parent class it was defined.

  For example, if playGame() was initialized in a class named Poker. Then to call playGame() from outside the Poker class, the syntax would look like this:
  
  Poker.playGame();

  The use of the class name here tells the computer which class to look in to find the method. It
  also lets you distinguish between Poker.playGame() and other potential playGame() methods
  defined in other classes, such as Roulette.playGame() or Blackjack.playGame().

  * Sytnax for calling a static subroutine
  <subroutine-name>(<parameters>);

  * Sytnax for calling a static subroutine outside of it's defined class
  <class-name>.<subroutine-name>(<parameters>);

  * Non-static Methods
  This belong to objects rather than classes, and they are called using objects instead of class names.

  * Subroutines in Programs

*/