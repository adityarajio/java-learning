public class Demo2 {
    public static void main(String[] args) {
        College college = new College("IITG", "assam");

        Student s1 = new Student(18, "Aditya", college);

        System.out.println(s1.getCollege().name);

        s1.getCollege().setName("IITB");

        System.out.println(s1.getCollege().name);
    }
}


// Immutable class

// defensive copy of college (non primitive)
final class Student {
    private final String name;
    private final College college;
    private final int age;

    Student(int age, String name, College college) {
        this.age = age;
        this.name = name;
        this.college = new College(college.getName(), college.getAddress());
    }

    // getters
    public int getAge() {
        return this.age;
    }

    public String getName() {
        return this.name;
    }

    public College getCollege() {
        return new College(this.college.getName(), this.college.getAddress());
    }
}

// Mutable class
class College {
    String name, address;

    College(String name, String address) {
        this.name = name;
        this.address = address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAddress() {
        return address;
    }

    public String getName() {
        return name;
    }
}