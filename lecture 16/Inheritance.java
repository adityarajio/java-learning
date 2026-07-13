public class Inheritance {
    public static void main(String[] args) {
        EngineeringStudent es = new EngineeringStudent();
        es.markedAttendence();
        es.attendLab();

        Student s1 = new Student();
        s1.markedAttendence();
        // s1.attendLab(); --> Not Valid
    }
}
/*
parent (Super Class) --> child (Sub Class)
*/
class Student {
    String name;
    int age;

    void markedAttendence(){
        System.out.println("Attendence marked!");
    }
}

class EngineeringStudent extends Student {
    void attendLab() {
        System.out.println("lab attended");
    }
}
