import java.util.*;
public class NumberCheckOperations{
	public static void main(String[] args){
	int n=28;
	System.out.println("Number: " + n);
	int[] factors = findFactors(n);
        System.out.println("Factors: " + Arrays.toString(factors));

        System.out.println("Greatest Factor: " + findGreatestFactor(factors));
        System.out.println("Sum of Factors: " + sumOfFactors(factors));
        System.out.println("Product of Factors: " + productOfFactors(factors));
        System.out.println("Product of Cubes of Factors: " + productOfCubesOfFactors(factors));

        System.out.println("Is Perfect Number: " + isPerfectNumber(n));
        System.out.println("Is Abundant Number: " + isAbundantNumber(n));
        System.out.println("Is Deficient Number: " + isDeficientNumber(n));
        System.out.println("Is Strong Number: " + isStrongNumber(n));
    }
	public static int[] findFactors(int n) {
        List<Integer> factorList = new ArrayList<>();
        for (int i = 1; i <= n; i++) {
            if (n % i == 0) {
                factorList.add(i);
            }
        }
        return factorList.stream().mapToInt(i -> i).toArray();
    }
	public static int findGreatestFactor(int[] factors) {
        return factors[factors.length - 2]; // The second last element is the greatest factor (excluding itself)
    }
	public static int sumOfFactors(int[] factors) {
        int sum = 0;
        for (int factor : factors) {
            sum += factor;
        }
        return sum;
    }
	public static int productOfFactors(int[] factors) {
        int product = 1;
        for (int factor : factors) {
            product *= factor;
        }
        return product;
    }
	public static double productOfCubesOfFactors(int[] factors) {
        double product = 1;
        for (int factor : factors) {
            product *= Math.pow(factor, 3);
        }
        return product;
    }
	public static boolean isPerfectNumber(int n) {
        int sum = 0;
        for (int i = 1; i < n; i++) {
            if (n % i == 0) {
                sum += i;
            }
        }
        return sum == n;
    }
	public static boolean isAbundantNumber(int n) {
        int sum = 0;
        for (int i = 1; i < n; i++) {
            if (n % i == 0) {
                sum += i;
            }
        }
        return sum > n;
    }
	public static boolean isDeficientNumber(int n) {
        int sum = 0;
        for (int i = 1; i < n; i++) {
            if (n % i == 0) {
                sum += i;
            }
        }
        return sum < n;
    }
	public static boolean isStrongNumber(int n) {
        int sum = 0, temp = n;
        while (temp > 0) {
            sum += factorial(temp % 10);
            temp /= 10;
        }
        return sum == n;
    }
	public static int factorial(int num) {
        int fact = 1;
        for (int i = 2; i <= num; i++) {
            fact *= i;
        }
        return fact;
    }
}