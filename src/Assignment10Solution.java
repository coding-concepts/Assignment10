/*
 * @(#)Assignment10Solution.java 1.0 May 02, 2017
 */

public class Assignment10Solution {
    public static void main(String[] args) {

        System.out.println("Reverse of 454 is :" + reverse(454));
        System.out.println("Reverse of 12345 is:" + reverse(12345));
        System.out.println();
        System.out.println("Is Palindrome Number : 454 :" + isPalindrome(454));
        System.out.println("Is Palindrome Number : 12345 :" + isPalindrome(12345));
        System.out.println("Is Palindrome Number : 1234 :" + isPalindrome(1234));
        System.out.println();
        System.out.println("HarmonicSum(2)" + harmonicSum(2));
        System.out.println("HarmonicSum(23)" + harmonicSum(23));
        System.out.println("HarmonicSum(-23)" + harmonicSum(-23));
        System.out.println();
        System.out.println("contains({1, 3, 6, 8, 9}, 2) : " + contains(new int[]{1, 3, 6, 8, 9}, 2) );
        System.out.println("contains({1, 3, 6, 8, 9}, 3) : " + contains(new int[]{1, 3, 6, 8, 9}, 3) );
        System.out.println();
        System.out.println("search({1, 3, 6, 8, 9}, 2) : " + search(new int[]{1, 3, 6, 8, 9}, 2) );
        System.out.println("search({1, 3, 6, 8, 9}, 3) : " + search(new int[]{1, 3, 6, 8, 9}, 3) );
    }

    /**
     * This method should take a number and reverse that number.
     * You can use any logic to solve it.
     * @param input the input number
     * @return
     */
    private static int reverse(int input) {
        //TODO START

        int number = input; // copied number into variable
        int reverse = 0;

        while (number != 0) {
            int remainder = number % 10;
            reverse = reverse * 10 + remainder;
            number = number / 10;
        }

        return reverse;

    }

    /**
     * Try using the previous method. Returns true if palindrome, false if it is not.
     * @param input the number to be considered.
     * @return true if palindrome, false if it is not.
     */
    private static boolean isPalindrome(int input) {

        int j = reverse(input);
        if ( input == j){
            return true;
        }
        return false;

    }

    /**
     * HarmonicSum(n) = 1 + 1/2 + 1/3 + 1/4 + .... + 1/n
     * @param maxDenominator max demoniator - This is your n (assumption this is always be > 0);
     * @return the sum.
     */
    private static double harmonicSum(int maxDenominator) {
        double sum = 0d;
        // for-loop for summing from left-to-right
        for (int denominator = 1; denominator <= maxDenominator; ++denominator) {
            double myVal =  1d/denominator;
            sum = sum +myVal;
        }
        return sum;
    }

    /**
     * This method checks whether array contains the key
     * Examples:
     * contains ({1, 3, 6, 8, 9}, 2) should return false
     * contains ({1, 3, 6, 8, 9}, 3) should return true
     * @param array
     * @param key
     * @return
     */
    private static boolean contains(int[] array, int key) {
        if (array != null){
            for (int i : array) {
                if (i == key) {
                    return true;
                }
            }
        }
        return false;
    }

    /**
     * Write a method called search(), which takes an array of int and an int; and
     * returns the array index if the array contains the given int; or -1 otherwise.
     * search ({1, 3, 6, 8, 9}, 3) -> should return 1
     * search ({1, 3, 6, 8, 9}, 20) -> should return -1
     * @param array
     * @param key
     * @return
     */
    public static int search(int[] array, int key) {
        //TODO Write your code here. Hint: same as the previous one with a littel difference on what it returns
        int returnValue = -1;

        for (int i = 0; i < array.length; i++){
            if (array[i] == key){
                returnValue = i;
                break;
            }
        }
        return returnValue;
    }
}



