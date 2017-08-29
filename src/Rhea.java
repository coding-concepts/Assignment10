/*
 * @(#)Rhea.java 1.0 May 07, 2017
 */

/**
 * <code>Rhea</code> class is
 * <p>
 * <p>
 * <pre>
 * <strong>History</strong>    Name              Date            Description
 * <strong>History</strong>    --------------------------------------------------------------------
 * <strong>History</strong>   Pratyush Giri    5/7/17
 * </pre>
 *
 * @author Pratyush Giri
 * @since May 07, 2017
 */
public class Rhea {    public static void main(String[] args) {
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
        //Here you need to write code to return the revernumbr. Given 123, this should return 321
        int output=0;

        while(input>0) {
            output=input%10 + output*10;
            input/=10;
        }

        return output;
        //TODO END
    }

    /**
     * Try using the previous method. Returns true if palindrome, false if it is not.
     * @param input the number to be considered.
     * @return true if palindrome, false if it is not.
     */
    private static boolean isPalindrome(int input) {
        if(input==reverse(input)) {
            return true;
        }
        //TODO use reverse mthof
        return false;
    }

    /**
     * HarmonicSum(n) = 1 + 1/2 + 1/3 + 1/4 + .... + 1/n
     * @param maxDenominator max demoniantor - This is your n (assumption this is always be > 0);
     * @return the sum.
     */
    private static double harmonicSum(int maxDenominator) {
        double sum=0;
        for (double i=1; i<=maxDenominator; i++) {
            sum = sum + 1/i;
        }
        //TODO write the code. Hint: find the pattern;
        return sum;
    }

    /**
     * This method checks whether array contains the key
     * Examples:
     * contains ({1, 3, 6, 8, 9}, 2) should return false
     * contains ({1, 3, 6, 8, 9}, 3) should return true
     * @param array array
     * @param key key
     * @return true if  the key is found, else false.
     */
    private static boolean contains(int[] array, int key) {
        for (int i=0; i<array.length; i++) {
            if (key == array[i]) {
                return true;
            }
        }
        return false;
    }

    /**
     * Write a method called search(), which takes an array of int and an int; and
     * returns the array index if the array contains the given int; or -1 otherwise.
     * search ({1, 3, 6, 8, 9}, 3) -> should return 1
     * search ({1, 3, 6, 8, 9}, 20) -> should return -1
     * @param array the array
     * @param key the key
     * @return the index if found or -1 if does not.
     */
    public static int search(int[] array, int key) {
        for (int i=0; i<array.length; i++) {
            if (key == array[i]) {
                return i;
            }
        }
        return -1;
    }
}

