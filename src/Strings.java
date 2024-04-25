

/*
Operations on Strings
String is a class, and a value is an Object. That object contains the sequence of characters that make up the string and subroutines.
Subroutines are also functions. For example every string contains a subroutine called length.

Some other string methods or subroutines includes:
*/

public class Strings {
	public static void main(String[] args) {
		System.out.print("The number of characters in the string Hello World is: ");
		System.out.println("Hello World".length());
		
		String s1 = "Hello";
		String s2 = "World";
		Boolean checkMatch = s1.equals(s2);
		
		System.out.println(checkMatch); // Returns true or false if string matches or not.
		System.out.println(s1.equalsIgnoreCase(s2)); // Returns true or false if string matches (case included).
		System.out.println(s1.charAt(1)); // Takes in an integer as a position and returns the character that appears at that position.
		
		String s2Upper = s2.toUpperCase();
		System.out.println(s2Upper); // World becomes WORLD
		
		String spaces = " Too Many Spaces   ";
		System.out.println(spaces.trim()); // trims the leading and ending spaces in a string.
		
	}
}
