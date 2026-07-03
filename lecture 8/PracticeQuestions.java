public class PracticeQuestions {
    public static void main(String[] args) {
        /*
         * Question 1: Print Square Pattern (Easy)
         * Write a Java program to print the following pattern:
            * * * *
            * * * *
            * * * *
            * * * *
         */

        // for(int i = 1; i<=4; i++){
        // for (int j = 0;j < 4; j++) {
        // System.out.print("*");
        // }
        // System.out.println();
        // }

        /*
         * Question 2: Print Perpendicular Line (Easy)
         * Write a Java program to print:
            * * * * *
                *
                *
                *
                *
         * Condition:
         * ● Number of stars = 5
         * ● Use loop
         * 
         */

        // for (int j = 0; j < 5; j++) {
        //     if (j == 0) {
        //         for (int j2 = 0; j2 < 5; j2++) {
        //             System.out.print("* ");
        //     }
        //     System.out.println();
        //     } else {

        //         System.out.println("    *");
        //     }
        // }

        /*
         * Question 3: Print Right Triangle Pattern (Easy)
         * Write a Java program to print:
            *
            * *
            * * *
            * * * *
            * * * * *
         * Condition:
         * ● Rows = 5
         * 
         */

        // for (int i = 1; i <= 5; i++) {
        // for (int j = 1; j <= i; j++) {
        // System.out.print("* ");
        // }
        // System.out.println();
        // }

        /*
         * Question 4: Print Inverted Right Triangle (Easy–Medium)
         * Write a Java program to print:
            * * * * *
            * * * *
            * * *
            * *
            *
         * Condition:
         * ● Rows = 5
         */

        // for (int i = 1; i <= 5; i++) {
        // for (int j = 5; j >= i; j--) {
        // System.out.print("* ");
        // }
        // System.out.println();
        // }

        /*
         * Question 5: Print Number Square Pattern (Easy–Medium)
         * Write a Java program to print:
         * 1 1 1 1
         * 2 2 2 2
         * 3 3 3 3
         * 4 4 4 4
         */

        // for (int i = 1; i <= 4; i++) {
        //     for (int j = 1; j <= 4; j++) {
        //         System.out.print(i + " ");
        //     }
        //     System.out.println();
        // }

        /*
         * Question 6: Print Increasing Number Triangle (Medium)
         * Write a Java program to print:
         * 1
         * 1 2
         * 1 2 3
         * 1 2 3 4
         * 1 2 3 4 5
         */

        // for (int i = 1; i <= 5; i++) {
        //     for (int j = 1; j <= i; j++) {
        //         System.out.print(j + " ");
        //     }
        //     System.out.println();
        // }

        /*
        Question 7: Print Continuous Number Triangle (Medium)
        Write a Java program to print:
        1
        2 3
        4 5 6
        7 8 9 10
        Hint: Numbers should continue, not restart from 1
        */

        // for (int i = 1, n = 1; i <= 4; i++) {
        //     for (int j = 1; j <= i; j++) {
        //         System.out.print(n+" ");
        //         n++;
        //     }
        //     System.out.println();
        // }

        /*
        Question 8: Print Pyramid Pattern (Medium)
        Write a Java program to print:
            *
           * *
          * * *
         * * * *
        * * * * *
        Condition:
        ● Rows = 5
        ● Maintain proper spacing
        */
        // for (int i = 1; i <= 5; i++) {
        //     for (int j = 1; j <= 5-i; j++) {
        //         System.out.print(" ");
        //     }
        //     for (int k = 1; k <= i; k++) {
        //         System.out.print("* ");
        //     }
        //     System.out.println();
        // }

        /*
        Question 9: Print Inverted Pyramid (Medium–Hard)
        Write a Java program to print:
        * * * * *
         * * * *
          * * *
           * *
            *

        */

        // for(int i = 1; i <=5; i++){
        //     for(int j = 1; j <= i; j++){
        //         System.out.print(" ");
        //     }
        //     for(int k = 5; k >=i; k--){
        //         System.out.print("* ");
        //     }
        //     System.out.println();
        // }

        /*
        Question 10: Print Half Pyramid with Same Numbers
        (Medium–Hard)
        Write a Java program to print:
                1
               2 2
              3 3 3
             4 4 4 4
            5 5 5 5 5
        */

        // for (int i = 1; i <= 5; i++) {
        //     for (int k = 1; k <= 5-i; k++) {
        //         System.out.print(" ");
        //     }
        //     for (int j = 1; j <= i; j++) {
        //         System.out.print(i + " ");
        //     }
        //     System.out.println();
        // }

        /*
        Question 11: Print Binary Pattern (Hard)
        Write a Java program to print:
            1
            0 1
            1 0 1
            0 1 0 1
            1 0 1 0 1
        */

        // for (int i = 1; i <= 5; i++) {
        //     for (int j = 1; j <= i; j++) {
        //         if((i+j)%2==0){
        //             System.out.print("1 ");
        //         }else{
        //             System.out.print("0 ");
        //         }
        //     }
        //     System.out.println();
        // }

        /*
        Question 12: Print Diamond Pattern (Hard)
        Write a Java program to print:
            *
           * *
          * * *
         * * * *
        * * * * *
         * * * *
          * * *
           * *
            *
        */
        // for (int i = 1; i <= 5; i++) {
        //     for (int j = 1; j <= 5-i; j++) {
        //         System.out.print(" ");
        //     }
        //     for (int k = 1; k <= i; k++) {
        //         System.out.print("* ");
        //     }
        //     System.out.println();
        // }

        // for (int i = 1; i <= 4; i++) {
        //     for (int j = 1; j <= i; j++) {
        //         System.out.print(" ");
        //     }
        //     for (int k = 4; k >= i; k--) {
        //         System.out.print("* ");
        //     }
        //     System.out.println();
        // }

        /*
        Question 13: Print Floyd’s Triangle
            1
            2 3
            4 5 6
            7 8 9 10
            11 12 13 14 15
        */

        // int rows = 100;
        // for (int i = 1,n = 1; i <= rows; i++) {
        //     for (int j = 1; j <= i; j++) {
        //         System.out.print(n+ " ");
        //         n++;
        //     }
        //     System.out.println();
        // }

        /*
        Question 14: Print Pascal's Triangle
            1
           1 1
          1 2 1
         1 3 3 1
        1 4 6 4 1
        */

        // int rows = 12;

        // for (int i = 0; i < rows; i++) {
        //     for(int s = 0; s< rows -i - 1; s++){
        //         System.out.print(" ");
        //     }

        //     int val = 1;
        //     for (int j = 0; j <= i; j++) {
        //         System.out.print(val + " ");

        //         val = val * (i - j) / (j + 1);
        //     }
        //     System.out.println();

        // }
    }
}
