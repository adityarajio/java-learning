public class Main {
    public static void main(String[] args) {
        // Functions and Types of Functions in Java

        greet();

        sayHello("Aditya"); // Arguments

        System.out.println(getNumber());

        System.out.println(multiply(2, 4));
        
        return; // optional
    }

    // No Input, No Output
    static void greet(){
        System.out.println("Hello!");
        // return;
    }

    // Input, No Output
    static void sayHello(String name){ // Number of parameters can be anything
        System.out.println("Hello, "+name);
    }

    // No Input, Output
    static int getNumber(){
        return 10;
    }

    // Input, Output
    static int multiply(int a, int b){
        return (a * b);
    }
}