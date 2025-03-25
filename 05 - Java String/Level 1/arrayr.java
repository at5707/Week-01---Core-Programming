import java.util.*;
public class arrayr{
	public static char[] extract(String str){
		char[] charArray=new char[str.length()];
		for(int i=0;i<str.length();i++){
			charArray[i]=str.charAt(i);
		}
		return charArray;
	}
	public static boolean compare(char[] arr1,char[] arr2){
		if(arr1.length!=arr2.length){
			return false;
		}
		for(int i=0;i<arr1.length;i++){
			if(arr1[i]!=arr2[i]){
				return false;
			}
		}
		return true;
	}
	public static void main(String[] args){
		String str;
		Scanner scanner=new Scanner(System.in);
		str=scanner.next();
		char[] custom=extract(str);
		char[] builtin=str.toCharArray();
		boolean areEqual=compare(custom,builtin);
		System.out.println("Extracted char: "+new String(custom));
		System.out.println("Array char: "+new String(builtin));
		System.out.println("Both equal? "+areEqual);
	}
}