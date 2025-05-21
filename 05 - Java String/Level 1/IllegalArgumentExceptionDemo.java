import java.util.*;
public class IllegalArgumentExceptionDemo{
	public static void generateException(String str){
		System.out.println("Attempting to use substring...");
		System.out.println(str.substring(5,2));
	}
	public static void handleException(String str){
		try{
			System.out.println("Attempting to use substring...");
			System.out.println(str.substring(5,2));
		}catch(IllegalArgumentException e){
			System.out.println("IllegalArgumentException caught: "+e);
		}catch(RuntimeException e){
			System.out.println("Runtime exception caught: "+e);
		}
	}
	public static void main(String[] args){
		String str;
		Scanner scanner = new Scanner(System.in);
		str=scanner.next();
		handleException(str);
	}
}