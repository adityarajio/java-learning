public class StaticAndFinalMethods {
    public static void main(String[] args) {
        A a = new B();
        // a.fun();
        // System.out.println(a.x);
        System.out.println(a.getX());
        
    }
}

// static --> No ovveriding apply to static methods --> since static methods belong to class not to an object
// private methods cannot be overriden
// final --> class ---> you cannot create child of class which means you cannot inherit
// final methods cannot be overriden

// Fields/Variables are not polymorphic
// class A {
//     static void fun() {
//         System.out.println("Hello");
//     }

//     private void fun2(){
//         System.out.println("HELLO");
//     }

//     final void fun3(){
//         System.out.println("hELLo");
//     }
// }
// class B extends A {
//     static void fun() {
//         System.out.println("Bye");
//     }

//     private void fun2(){ // this is another funtion not overriden function
//         System.out.println("Private");
//     }

//     // void fun3() {
//     //     System.out.println("ByE");
//     // }
// }

class A {
    int x = 10;
    int getX(){
        return this.x;
    }
}

class B extends A {
    int x = 20; // cannot be overriden

    int getX(){
        return this.x;
    }
}