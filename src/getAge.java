public class getAge {
  static int age;
  
  static void isAdult(int dob) {
    if (dob < 18) {
      System.out.print("You are not an adult. " + "Wait " + (18 - dob) + " more years");
    } else {
      System.out.println("You are an adult of " + dob + " years old");
    }
  }
}
