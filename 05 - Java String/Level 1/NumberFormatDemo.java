import java.util.*;
public class NumberFormatDemo{
	public static void generateException(String text){
		System.out.println("Attempting to parse input...");
		int number=Integer.parseInt(text);
		System.out.println("Converted number: "+number);
	}
	public static void handleException(String text){
		try{
			System.out.println("Attempting to parse input...");
			int number=Integer.parseInt(text);
			System.out.println("Converted number: "+number);
		}catch(NumberFormatException e){
			System.out.println("NumberFormatException caught: "+e);
		}catch(RuntimeException e){
			System.out.println("Runtime exception caught: "+e);
		}
	}
	public static void main(String[] args){
		String text;
		Scanner scanner = new Scanner(System.in);
		text=scanner.next();
		handleException(text);
	}
}