package pl.paniodprogramowania.inheritance;

public class Monkey extends Animal {

  {
    this.gender = "Male";
    NAME = "Monkey Name";
    System.out.println("4. Inside code Monkey block");
  }

  static {
    NAME = "Monkey static name";
    System.out.println("5. Inside static code Monkey block");
  }

  public Monkey(String gender) {
    super(gender);
    System.out.println("6. Inside Monkey constructor");
  }
}
