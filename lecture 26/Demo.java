public class Demo {
    public static void main(String[] args) {
        // String
        String s1 = new String();
        String s2 = new String("Hello");

        // String literal
        String s3 = "Aditya";
        String s4 = new String(s3);

        // char array
        char[] arr = {'A', 'd', 'i', 't', 'y', 'a',' ','R', 'a', 'j'};
        String s5 = new String(arr); // values[]
        // arr[0] = 'B';

        // System.out.println(s5);

        // char array subset
        String s6 = new String(arr, 0/*inclusive*/, 6 /*exclusive*/);
        // System.out.println(s6);

        // Byte Array
        byte arr2[] = {97, 98, 99};
        String s7 = new String(arr2, 0, 1);
        // System.out.println(s7);

        // StringBuilder and String Buffer
        // StringBuilder stringBuilder = new StringBuilder("Hello");
        StringBuffer stringBuffer = new StringBuffer("Hello");
        // String s8 = new String(stringBuilder);
        String s8 = new String(stringBuffer);

        System.out.println(s8);
    }
}