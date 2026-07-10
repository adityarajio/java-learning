public class DefaultValues {
    public static void main(String[] args) {
        Student s1 = new Student();

        s1.name = "Aditya";
        s1.age = 18;
        s1.rollNumber = 121;
        s1.college = "NIT Trichy";

        // Constructors --> to create an Object
        System.out.println(s1.name);
        System.out.println(s1.age);
        System.out.println(s1.rollNumber);
        System.out.println(s1.college);

        // int x; // local variable --> no default values
        // System.out.println(x);
    }
}

// Defaullt Values

/*
 * Integer --> 0
 * Floating --> 0.0
 * String --> null
 * Boolean --> false
 */

class Student {
    String name; // information/data/characteristics --> Instance variables
    int age;
    int rollNumber;
    String college;

    void markAttendance() { // behaviours --> Instance methods
        System.out.println("Attendance marked for student " + name);
    }
}