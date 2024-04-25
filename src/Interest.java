

public class Interest {
	public static void main(String[] args) {
		// Declare the variables
		double principal;
		double rate;
		double interest;
		
		// Computations
		principal = 1700;
		rate = 0.027;
		interest = principal * rate; // Compute the interest.
		
		principal = principal + interest;
		
		// Output the results
		System.out.print("The interest earned is $");
		System.out.println(interest);
		System.out.print("The value of the investment after one year is $");
		System.out.println(principal);
	}  // end of main()
} // end of class Interest

/*
 This program uses several subroutines. System.out.print and System.out.println. The difference is that the println adds a line feed at the end of the information it displays. The value to be displayed is provided in parentheses after the subroutine name.
 
Built-in Subroutines
A subroutine is a series of program instructions joined together and associated by a name which are called to perform a specific task.
 
One of the purpose of a class is to group together some variables and subroutines, which are contained in that class. These variables and subroutines are called static members. For example, the main() routine is a static member of the class.

When a class contains a static variable or subroutine, the name of the class is part of the full name of variable or subroutine. For example, the standard class named System contains a subroutine named exit, which is referred to as System.exit
 */