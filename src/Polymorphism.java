public class Polymorphism {
  public static void main(String[] args) {
    Animal myAnimal = new Animal();
    myAnimal.eat(); // prints "Animal is eating" since Animal contains the eat method

    Cat myCat = new Cat();
    myCat.eat(); // prints "Cat is eating", since Cat extends Animal class

    Mouse myMouse = new Mouse();
    myMouse.eat(); // prints
    // "Mouse is eating", since Mouse overrides the eat method from Animal
  }

}

/*
 * The word polymorphism means "many forms". This means a class can perf orm the same operation but
 * in different ways
 */
