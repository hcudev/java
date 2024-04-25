public class Code {
  // initialize non-static variable
  public int[] numbers = {1, 2, 3};

  // initialize non-static method
  public int getAge(int age) {
    return age;
  }

  public static void main(String[] args) {
    // Accessing non-static variable using an object
    int[] newNumbers = new Code().numbers;
    System.out.println(newNumbers[0]); // Returns 1

    // Accessing non-static method using object
    int newGetAge = new Code().getAge(22);
    System.out.println(newGetAge); // Returns 22

     // Accessing static variable using class name
    System.out.println(Code.myNum);

    // Accessing static using class name
    Code.getStaticAge(myNum);
    myNum = 5;
  }

    // initialize static variable
  public static int myNum = 22;

  // initialize static method
  static void getStaticAge(int age) {
    // Do something with age
  }
}