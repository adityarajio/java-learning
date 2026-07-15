public class Main4 {
    public static void main(String[] args) {
        Animal a = new Dog("Bruno");
        a.makeSound();
    }
}

abstract  class Animal {

    String name;
    // static String type;
    Animal (String name){
        this.name = name;
    }
    void makeSound() {
        System.out.println("Making sound");
    }

    final void Sleep() {
        System.out.println("Sleeping");
    }
    // static void eat(){
    //     System.out.println("Eating!");
    // }

    private void eat(){

    }
}

class Dog extends Animal {

    public Dog(String name) {
        super(name);
    }
    @Override
    void makeSound() {
        System.out.println("bhow bhow!");
    }
}

// Abstract Classes
/*
1. Which cannot be instantiated directly
2. Can contain abstract methods(method without implementation)
3. Can also contain normal methods
4. It is meant to be extended
*/

// Questions
/*
1. Can abstract classes have constructors? --> Yes
2. Can abstract classes be final? --> Not Allowed --> since if it is final we cannot inherit it and abstract class purpose is to get inherited
3. Can abstratc classes have static methods --> Yes
4. Can abstract classes have private methods --> Yes but non abstract
5. Can abstract classes have final methods --> Yes but non abstract
6. Can abstract classes have no abstract methods --> Yes
*/