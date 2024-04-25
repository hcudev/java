public class Expressions {
	public static void main(String[] args) {
		int A = 17; // A is an integer
		double convertToDouble = (double)A;
		System.out.println(A);
		System.out.println(convertToDouble);
	}
}

/*
Expression is a piece of code or a program that represents or computes a value.
It could be a literal, a function, variable. ETC. Complex expressions can be built by using
operators to combine simpler expressions. Operators include + for adding numbers, > for
comparing two value, and so on.

Precedence
In an expression with multiple operators, operators are evaluated based on a given precedence.
For example in A + B * C, B*C is first evaluated and then the result is added to A.
In this case, multiplication has a higher precedence value than addition. (PEMDAS).

Boolean Operators
In Java, the boolean operator "and" is represented by &&, "or" operator is represented by ||
"not" operator is represented by !.
The operator "&&" and "||" are said to be short-circuted version of the boolean operators.
This means that the second operand is not necessarily evaluated.

The boolean operator “not” is a unary operator. In Java, it is indicated by ! and is written
in front of its single operand.

Ternary Operator
It's a conditional operator used for evaluating conditional statements.
〈boolean-expression 〉 ? 〈expression1 〉 : 〈expression2 〉

Assignment Operators and Type Conversion
To convert the data type of a value, we use type case.

int A
A = 17
convertToFloat = (float)A
*/