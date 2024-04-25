public class Mouse extends Animal {
  private int size;

  public int getSize() {
    return this.size;
  }

  public void setSize(int size) {
    this.size = size;
  }

  // Overide eat() method
  public void eat() {
    System.out.println("Mouse is eating");
  }
}
