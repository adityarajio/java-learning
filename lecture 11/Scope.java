public class Scope {
    // Scope of a variable
    static String name = "Aditya"; // Global scope
    public static void main(String[] args) {
        int x = 4; // local scope
        int y = 5;

        if(x==4){
            int j = 7;
            System.out.println(j);
        }
        
        System.out.println(name);
        System.out.println(x + " , " + y);
        fun();
    }

    static void fun() {
        int x = 4;  // local scope
        int y = 5;

        System.out.println(name);
        System.out.println(x + " , " + y);
    }
}
