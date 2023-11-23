package pl.paniodprogramowania.inheritance;

public class Main {

  public static void main(String[] args) {
    // Operacja A
    Animal animal = new Animal("rather not say");

    // Operacja B
    Animal animalMonkey = new Monkey("monkey gender");

    // Operacja C
    Animal animalHuman = new Human("human gender");

    // Operacja D
    Monkey monkey = new Monkey("W");

    // Operacja E
    Monkey monkeyHuman = new Human("M");

    // Operacja F
    Human human = new Human("G");
  }
}
