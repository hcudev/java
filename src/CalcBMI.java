public class CalcBMI {
  public static void main(String[] args) {
    // BMI = mass(kg) / height² (m) 
    double mass = 85.5;
    double height = 1.9;

    double bmi1 = mass / height * height; // incorrect solution
    double bmi2 = mass / (height * height); // correct solution
    System.out.print("Your BMI is: ");
    System.out.println(bmi1);
    System.out.print("Your BMI is: ");
    System.out.println(bmi2);
  }
}
