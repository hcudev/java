import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class Array {
  // calculate average of numbers in an array of integers
  static void calcAverage(int[] array) {
    int count;
    int average;
    int total = 0;

    for (count = 0; count < array.length; count++) {
      total += array[count];
    }
    average = total / array.length;
    System.out.println("Total average is: " + average);
  }

  // find the largest number in an array of double
  static void findLargestNum(double[] numbers) {
    double max = 0;
    int i = 0;

    for (i = 0; i < numbers.length; i++) {
      if (numbers[i] > max) {
        max = numbers[i];
      }
    }
    System.out.println("Largest number is " + max);
  }

  static void printValues(int[] list) {
    int i;

    for (i = 0; i < list.length; i++) {
      System.out.print(list[i] + ", ");
    }
  }

  public static void main(String[] args) {
    String[] myNames;
    int[] age;
    double[] prices;

    myNames = new String[10]; // creates an array with 10 String items. (Default is null)
    age = new int[15]; // creates an array with 15 int items. (Default is 0)
    prices = new double[20]; // creates an array with 20 double items. (Default is 0)

    // Syntax 1
    float[] date = new float[5]; // creates an array of 5 items with a base type of float
    Arrays.fill(date, 3); // Fill date array with 3
    System.out.println(date[0]); // returns 1.4

    // Syntax 2
    String[] names = {"John", "Ben", "Steve", "Peter"}; // creates an array of 4 names
    int[] dates = {1985, 2023, 1408, 1939}; // creates an array of 4 numbers
    System.out.println(myNames[0]); // Returns the first item in myNames: "John"
    System.out.println(dates[dates.length - 1]); // Returns the last item in date 1939

    // Arrays and For Loops
    int index = 0;
    String firstItem = names[index];
    String secondItem = names[1];

    System.out.println("First name is " + firstItem);
    System.out.println("Second name is " + secondItem);

    // Looping names array using For Loop
    int i;
    for (i = 0; i < names.length; i++) {
      System.out.print(names[i] + " ");
    }

    // Problem 1: Finding the average of all elements in an array of double.
    double average;
    double total;
    int count;

    total = 0;
    for (count = 0; count < prices.length; count++) {
      total += prices[count];
    }
    average = total / prices.length;
    System.out.println("");
    System.out.println("Total average is " + average);

    // Problem 2: Finding the largest number in an array.
    int maxNum;
    int idx;
    maxNum = 0;

    for (idx = 0; idx < age.length; idx++) {
      if (age[idx] > maxNum) {
        maxNum = age[idx];
      }
    }
    // maxNum is largest number in age at this point.

    // Problem 3. Processing some elements in an array using if/else controls statements
    int nonZeroItemsCount;
    float nonZeroTotal;
    float nonZeroAverage;
    int counts;

    nonZeroTotal = 0;
    nonZeroAverage = 0;
    nonZeroItemsCount = 0;

    for (counts = 0; counts < date.length; counts++) {
      if (date[counts] != 0) {
        nonZeroTotal += date[counts]; // add only non-zero floating point number to total
        nonZeroItemsCount += 1; // count number of non-zero items
      }
    }

    if (nonZeroItemsCount == 0) {
      System.out.println("No none zero items found");
    } else {
      nonZeroAverage = nonZeroTotal / nonZeroItemsCount;
      System.out.println("Total average of non zero items is: " + nonZeroAverage);
    }

    // Result: calculate average of numbers
    int[] num4 = {2, 4, 6, 8};
    calcAverage(num4); // Returns 20 / 4 = 5

    // Result: find largest number
    double[] num5 = {10, 22.0, 34.9, 199, 65};
    findLargestNum(num5); // prints 199

    // Result: printValues
    int[] num6 = {600, 201, 46, 199, 8};
    printValues(num6);

    // Fill an empty array with the values from another array
    String[] message = {"Hello", "World", "Come", "Home"};
    String[] commands = new String[4];
    int a;

    for (a = 0; a < message.length; a++) {
      Arrays.fill(commands, message[a]);
      System.out.println(commands[a] + " "); // prints: Hello, World, Come, Home
    } ;

    // Partially full arrays
    Scanner stdin = new Scanner(System.in);
    int[] arrayNum;
    int numAdded = 0;
    int input;
    int id;

    arrayNum = new int[5]; // creates an array of 100 int spaces

    try {
      while (true) {
        System.out.println("Enter integer");
        input = stdin.nextInt();

        // Reverse array items if input is 0
        if (input <= 0) {
          break;
        }

        arrayNum[numAdded] = input;
        numAdded++;
      }

      System.out.println("Total numbers in reverse order: ");
      for (id = numAdded - 1; id >= 0; id--) {
        System.out.println(arrayNum[id]);
      } ;
      stdin.close();
    } catch (ArrayIndexOutOfBoundsException error) {
      System.out.println("Integers exceed array count");
      System.out.println(error.getMessage());
    }

    // Looping arrays with For-each
    String[] weeks = {"Sun", "Mon", "Tue", "Wed", "Thur", "Fri", "Sat"};
    System.out.println("Days of the week:");
    for (String week : weeks) {
      System.out.println(week);
    }

    // Array lists in Java
    // ArraysLists are resizable arrays that can contain a dynamic number of array items.
    // When an array is created with 10 items, 10 elements will be allocated to the memory but in
    // the case of an arrayList, the size of the ArrayList is dynamic.

    // ArrayLists uses a class type definition, unlike arrays that uses primitive types
    ArrayList<Integer> myInts;
    myInts = new ArrayList<>();

    // or do it in one line
    ArrayList<String> myString = new ArrayList<>(); // ArrayList of Strings
    ArrayList<Double> myDouble = new ArrayList<>(); // ArrayList of Doubles
    ArrayList<Float> myFloat = new ArrayList<>(); // ArrayList of floats

    // You can only store objects like: String, Integer, Boolean, Double, Character, ETC in
    // ArrayLists. You cannot store primitive data types like int, floats, double, boolen, char,
    // ETC.

    // Array lists have built in methods for adding elements to the array.
    // * Add elements to ArrayList
    myInts.add(22);
    myString.add("Apple");
    myDouble.add(3.14);
    myFloat.add(3f);

    System.out.println(myString); // Returns [Apple, Mango, Guuava]

    // * Add elements at specific index to ArrayList
    myString.add(0, "Pawpaw"); // Add Pawpaw to the begining of the arrayList
    System.out.println(myString);

    // Access elements in an ArrayList
    String first = myString.get(0); // Returns the first element in arrayList
    String last = myString.get(myString.size() - 1); // Returns the last element in arrayList
    System.out.println(first);
    System.out.println(last);

    // Update items in ArrayList
    // The set() method is used to update an item in an ArrayList
    myString.set(0, "Kiwi"); // Replaces PawPaw with Kiwi

    // Note: Updating an arrayList of strings does not change the original string, because strings
    // are immutable, instead the variable that refrences the previous string will change to point
    // to the new string added using the set method. Since the old string no longer has a reference
    // in memory, it will be removed from by Java's garbage collector.

    // Removing items from an ArrayList
    // To remove an element from an arrayList, we use the remove method.
    // This method has has two options:
    // * Removing elements by index:
    myString.remove(2); // Removes the last third from the list

    // * Removing elements by values
    myString.remove("Pawpaw"); // Removes "Pawpaw" from the array
    System.out.println(myString);

    // Remove all elements from an ArrayList
    myString.clear(); // clears all the elements in an arrayList
    System.out.println(myString);
  }
}

