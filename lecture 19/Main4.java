// Anonymous class

public class Main4 {
    public static void main(String[] args) {
        // Person p1 = new Person();
        // p1.introduce();

        // Person p2 = new Guest();
        // p2.introduce();

        // Anonymous class
        Person p2 = new Person() {

            String name = "Aditya";

            @Override
            void introduce() {
                greet();
                System.out.println("Hi, I am "+name);

            }
            void greet(){
                System.out.println("Hello");
            }
        };

        // we cannot create constructor of anonymous class as it doesn't even have own name, so how are you even gonna create it's constructor, and all other rules apply to same as nested class
        // p2.greet(); // Can't call it cause p2 is reference of Person not anonymous class, but we can use override methods 
        p2.introduce();
    }
}

class Person {
    void introduce() {
        System.out.println("Hi, I am a person");
    }
}

// class Guest extends Person {
//     @Override
//     void introduce() {
//         System.out.println("Hi, I am a guest");
//     }
// }

/*
Most Used to Rarest Used-->
Static Nested Class
Inner Class
Anonymous Class --> now replaced by Lamda's ("we'll see later about this")
Loal Class
*/