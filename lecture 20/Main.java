public class Main {
    public static void main(String[] args) {
        System.out.println("Hello");
        System.err.println("Bye");

        int age = -3;

        if(age<0){
            System.err.println("Invalid age");
        }
    }
}

// System Class --> PrintStream out
// PrintStream --> println()

// err --> error
// out --> output