package pl.paniodprogramowania.inheritance;

public class Main {

  public static void main(String[] args) {
    Animal animal = new Animal("rather not say");
    Animal animalMonkey = new Monkey("monkey gender");
    Animal animalHuman = new Human("human gender");

    Monkey monkey = new Monkey("W");
    Monkey monkeyHuman = new Human("M");

    Human human = new Human("G");
  }
}
