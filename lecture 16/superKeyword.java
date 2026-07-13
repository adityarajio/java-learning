public class superKeyword {
    public static void main(String[] args) {
        // EngineeringStudent es1 = new EngineeringStudent();
        // es1.name = "Aditya";
        // es1.age = 18;
        // es1.college = "NIT Trichy";
        // es1.rollNumber = 12;

        // es1.print();

        EngineeringStudent es2 = new EngineeringStudent("Aditya", 18, 121,  "IIT Guwahati");
        es2.print();

    }
}

class Student {
    String name;
    int age, rollNumber;

    Student() {
    }

    Student(String name, int age, int rollNumber) {
        this.name = name;
        this.age = age;
        this.rollNumber = rollNumber;
    }

    void print() {
        System.out.println(name + " , " + age + " , " + rollNumber);
    }
}

class EngineeringStudent extends Student {
    String college;

    EngineeringStudent(String name, int age, int rollNumber, String college) {
        super(name, age, rollNumber);
        // this.name = name;
        // this.age = age;
        // this.rollNumber = rollNumber;
        this.college = college;
    }

    void print() {
        super.print();
        System.out.println(college);
    }
}