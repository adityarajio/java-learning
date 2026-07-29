import java.util.ArrayList;
import java.util.List;

// Generics with Lower Bound (super)
public class Demo4 {
    public static void main(String[] args) {
        List<Animal> animals = new ArrayList<>();
        animals.add(new Animal());
        animals.add(new Animal());
        fun(animals);
    }

    public static void fun(List<? super Animal> values) {
        // Writing
        values.add(new Animal());
        values.add(new Labrador());
        values.add(new Cat());
        values.add(new Dog());

        // Reading
        // for(Animal a : values){
        // Reading is not allowed, can only read through Object class
        // }

        for (Object object : values) {
            Animal a = (Animal) object;
            a.eat();
        }
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

class Labrador extends Dog {}