public class Main{
    public static void main(String[] args){
        
        //Integers --> byte, short, int, long
        short s = 10;
        int i = 4000;
        long l = 3412__56_789;

        //Binary(2), Octal(8), Hexadecimal (16) number system
        //byte b = 5;  // decimal
        //byte b = 0b101; // Binary
        //byte b = 07; // 0 - 7 --> octal


        byte b = 0XA; // hexadecimal (0 - 15) --> 0-9, A,B,C,D,E,F
        

        // Real numbers
        //double d = 23.0987;  // double precision --> standard way
        double d  = 6.02____2e23; // 6.022 * 10^23 (Avagadro's Number)
        float fl = 10.5_4f;  // single precision
       
        // boolean
        boolean bool = false;

        //charcters
        char c = 'a'; // 'a' --> integer --> binary --> store

     

        System.out.println("Integer values --> " + b +  " , " + s + " , " + i + " , " + l);
        System.out.println("Floating values --> " + fl +  " , " + d);
        System.out.println("Character values --> " + c);
        System.out.println("Boolean values --> " + bool);
    }
}