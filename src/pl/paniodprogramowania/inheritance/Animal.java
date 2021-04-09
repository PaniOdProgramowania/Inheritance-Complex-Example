package pl.paniodprogramowania.inheritance;

public class Animal {
  public static String NAME = "Animal";
  public String gender;

  {
    gender = "Female";
    NAME = "Animal Block";
    System.out.println("1. Inside code Animal block");
  }

  static {
    NAME = "Animal Static Block";
    System.out.println("2. Inside static code Animal block");
  }

  public Animal(String gender) {
    this.gender = gender;
    NAME = "Animal Constructor";
    System.out.println("3. Inside Animal Constructor");
  }
}
