// static keyword
public class StaticKeyword {
    public static void main(String[] args) {
        Student s1 = new Student("Aditya", 18, 101);
        Student s2 = new Student("Rohit", 22, 111);

        // Student.college = "IIT Guwahati";

        s1.getDetails();
        s2.getDetails();
    }
}

class Student {

    String name;
    int age, rollNumber;
    static String college;
    static int grade = 8;
    
    Student(String name, int age, int rollNumber){
        this.name = name;
        this.age = age;
        this.rollNumber = rollNumber;
    }

    // static block
    static {
        college = "IIT Guwahati";
        // grade = 8;
    }

    void getDetails() {
        System.out.println("name: " + name);
        System.out.println("age: " + age);
        System.out.println("roll Number: " + rollNumber);
        System.out.println("college: " + college);

    }
}
