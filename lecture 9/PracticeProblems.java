// import java.util.Scanner;

public class PracticeProblems {
    public static void main(String[] args) {
        /*
         * Find the Maximum and Minimum: Write a program that takes an array of integers
         * and finds the largest and smallest numbers in the array without using
         * built-in library functions like Arrays.sort()
         */

        // int arr[] = {1,2,4,6,0, -1, 2, 12};

        // int min = arr[0];
        // int max = arr[0];

        // for(int i = 0; i < arr.length; i++){
        // if(min>arr[i]){
        // min = arr[i];
        // }
        // if(max<arr[i]){
        // max = arr[i];
        // }
        // }

        // System.out.println("Minimum Value: " + min);
        // System.out.println("Maximum Value: " + max);

        /*
         * Array Reversal: Write a program to reverse an array in-place. This means you
         * should swap the elements (first with last, second with second-to-last, etc.)
         * without creating a second array.
         */

        // int arr[] = { 1, 2, 3, 4, 5, 6, 7 };
        // for (int i = 0; i < arr.length/2; i++) {
        //     int num = arr[i];
        //     arr[i] = arr[arr.length -1 -i];
        //     arr[arr.length -1 -i] = num;
        // }
        // for (int i = 0; i < arr.length; i++) {
        //    System.out.print(arr[i] + " ");
        // }

        /*
        Count Occurrences: Create a program that takes an array and a target integer as input. Return the number of times that target integer appears in the array.
        */

        // Scanner sc = new Scanner(System.in);
        // System.out.print("Enter a number: ");
        // int input = sc.nextInt();
        // System.out.println();
        // int arr[] = {1, 2, 4, 5, 5, 6, 5, 7, 2, 3, 1, 2, 7, 9, 5};
        // int count = 0;
        // for (int i = 0; i < arr.length; i++) {
        //     if(input==arr[i]){
        //         count++;
        //     }
        // }
        // System.out.println("Your input occurs in this array "+count+" times");


        /*
        Remove Duplicates: Given a sorted array, write a program to remove the duplicate elements so that each element appears only once. Note: Since standard arrays are fixed-size, you might need to create a new array or return the new "logical" length.
        */

        // int[] arr = {1, 1, 2, 2, 3, 4, 5, 5}; // Must be sorted
       
        // int n = arr.length;
        // int newarr[] = new int[arr.length];
        // if(n==0) return;

        // int j = 0;
        // for (int i = 0; i < n - 1; i++) {
        //     if(arr[i] != arr[i+1]){
        //         newarr[j] = arr[i];
        //         j++;
        //     }
        // }

        // newarr[j] = arr[n - 1];
        // j++;

        // int arr2[] = new int[j];
        // for (int i = 0; i < arr2.length; i++) {
        //     arr2[i] = newarr[i];
        // }

        // System.out.println("New Logical Length: "+j);
        // for (int i = 0; i < arr2.length; i++) {
        //     System.out.print(arr2[i]+ " ");
        // }


        /*
        Check for Palindrome: Write a program to check if an array reads the same forwards and backwards (e.g., [1, 2, 3, 2, 1] is a palindrome).
        */

        // int [] arr = {1, 2, 3, 2, 1};
        // boolean isPalindrome = true;
        // for (int i = 0; i < arr.length/2; i++) {
        //     if(arr[i]!=arr[arr.length -1 - i]){
        //         isPalindrome = false;
        //         break;
        //     }
        // }

        // if(isPalindrome){
        //     System.out.println("The Array is Palindrome.");
        // }
        // else{
        //     System.out.println("The Array is not Palindrome");
        // }

        /*
        Rotate Array: Write a program to rotate an array of n elements to the right by k steps. For example, if the array is [1, 2, 3, 4, 5] and k=2, the result should be [4, 5, 1, 2, 3]
        */

        int arr[] = {1, 2, 3, 4, 5};

        int k = 2; //steps to move towards right
        for(int steps = 0; steps<k; steps++){
            int last = arr[arr.length-1];
            for (int i = arr.length-1; i >0; i--) {
                arr[i] = arr[i - 1];
            }
            arr[0] = last;
        }

        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
    }
}
