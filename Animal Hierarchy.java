import java.util.*;

class Animal { public String toString() { return getClass().getSimpleName(); } }
class Dog extends Animal {}
class Cat extends Animal {}

class AnimalPrinter {
    static void printAnimals(List<? extends Animal> animals) {
        for (Animal a : animals) System.out.println(a);
    }

    public static void main(String[] args) {
        printAnimals(Arrays.asList(new Dog(), new Cat()));
    }
}

