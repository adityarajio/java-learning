import java.util.ArrayList;
import java.util.List;

// Wildcard with upper bound (extends className)

public class Demo3 {
    public static void main(String[] args) {
        List<Dog> dogs = new ArrayList<>();
        dogs.add(new Dog());
        dogs.add(new Dog());

        List<Animal> animals = new ArrayList<>();
        animals.add(new Animal());
        animals.add(new Animal());


        // List<Integer> l = new ArrayList<>();
        // fun(l); -> not allowed

        fun(dogs);
        fun(animals);
    }

    static void fun(List<? extends Animal> values){
        for (Animal animal : values) {
            animal.eat();
        }

        // values.add(new Animal()); // still not valid
    }
}

class Animal {
    void eat() {
        System.out.println("Eating...");
    }

    void walk() {
        System.out.println("Walking...");
    }
}

class Dog extends Animal {
    void bark() {
        System.out.println("Barking....");
    }
    @Override
    void eat() {
        System.out.println("Dog is Eating...");
    }
}

class Cat extends Animal {
    void Purr(){
        System.out.println("Purring...");
    }
    @Override
    void eat() {
        System.out.println("Cat is Eating");
    }
}