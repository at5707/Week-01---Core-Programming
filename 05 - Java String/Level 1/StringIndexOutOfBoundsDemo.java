import java.util.*;
public class StringIndexOutOfBoundsDemo{
	public static void generateException(String str){
		System.out.println("Attempting to access invalid index...");
		System.out.println(str.charAt(str.length()));
	}
	public static void handleException(String str){
		try{
			System.out.println("Attempting to access invalid index...");
			System.out.println(str.charAt(str.length()));
		}catch(StringIndexOutOfBoundsException e){
			System.out.println("Exception caught: "+e);
		}
	}
	public static void main(String[] args){
		String str;
		Scanner scanner = new Scanner(System.in);
		str=scanner.next();
		handleException(str);
	}
}