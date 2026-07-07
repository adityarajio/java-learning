public class Demo2 {
    public static void main(String[] args) {
        byte b = 12;
        char c = 'a';
        short s = 1024;
        int i = 500000;
        float f = 5.57f;
        double d = .134;
        
        // f * b --> float
        // i / c --> integer
        // d * s --> double

        double result = (f * b) + (i / c) - (d * s);

        

        // float + integer --> float - double --> double

        System.out.println((f * b) + " + " + (i / c) + " - " + (d * s));
        System.out.println("result = " + result);
    }
}