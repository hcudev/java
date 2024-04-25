public class Conditionals {
  public static void main(String[] args) {
    int num = 20;
    String result;
    int num1 = 10;
    int num2 = 20;
    int time = 22;
    String mealType;

    result = num > 5 ? "Yes" : "No";
    System.out.println(result); // returns "Yes" since 20 is greater than 5

    if (num1 > num2) {
      System.out.print("num1 is greater than num2");
    } else {
      System.out.println("num2 is greater than num1");
    } // Output num2 is greater than num1 because 20 > 10

    switch (time) {
      case 0, 1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11 -> {
        mealType = "Breakfast";
        System.out.print("Time for some " + mealType);
      }
      case 12, 13, 14, 15 -> {
        mealType = "Lunch";
        System.out.print("Time for some " + mealType);
      }
      case 16, 17, 18, 19, 20, 21, 22, 23, 24 -> {
        mealType = "Dinner";
        System.out.print("Time for some " + mealType);
      }
      default -> System.out.println("No valid time selected");
    }
  }
}