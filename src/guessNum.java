import java.util.Scanner;

public class guessNum {
  public static void main(String[] args) {
    Scanner stdin = new Scanner(System.in);
    String action;
    System.out.println("Welcome to guess a number game");
    System.out.println("Guess a number from 1 - 100");
    
    do {
      playGame(); // call the playGame method
      System.out.println("Would you love to play again? Enter no to exit the game");
      action = stdin.next().toLowerCase();
    } while (!action.equals("no"));

    stdin.close();
  }

  static void playGame() {
    Scanner stdin = new Scanner(System.in);
    int randomNum = (int) (Math.random() * 100) + 1;
    int guessCount = 0;
    int usersGuess;

    while (true) {
      usersGuess = stdin.nextInt();
      guessCount += 1;

      if (usersGuess == randomNum) {
        System.out.println("Correct! Game won in " + guessCount + " guesses! " + usersGuess);
        break;
      } else if (guessCount == 6) {
        System.out.println("Game Over! You didn't guess the number in 6 attempts" + " Correct guess was " + randomNum);
        break;
      } else if (usersGuess > randomNum) {
        System.out.println("Your guess is too high");
      } else if (usersGuess < randomNum) {
        System.out.println("Your guess is too low!");
      }
    }
    stdin.close();
  }
}

/*
* Pseudo algorithim
  Pick a random number
  While the game is not over
    Get the user's guess
    Tell the user whether the guess is high, low or correct.

* Algorithm
  Let computersNum be a random number between 1 and 100
  Let guessCount = 0
  while (true):
    Get the user's guess
    Count the guess by adding 1 to guess count
    if user's guess equals computersNum:
      Tell the user he won the game
      break out of the loop
    if the number of guesses is 6:
      Tell the user he lost
      break out of the loop
    if user's guess is greater than computersNum:
      Tell the user the guess is high
    if user's guess is lower than computersNum
      Tell the user the guess is low
  */ 
