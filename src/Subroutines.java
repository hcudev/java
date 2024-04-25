public class Subroutines {
  public static void main(String[] args) {
    int num = 2;
    String intToString = Integer.toString(num);
    System.out.println(intToString);

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