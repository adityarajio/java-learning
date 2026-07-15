public class Main2 {
    public static void main(String[] args) {
        // Autoboxing
        // int x = 10;
        // Integer y = x; //autoboxing
        // // Integer y = Integer.valueOf(x);
        // System.out.println(x);
        // System.out.println(y); // unboxing


        // // Unboxing
        // Integer a = 20; // Autoboxing
        // int b = a; // Unboxing

        // System.out.println(a); // unboxing
        // System.out.println(b);

        // Integer x = 50;
        // printInteger(x);

        // Integer a = 10;
        // Integer b = 20;
        // int sum = a+b;
        // printInteger(sum);


        Integer x = null; // gives null pointer exception
        int y = x;
        System.out.println(y);

    }

    static void printInteger(int x){
        System.out.println(x);
    }
}

// 1. Assignment statements
// 2. Method Calls
// 3. Arithmetic operrations