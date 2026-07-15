public class Main2 {
    public static void main(String[] args) {
        Outer outer = new Outer();
        // Outer.Inner inner = new Outer.Inner(); --> wrong syntax if inner class is not static
        Outer.Inner inner = outer.new Inner();
    }
}

class Outer {
    class Inner {

    }
}