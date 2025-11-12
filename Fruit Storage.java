class Fruit {}
class Apple extends Fruit {}
class Mango extends Fruit {}

class FruitBox<T extends Fruit> {
    private java.util.List<T> fruits = new java.util.ArrayList<>();
    void add(T fruit) { fruits.add(fruit); }
    void display() { fruits.forEach(System.out::println); }

    public static void main(String[] args) {
        FruitBox<Apple> apples = new FruitBox<>();
        apples.add(new Apple());
        apples.display();
    }
}

