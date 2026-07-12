// use of String[] args in main function
public class Stringargs {
    public static void main(String[] args) {
        System.out.println("No of arguments are: "+args.length);
        for (int i = 0; i < args.length; i++) {
            System.out.println("Argument "+i+ " = " + args[i]);
        }

        // usecase -> java Stringargs input.txt. output.txt

        // nowadays it has less use case but in previous years it had so much use case
    }
}
