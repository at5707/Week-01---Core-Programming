import java.util.*;
public class reversenumber{
	public static void main(String[] args){
		int n=1221;
		System.out.println("Number: " + n);
        System.out.println("Digit count: " + countDigits(n));
		int[] digits=storeDigits(n);
        System.out.println("Digits: " + Arrays.toString(digits));
		int[] reversedDigits = reverseDigits(digits);
        System.out.println("Reversed Digits: " + Arrays.toString(reversedDigits));

        System.out.println("Are original and reversed arrays equal? " + areArraysEqual(digits, reversedDigits));

        System.out.println("Is Palindrome Number: " + isPalindrome(digits));

        System.out.println("Is Duck Number: " + isDuckNumber(digits));
    }
	public static int countDigits(int n) {
        return String.valueOf(n).length();
    }
	public static int[] storeDigits(int n) {
        String numStr = String.valueOf(n);
        int[] digits = new int[numStr.length()];
        for (int i = 0; i < numStr.length(); i++) {
            digits[i] = Character.getNumericValue(numStr.charAt(i));
        }
        return digits;
    }
	public static int[] reverseDigits(int[] digits) {
        int[] reversed = new int[digits.length];
        for (int i = 0; i < digits.length; i++) {
            reversed[i] = digits[digits.length - 1 - i];
        }
        return reversed;
    }
	public static boolean areArraysEqual(int[] arr1, int[] arr2) {
        return Arrays.equals(arr1, arr2);
    }
	public static boolean isPalindrome(int[] digits) {
        int[] reversed = reverseDigits(digits);
        return areArraysEqual(digits, reversed);
    }
	public static boolean isDuckNumber(int[] digits) {
        for (int digit : digits) {
            if (digit == 0) {
                return true;
            }
        }
        return false;
    }
}