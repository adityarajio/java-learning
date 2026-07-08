public class Recursion {
    public static void main(String[] args) {
        // Recursive method
        PrintNum(5);

        // Using Recursion to find nth fibonacci number
        System.out.println(Fib(4));
    }

    static void PrintNum(int n){
        if(n==0) return;
        PrintNum(n-1);
        System.out.println();
    }

    static int Fib(int n){
        if(n==0||n==1) return 1;
        int x = Fib(n-1);
        int y = Fib(n-2);
        return x+y;
    }
}
