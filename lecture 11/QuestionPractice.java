public class QuestionPractice {
    public static void main(String[] args) {
        /*
        Write a Java method to find the smallest number among three numbers.
        */

        System.out.println(getSmallestNumber(1, 1, 3));

        /*
        Write a Java method to compute the average of three numbers.
        */

        System.out.println(getAverage(1,3,4));

        /*
        Write a Java method to count all vowels in a string.
        */

        getVowels("Aditya");

        /*
        Write a Java method to check whether a year (integer) entered by the user is a leap year or not.
        */

        System.out.println(getLeapYear(2004));

        /*
        Write a Java method to print nth number of fibonacci series
        */

        System.out.println("fibonacci 2th term is: "+getFibNum(2));
    }

    static int getFibNum(int n){
        if(n==0||n==1) return 1;
        int x = getFibNum(n-1);
        int y = getFibNum(n-2);
        return x+y;
    }

    static int getSmallestNumber(int a, int b, int c){
        if(a <=b && a <= c ){
            return a;
        }
        else if(b <=a && b <=c){
            return b;
        }
        else{
            return c;
        }
        
    }

    static double getAverage(double a, double b, double c){
        return (a+b+c)/3;
    }

    static void getVowels(String var){
        int count = 0;
        for (int i = 0; i < var.length(); i++) {
            if(var.charAt(i)=='a' || var.charAt(i)=='e' || var.charAt(i)=='i' || var.charAt(i)=='o' || var.charAt(i)=='u'){
                count++;
            }
        }

        System.out.println("The String "+var+" have "+count+" vowels!");
    }

    static boolean getLeapYear(int year){
        return year%4==0? true: false;
    }
}