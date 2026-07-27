public class Demo7 {
    public static void main(String[] args) {
        // Box<Animal> b1 = new Box<>(); // Error
        Box<Fish> b2 = new Box<>(); 
    }
}

class Box<T extends Animal & Swimmable> {
    T value;
}

class Animal {
    void display() {
        System.out.println("Displaying Animal");
    }
}

interface Swimmable {
    void swim();
}

class Dog extends Animal {

}

class Fish extends Animal implements Swimmable {
    @Override
    public void swim() {
        System.out.println("Fish is Swimming...");
    }
}

//

// <T extends class & interface1, interface2... >