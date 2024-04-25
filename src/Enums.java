public class Enums {
	public static void main(String[] args) {
		enum Season { RAIN, DRY, HARMATTAN };
		
		// declare variable with enum
		Season mySeason = Season.RAIN;
		System.out.println(mySeason); // Outputs RAIN
		System.out.println(Season.DRY.ordinal()); // Outputs the position of the enum or value in the list.
		
		Season christmas; // Declares a variable of type Season.
		christmas = Season.HARMATTAN; // Assign a value of type Season to christmas
		
		System.out.print("Christmas happens during the season: ");
		System.out.println(christmas); // Returns HARMATTAN
		System.out.print("That is the ");
		System.out.print(Season.HARMATTAN.ordinal() + 1);
		System.out.println("rd season of the year in Nigeria"); // That is the 3rd season of the year in Nigeria
	}
}

/*
Introduction to Enums
Enums, short for enumerated types are special kind of data type that represents a fixed set of constants or values. Which is specified when the enums is created.

The syntax to writ an enum looks like this:
enum 〈enum-type-name 〉 { 〈list-of-enum-values 〉 }

Since enums are classes, their names start with an uppercase letter, and their values are objects which contains subroutines.
By convention, enum values are usually written in uppercase letters, which represents they are constant values.
Enums are used to declare variables just like any other type in Java.
Enum can actually be defined in a separate java file.
*/