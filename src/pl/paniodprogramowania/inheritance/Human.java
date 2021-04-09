package pl.paniodprogramowania.inheritance;

public class Human extends Monkey {

  {
    this.gender = "Other";
    NAME = "Human Name";
    System.out.println("7. Inside code Human block");
  }

  static {
    NAME = "Human static name";
    System.out.println("8. Inside static code Human block");
  }

  public Human(String gender) {
    super(gender);
    System.out.println("9. Inside Monkey constructor");
  }
}
