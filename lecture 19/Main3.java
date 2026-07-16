// Local Classes

public class Main3 {
    public static void main(String[] args) {
        Outer outer = new Outer();
        outer.greet();
    }
}

// Effectively final variable rule in local class

class Outer {
    void greet() {
        int y = 5;
        // y++; can't change anymore once declared --> only for local variables --> so variable should be effectively final 
        class Local {
            void sayHello() {
                System.out.println(y);
            }
        }
        Local local = new Local();
        local.sayHello();
    }
}

/*
In which code blocks we can make local class
Constructor
Method
Loop
If
Static block
...
Any Block
*/