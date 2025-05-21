import java.util.*;
public class HarshadNumberDigitCheck{
	public static void main(String[] args){
		int n=156;
		System.out.println("Number: " + n);
        System.out.println("Digit count: " + countDigits(n));
		int[] digits=storeDigits(n);
        System.out.println("Digits: " + Arrays.toString(digits));
		System.out.println("Sum: " + sumOfDigits(digits));
		System.out.println("Sum of Squares of Digits: " + sumOfSquaresOfDigits(digits));
		System.out.println("Is Harshad Number: " + isHarshadNumber(n, digits));
		int[][] frequencyArray=digitFrequency(n);
		System.out.println("Digit Frequency:");
        for (int[] row : frequencyArray) {
			if(row[1]>0){
				System.out.println("Digit: " + row[0] + ", Frequency: " + row[1]);
            }
        }
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
	public static int sumOfDigits(int[] digits) {
        int sum = 0;
        for (int digit : digits) {
            sum += digit;
        }
        return sum;
    }
	public static int sumOfSquaresOfDigits(int[] digits) {
        int sum = 0;
        for (int digit : digits) {
            sum += Math.pow(digit, 2);
        }
        return sum;
    }
	public static boolean isHarshadNumber(int n, int[] digits) {
        int sum = sumOfDigits(digits);
        return n % sum == 0;
    }
	public static int[][] digitFrequency(int n) {
        int[] freq = new int[10]; // Array to store frequency of digits 0-9
        while (n > 0) {
            int digit = n % 10;
            freq[digit]++;
            n /= 10;
        }

        int[][] result = new int[10][2]; // 2D array to store digit and its frequency
        for (int i = 0; i < 10; i++) {
            result[i][0] = i; // Digit
            result[i][1] = freq[i]; // Frequency
        }
        return result;
    }
}