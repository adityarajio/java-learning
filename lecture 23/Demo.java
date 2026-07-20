public class Demo {
    public static void main(String[] args) {
        // int status = PaymentStatus.SUCCESS;
        // System.out.println(status);
        // int staus2 = 100;
        // if (status == Role.ADMIN) {
            
        // }

        String status = PaymentStatus.SUCCESS;
        System.out.println(status);

        if(status=="success"){

        }
    }
}

// payment status --> success, failed, pending
// final for constants

/*
Problems with this approach
1. Type safety
2. Poor Readability
3. No Grouping of related entities
4. Duplicate Values
*/
class PaymentStatus {
    public static final String SUCCESS = "SUCCESS";
    public static final String FAILED = "FAILED";
    public static final String PENDING = "PENDING";

}

class Role {
    public static final int USER = 1;
    public static final int ADMIN = 2;
    public static final int MANAGER = 2;

}