public class Demo2 {
    public static void main(String[] args) {
        // int status = PaymentStatus2.SUCCESS;
        // PaymentStatus status = PaymentStatus.FAILED;
        PaymentStatus status = PaymentStatus.PENDING;

        System.out.println(status.name());

    }
}

// Enum --> Enumerations (Enumerated type)
// Enum --> Predefined set of constants.

enum PaymentStatus {
    SUCCESS,
    FAILED,
    PENDING;
}

class PaymentStatus2 {
    PaymentStatus2 p = new PaymentStatus2();
    public static final int SUCCESS = 1;
    public static final int FAILED = 2;
    public static final int PENDING = 3;

}

final class Direction {
    public static final Direction NORTH = new Direction();

    private Direction () {}

    public static Direction getName(){
        return Direction.getName();
    }
}