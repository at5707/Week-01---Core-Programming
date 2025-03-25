import java.util.*;
public class palindrome{
	public static boolean isPalindromeIterative(String text){
		int start=0,end=text.length()-1;
		while(start<end){
			if(text.charAt(start)!=text.charAt(end)){
				return false;
			}
			start++;
			end--;
		}
		return true;
	}
	public static boolean isPalindromeRecursive(String text,int start,int end){
		if(start>=end){
			return true;
		}
		if(text.charAt(start)!=text.charAt(end)){
			return false;
		}
		return isPalindromeRecursive(text,start+1,end-1);
	}
	public static boolean isPalindromeCharArray(String text){
		char[] original=text.toCharArray();
		char[] reverse=new char[original.length];
		for(int i=0;i<original.length;i++){
			reverse[i]=original[original.length-1-i];
		}
		return Arrays.equals(original,reverse);
	}
	public static void main(String[] args){
		String input;
		Scanner scanner=new Scanner(System.in);
		input=scanner.nextLine().replaceAll("\\s+","").toLowerCase();
		boolean iterative=isPalindromeIterative(input);
		boolean recursive=isPalindromeRecursive(input,0,input.length()-1);
		boolean charArray=isPalindromeCharArray(input);
		System.out.println("\nPalindrome Check Results:");
        System.out.println("---------------------------------");
        System.out.println("Using Iterative Method  : " + (iterative ? "Palindrome" : "Not a Palindrome"));
        System.out.println("Using Recursive Method  : " + (recursive ? "Palindrome" : "Not a Palindrome"));
        System.out.println("Using Character Array   : " + (charArray ? "Palindrome" : "Not a Palindrome"));
        System.out.println("---------------------------------");
	}
}
		
