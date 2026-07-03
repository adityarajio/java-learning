public class Main {
    public static void main(String[] args) {        
        

        //Suppose we have to print numbers from 1 to 10
        //int i = 1; // 1 to 10

        // System.out.println(i);
        // i++;
        // System.out.println(i);
        // i++;
        // System.out.println(i);
        // i++;

        // Loops --> while --> infinite

        /*
            while(expression) {
                // do something

            }
        */

        // while(i < 10) { // boolean --> true / false
        //     System.out.println(i); 
        //     i++;
        // }


        // do {
        //     // do something
        // } while(expression);

        // do {
        //     System.out.println(i);
        //     i++;
        // } while(i <= 10);

        // Menu item selection --> do-while
        /*
            1. Play Game
            2. Return saved Game
            3. Exit
        */
        // 1 to 10


         // For loop
        
        // for(int i = 10; i >= 1; i--) { // boolean --> true / false
        //     System.out.println(i);
        // }
        
        /*
         FLow of control of for
         1. First assignment statement is executed (Variable definition).
         2. Then second conditional statement is evaluated. (True / false)
         3. If true, control flow will evaluate the body of the loop.
         4. Once loop body is finished, control flow will go back to the for statement, and ithird increment
         statement will be evaluated.
         5. Again, conditional statement is evaluated.
         6. Repeat 2 - 5.
        */


        

        //boolean b = true;
        // for(int i=1; b == true; i++) {
        //     if(condition) {
        //         b = false;
        //     }
        // }
        

        // Integers -> byte, short, int, long

        // for(int i = 1; i <= 10; i++) {
        //     System.out.println(i);
        // }

        // Nested Loops
        // for(int i = 1; i<= 10; i++) {
        //    for(int j = 1; j <= i; j++) {
        //         System.out.print("* ");
        //    }
        //    System.out.println();
        // }

        /*
         i = 2
         * 
         * *
         * * * 
         * * * *
         * * * * *
         
        */

         // Jump Statements in Java --> break, continue

        // boolean b = false;

        // for(int i = 1; i <= 10; i++) {
        //     System.out.println(i);

        //     if(b == true) {
        //         break;
        //     }
        // }

        // Break in nested loops
        // for(int i = 1; i<= 10; i++) {
        //    for(int j = 1; j <= i; j++) {
        //         System.out.print("* ");

        //         if(j >= 5) {
        //             continue;
        //         }
        //    }

        //    System.out.println();
        // }


        // Whether a number is prime or not
        // int prime = 9;

        // // 2, 3, 4, 5, .... 6, 7

        // int i;
        // for(i = 2; i < p; i++) {
        //     if(prime % i == 0) {
        //         System.out.println("The number is not prime");
        //         break;
        //     }
        // }
        
        // if(i == prime) {
        //     System.out.println("The number is prime");
        // }

        // for(int i=1; i<=10; i++) {

        //     if(i % 2 == 0) {
        //         continue;
        //     }

        //     System.out.println(i);
        // }

        
        // Labels
        outer: for(int i = 1; i<= 10; i++) {
           inner: for(int j = 1; j <= i; j++) {
                System.out.print("* ");

                if(j >= 5) {
                    break outer;
                }
           }

        //    System.out.println();
        // }


        /*
        *
        * *
        * * *
        * * * *
        * * * * *
        
        */

        // Code blocks in java
        // first: {
        //     second: {
        //         third: {
        //             System.out.println("Hello");
        //             break first;
        //         }
        //     }
        // }


        }
    }
}