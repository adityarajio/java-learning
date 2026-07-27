public class Demo5 {
    public static void main(String[] args) {
        Integer y = getResult(23);
        System.out.println(y);

        printPair(1, "Aditya");
        // Typ Inference
    }

    public static <T> /*type parameter*/ T getResult(T x){
        return x;
    }

    public static <T, U> void printPair(T first, U second){
        System.out.println(first + ", "+ second);
    }
}

// Generic Methods
// <T> returnType methodName(T parameter) {
// }