public class Cat extends Animal {
  private String breed;

  public String getBreed() {
    return breed;
  }

  public void setBreed(String breed) {
    this.breed = breed;
  }

  // Overide eat() method in Cat class
  public void eat() {
    System.out.println("Cat is eating");
  }
}
