public class Demo2 {
    public static void main(String[] args) {
        Animal a = new Animal();
        Animal d = new Dog();

        System.out.println(a.getClass().getName());
        System.out.println(d.getClass().getName());

        System.out.println(a instanceof Animal); // true
        System.out.println(a instanceof Dog); // false
        System.out.println(d instanceof Animal); // true
    }
}

class Animal {

}

class Dog extends Animal {

}