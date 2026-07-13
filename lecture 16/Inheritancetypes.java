// Types of Inheritance
/*
Simple Inheritance
Multi-level Inheritance
hierarchical Inheritance
Multiple Inheritance (not supported in java)
*/

public class Inheritancetypes {
    public static void main(String[] args) {
        CSEengineeringStudent cse = new CSEengineeringStudent();

    }
}


// Simple Inheritance
class Student { // Parent
    String name;
    int age;

    void markedAttendence(){
        System.out.println("Attendence marked!");
    }
}

class EngineeringStudent extends Student { // Child
    void attendLab() {
        System.out.println("lab attended");
    }
}

// Multilevel Inheritance
/* A -> B -> C */

class CSEengineeringStudent extends EngineeringStudent {
    void attendCSELab(){
        System.out.println("lab attended");

    }
}

/*
Student
|
Engineering Student
|
CSEengineeringStudent
*/



// Hierarchical Inheritance
/*

    A
  /   \
B       C

*/

class MedicalStudent extends Student {
    void attendLab() {
        System.out.println("lab attended");
    }
}

/*
Multiple Inheritance

    A   B   
     \ /
      C

*/