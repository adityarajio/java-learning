public class Demo {
    public static void main(String[] args) {
        // Functions are also called methods in java
        // Method Overloading

        int x = sum(2, 3);
        System.out.println(x);

        int y = sum(5, 6);
        System.out.println(y);

        int z = sum(3, 5, 6);
        System.out.println(z);

        greet("Aditya", 18);
        greet(18, "Aditya");

        fun();

    }


    // Method Overloading

    static int sum(int a, int b){
        return a+b;
    }

    static int sum(int a, int b, int c){ // different no. of parameters
        return a+b+c;
    }

    static int sum(double a, double b){ // different type of parameter
        return (int)(a+b);
    }

    static void greet(String name, int age){
        System.out.println("Hi, "+name+". Your age is, "+age);
    }
    static void greet(int age, String name){ // different ordering of parameters
        System.out.println("Hi, "+name+". Your age is, "+age); 
    }

    static void fun(){
        System.out.println("Hello");
    }
    static int fun2(){
        System.out.println("Hello");
        return 5;
    }
}
