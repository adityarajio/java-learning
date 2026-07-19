import java.util.Objects;

public class Demo {
    public static void main(String[] args) throws CloneNotSupportedException {
        Student s1 = new Student();
        s1.name = "Aditya";
        s1.age = 18;

        // System.out.println(s1);

        Student s2 = new Student();
        s2.name = "Aditya";
        s2.age = 18;

        // System.out.println(s1.equals(s2));

        // System.out.println(s1.hashCode() == s2.hashCode());

        // System.out.println(s1.getClass().getName());

        // System.out.println(s2.getClass().getName());

        // System.out.println(s1 instanceof Student); // true
        // System.out.println(s1 instanceof Object); // true

        Student s3 = (Student) s1.clone();
        System.out.println(s3.name + " , "+ s3.age);

    }
}

// InstanceOf Operator --> if an object is an instance of a class or a subclass

class Student extends Object implements Cloneable{
    int age;
    String name;

    @Override
    public String toString() {
        return ("name: " + this.name + "\n" + "age: " + age);
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;
        if (obj.getClass() != this.getClass())
            return false; // check if both are of type Student --> If not checked we'll get
                          // ClassCastException
        Student s = (Student) obj;
        return (this.name == s.name && this.age == s.age);

    }

    @Override
    public int hashCode() {
        // int result = 17;

        // result = result*31 + age;
        // result = result*31 + ((name==null)?0:name.hashCode());

        // return result;

        return Objects.hash(name, age); // simple way
    }

    @Override
    protected Object clone() throws CloneNotSupportedException {
        return super.clone();
    }
}