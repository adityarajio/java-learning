public class Main2 {
    public static void main(String[] args) {
        Outer outer = new Outer();
        // Outer.Inner inner = new Outer.Inner(); --> wrong syntax if inner class is not static
        Outer.Inner inner = outer.new Inner();
        // Outer.Inner inner = new Outer().new Inner();

        inner.fun();
        inner.fun2();
        Outer.Inner.fun2();
    }
}

class Outer {
    int x =10;
    class Inner {
        int x = 20;
        void fun(){
            System.out.println("hello");
            System.out.println(Outer.this.x);
        }
        static void fun2(){
            System.out.println("Hello");
        }
    }
}