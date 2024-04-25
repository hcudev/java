public class Friends {
  public static void main(String[] args) {
    makeFriend("Your Name", false);
  }

  public static void makeFriend(String name, boolean isStudyingCompSci) {
    if (isStudyingCompSci) {
      System.out.println("Lets be friends, " + name);
    } else {
      System.out.println("Happy learning, " + name);
    }
  }
}
