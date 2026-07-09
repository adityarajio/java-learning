public class Oops {
    public static void main(String[] args) {
        Student s1 = new Student();
        Student s2 = new Student();
        s1.name = "Aditya";
        s1.age = 18;
        s1.rollNumber = 121;
        s1.college = "NIT Trichy";
        s2.name = "Rohit";
        s2.college = "IIT Guwahati";
        s2.age = 23;
        s2.rollNumber = 192;

        s1.markAttendance();
        s2.markAttendance();

        s1.getDetails();
        s2.getDetails();
    }
}

class Student {
    String name;
    int age;
    int rollNumber;
    String college;

    void markAttendance() {
        System.out.println("Attendance marked by " + name);
    }

    void getDetails() {
        System.out.println("name: " + name);
        System.out.println("age: " + age);
        System.out.println("roll Number: " + rollNumber);
        System.out.println("college: " + college);

    }
}

// Java is almost complete object oriented programming language