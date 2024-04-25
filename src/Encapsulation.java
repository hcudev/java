public class Encapsulation {
  public static void main(String[] args) {
    Employee emp = new Employee();

    // emp.id = 43;
    // emp.name = "John Doe";
    // emp.salary = 2400;

    emp.setName("John Doe");
    emp.setId(104);
    emp.setSalary(153000);

    System.out.println("My name is " + emp.getName());
    System.out.println("My id is " + emp.getId());
    System.out.println("My salary is " + emp.getSalary());
  }
}
