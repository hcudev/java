# Introduction to Correctness and Robustness

A program is correct if it accomplishes the task it was designed to perform. It is said to be robust if it can handle illegal inputs and other unexpected situations in a reasonable way.

For example, consider a program designed to read some numbers from the user and then print the sanme numbers in a sorted order. The program is correct if it works for any set of input numbers. It is robust if it can handle non-numeric inputs, for example by printing an error message.

What if the specification is incorrect or incomplete? A correct program should be a correct implementation of a complete and correct specification. The questions is whether the specification correctly expresses the intention and desires of the people for whom the program is being written.

## Stories

About twenty-three years ago, the failure of two multi-million dollar space missions to Mars
was prominent in the news. Both failures were probably due to software problems, but in both
cases the problem was not with an incorrect program as such. In September 1999, the Mars
Climate Orbiter burned up in the Martian atmosphere because data that was expressed in
English units of measurement (such as feet and pounds) was entered into a computer program
that was designed to use metric units (such as centimeters and grams).

A few months later, the Mars Polar Lander probably crashed because its software turned off its landing engines too soon. The program was supposed to detect the bump when the spacecraft landed and turn off the engines then. It has been determined that deployment of the landing gear might have jarred the spacecraft enough to activate the program, causing it to turn off the engines when the spacecraft was still high above the ground.

The unpowered spacecraft would then have fallen to the Martian surface. A more robust system would have checked the altitude before turning off the engines!

[Mars Polar Lander](https://en.wikipedia.org/wiki/Mars_Polar_Lander)

## Precondition and Postcondition

A precondition is a statement that should be true before a program is being executed correctly, while a postcondition is a fact that is proven to be true after a program has finished executing.

## Robust Handling of Inputs

One place where correctness and robustness are important—and especially difficult—is in the
processing of input data, whether that data is typed in by the user, read from a file, or received
over a network
An example of processing user input is the `Scanner` class for reading input from different mediums, including user input. This class has built-in error handling. For example `stdin.nextInt()` is guranteed to return an `int` value. If the user types in an illegal value, then `stdin.nextInt()` will prompt the user to enter the input again. Your program never sees the illegal value.

This shows how clumsy and unsatifactory this approach can be, especially when dealing with complex data.
