// Encapsulation in Java

public class Encapsulation {
    public static void main(String[] args) {
        BankAccount ba = new BankAccount();
        // ba.BALANCE = 100000; --> not allowed
        // System.out.println(ba.BALANCE); --> not allowed
        ba.deposit(500);
        ba.withdraw(300);
        System.out.println(ba.getBalance());
    }
}

class BankAccount {
    private double BALANCE;

    public void deposit(double amount){
        BALANCE+=amount;
    }

    public void withdraw(double amount){
        BALANCE-=amount;
    }

    // Getters / Setters
    public double getBalance(){
        return BALANCE;
    }
}

class Student {
    private String name;
    private int rollNumber;
    private int age;
    private String college;

    Student(String name, int rollNumber, int age, String college){
        this.name = name;
        this.age = age;
        this.rollNumber = rollNumber;
        this.college = college;
    }

    // Getters and Setters

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getRollNumber() {
        return rollNumber;
    }
    
    public void setRollNumber(int rollNumber) {
        this.rollNumber = rollNumber;
    }

    public int getAge() {
        return age;
    }
    public void setAge(int age) {
        this.age = age;
    }

    public String getCollege() {
        return college;
    }

    public void setCollege(String college) {
        this.college = college;
    }

    

    
}