// final keyword
public class finalKeyword {
    public static void main(String[] args) {
        // Random r1 = new Random();
        // System.out.println(r1.PI);
        System.out.println(Random.PI);

        final int x;
        x = 4;

        // x = 5; // NOT allowed since already assigned 
        System.out.println(x);
    }


}

// why main is static in java? --> if main was not static, JVM have to make object of our class and then call main, since JVM can't create object so main is static and now JVM can directly run main function

class Random {
    static final double PI = 3.14;

}
