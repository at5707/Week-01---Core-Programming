import java.util.*;
public class CheckNumberParameters{
	public static void main(String[] args){
		int n=153;
		System.out.println("Number: " + n);
        System.out.println("Digit count: " + countDigits(n));
		int[] digits=storeDigits(n);
        System.out.println("Digits: " + Arrays.toString(digits));
		System.out.println("Is Duck Number: " + isDuckNumber(digits));
        System.out.println("Is Armstrong Number: " + isArmstrongNumber(n, digits));
        
        int[] largestTwo = findLargestTwo(digits);
        System.out.println("Largest: " + largestTwo[0] + ", Second Largest: " + largestTwo[1]);
        
        int[] smallestTwo = findSmallestTwo(digits);
        System.out.println("Smallest: " + smallestTwo[0] + ", Second Smallest: " + smallestTwo[1]);
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

    public static boolean isDuckNumber(int[] digits) {
        for (int digit : digits) {
            if (digit == 0) return true;
        }
        return false;
    }

    public static boolean isArmstrongNumber(int n, int[] digits) {
        int sum = 0;
        int power = digits.length;
        for (int digit : digits) {
            sum += Math.pow(digit, power);
        }
        return sum == n;
    }

    public static int[] findLargestTwo(int[] digits) {
        int max1 = Integer.MIN_VALUE, max2 = Integer.MIN_VALUE;
        for (int digit : digits) {
            if (digit > max1) {
                max2 = max1;
                max1 = digit;
            } else if (digit > max2 && digit != max1) {
                max2 = digit;
            }
        }
        return new int[]{max1, max2};
    }

    public static int[] findSmallestTwo(int[] digits) {
        int min1 = Integer.MAX_VALUE, min2 = Integer.MAX_VALUE;
        for (int digit : digits) {
            if (digit < min1) {
                min2 = min1;
                min1 = digit;
            } else if (digit < min2 && digit != min1) {
                min2 = digit;
            }
        }
        return new int[]{min1, min2};
    }
}
