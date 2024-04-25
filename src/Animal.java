public class Animal {
  private String name;
  private int age;

  public void eat() {
    System.out.println("Animal is eating");
  }

  public int getAge() {
    return age;
  }

  public String getName() {
    return name;
  }

  public void setAge(int age) {
    this.age = age;
  }

  public void setName(String name) {
    this.name = name;
  }
}
