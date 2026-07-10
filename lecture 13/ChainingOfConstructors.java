public class ChainingOfConstructors {
    public static void main(String[] args) {
        Student s1 = new Student();
        Student s2 = new Student("Aditya");
        Student s3 = new Student("Rohit",25);
        Student s4 = new Student("Mohit", 22, 345);
        Student s5 = new Student("Rohan", 21, 3422, "NIT Warangal");

        s1.getDetails();

    }
}

// Constructor Chaining
class Student {
    String name;
    int age;
    int rollNumber;
    String college;

    Student() {
        
        this("Unknown");
        System.out.println("I am in first constructor");
    }

    Student(String name) {
        this(name, 0);
        System.out.println("I am in second constructor");
    }

    Student(String name, int age) {
        this(name, age, 0);
        System.out.println("I am in third constructor");
    }

    Student(String name, int age, int rollNumber) {
        this(name, age, rollNumber, "Unknown");
        System.out.println("I am in fourth constructor");
    }

    Student(String name, int age, int rollNumber, String college) {
        this.name = name;
        this.age = age;
        this.rollNumber = rollNumber;
        this.college = college;

        System.out.println("I am in fifth constructor");
    }

    void markAttendance() {
        System.out.println("Attendance marked for student " + name);
    }

    void getDetails() {
        System.out.println("name: " + name);
        System.out.println("age: " + age);
        System.out.println("roll Number: " + rollNumber);
        System.out.println("college: " + college);

    }
}