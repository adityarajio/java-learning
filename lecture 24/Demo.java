public class Demo {
    public static void main(String[] args) {
        Payment p = new CreditCard();
        p.pay();
    }
}

// polymorphism

interface Payment {
    void pay();
}

class CreditCard implements Payment {

    @Override
    public void pay() {
        System.out.println("Paying via credit Card");
    }
    
}

class DebitCard implements Payment {

    @Override
    public void pay() {
        System.out.println("Paying via Debit Card");
    }
    
}