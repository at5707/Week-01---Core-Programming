import java.util.*;
public class NumberCheckOperationsPrimeNeonSpyAutomorphicBuzz{
	public static void main(String[] args){
	int n=7;
	System.out.println("Number: " + n);

        System.out.println("Is Prime Number: " + isPrime(n));
        System.out.println("Is Neon Number: " + isNeon(n));
        System.out.println("Is Spy Number: " + isSpyNumber(n));
        System.out.println("Is Automorphic Number: " + isAutomorphic(n));
        System.out.println("Is Buzz Number: " + isBuzz(n));
    }
	public static boolean isPrime(int n) {
        if (n <= 1) return false;
        for (int i = 2; i <= Math.sqrt(n); i++) {
            if (n % i == 0) return false;
        }
        return true;
    }
	public static boolean isNeon(int n) {
        int square = n * n;
        int sum = 0;
        while (square > 0) {
            sum += square % 10;
            square /= 10;
        }
        return sum == n;
    }
	public static boolean isSpyNumber(int n) {
        int sum = 0, product = 1;
        while (n > 0) {
            int digit = n % 10;
            sum += digit;
            product *= digit;
            n /= 10;
        }
        return sum == product;
    }
	public static boolean isAutomorphic(int n) {
        int square = n * n;
        return String.valueOf(square).endsWith(String.valueOf(n));
    }
	public static boolean isBuzz(int n) {
        return n % 7 == 0 || n % 10 == 7;
    }
}