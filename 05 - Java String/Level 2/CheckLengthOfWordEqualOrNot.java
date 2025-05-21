import java.util.*;
public class CheckLengthOfWordEqualOrNot{
	public static int findlength(String str){
		int count=0;
		try{
			while(true){
				str.charAt(count);
				count++;
			}
		}catch(IndexOutOfBoundsException e){
			return count;
		}
	}
	public static void main(String[] args){
		String text;
		Scanner scanner=new Scanner(System.in);
		text=scanner.next();
		int manual=findlength(text);
		int builtin=text.length();
		System.out.println("\nLength manually: "+manual);
		System.out.println("Length using length(): "+builtin);
		System.out.println("Are both equal? "+(manual==builtin));
	}
}