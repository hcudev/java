import Packages.Pack1; // imports a specific package from the Packages package.
import Packages.*; // imports all the packages that lives in Packages
import java.lang.*; // All classes contain this import by default. This exposes all the main Java packages including
// Strings, System, etc.


public class Package {
    public static void main(String[] args) {
        Pack1 john = new Pack1();
        Pack2 daniel = new Pack2();

        john.setPackageName("John Doe");
        System.out.println("Package one is called " + john.getPackageName());

        daniel.setPackageName("Daniel Frost");
        System.out.println("Package two is called " + daniel.getPackageName());
    }
 }