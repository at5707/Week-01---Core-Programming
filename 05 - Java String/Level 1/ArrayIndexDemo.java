import java.util.*;
public class ArrayIndexDemo{
	public static void generateException(String[] names){
		System.out.println("Attempting to access an out-of-bounds index...");
		System.out.println(names[names.length]);
	}
	public static void handleException(String[] names){
	try{
		System.out.println("Attempting to access an out-of-bounds index...");
		System.out.println(names[names.length]);
	}catch(ArrayIndexOutOfBoundsException e){
			System.out.println("ArrayIndexOutOfBoundsException caught: "+e);
		}catch(RuntimeException e){
			System.out.println("Runtime exception caught: "+e);
		}
	}
	public static void main(String[] args){
		int size;
		Scanner scanner = new Scanner(System.in);
		size=scanner.nextInt();
		scanner.nextLine();
		String[] names=new String[size];
		System.out.println("Enter "+size+" names:");
		for(int i=0;i<size;i++){
			names[i]=scanner.nextLine();
		}
		handleException(names);
	}
}