// A data structure is a specialized format for storing, organizing, and processing data. This
// usually consists of a number of data items chunked together so that they can be treated as a
// unit.

// An array is a data structure (collection) of data items arranged as a numbered sequence, so that
// each individual item can be reffered to by it's position number.
// ! In Java all the items of an array must be of the same type.
// The numbering of an array is zero-based, and the type of the items in an array is called the Base
// Type.

// Before you can use a variable to refer to an array, the variable must be declared and it must
// have a type. For an array of Strings, the type would be; String[] or for int; int[]

// Arrays are essentially objects, so we need a special syntax to create an array.
// To create an array, you use the new keyword followed by the array type and a square brackets of
// array items

// ? Creating an Array

// <array-type[]> <array-variable> = new <base-type>[<array-length>]

// String[] names = new String["John", "Stella", "Ben"]

// To add items to the array, you can use a for loop to iterate through the array and assign a value
// or variable to the current item of the array using it's index.

// Another way is by specifying the items immediately after initializing the array

// int[] num = {1, 2, 3, 4, 5, 6}

// Another way is using the Arrays.fill class.

// import java.utils.Array
// double[] height = new double[5];

// Arrays.fill(height, double 1.5) fills the array of height with 1.5
// A more realistic example would be using a for loop to fill the array.

// When you create an array of int, each items is already initialized with 0, for boolean, each item
// is filled with false, for Strings, the inital value of the array is null.

// ? Random Access
// One of the advantages of arrays is that it allows random access (Every element of the array is
// equally accessible at any given time).
// Suppose that there are N people in a room. What’s the chance that there are two people in the
// room who have the same birthday? (That is, they were born on the same day in the same month, but
// not necessarily in the same year.)

// The answer to othis is a boolean value, true or false.
// To hold the data for all 365 possible birthdays, we can use an array of 365 boolean values:

// boolean[] used;
// used = new boolean[365]

// ? Partially Full Arrays
// Consider an example program that reads positive integers entered by a user and stores them for
// later processing. The program stops reading when the user inputs a number that is less than or
// equal to zero. The input numbers can be kept in an array, numbers, of type int[].

// Let's say that no more than 100 numbers will be input. Then the size of the array can be fixed at
// 100. But the program must keep track of how many numbers have actually been read and stored in
// the array. For this, it can be an integer variable.

// Each time a number is stored in the array, we have to count it; that is, the value of the counter
// variable must be incremented by one.

// One question is when we add a new item to the array, where do we put it? Well, if the number of
// items is count, then they would be stored in the array in position number 0, 1, ..., ((count - 1)

// As an example, here's a program that will read numbers input by a user and then print them in
// reverse of the order in which they entered, Assume that an input value equal to zero marks the
// end of the input data.

// Pseudo code:

// array of 100 integer items
// count of number of items stored in array of integer

// while true
// get input integer from user
// add input integer to number array
// increment number of items stored in integer by 1

// if user input is 0
// loop through input array and print the reverse order of the number input.

// ? Array Details
// An attempt to refer to an array element with an index outside the range from zero to A.length
// - 1 causes an ArrayIndexOutOfBoundsException

// For-each Loops
