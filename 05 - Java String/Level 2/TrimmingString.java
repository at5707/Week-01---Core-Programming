import java.util.*;
public class TrimmingString{
	public static int[] customTrim(String str){
		int length=findlength(str);
		int start=0,end=length-1;
		while(start<length&&str.charAt(start)==' '){
			start++;
		}
		while(end>=start&&str.charAt(end)==' '){
			end--;
		}
		return new int[]{start,end};
	}
	public static String customSubstring(String str,int start,int end){
		String result="";
		for(int i=start;i<=end;i++){
			result+=str.charAt(i);
		}
		return result;
	}
	public static boolean compareStrings(String str1,String str2){
		int length1=findlength(str1);
		int length2=findlength(str2);
		if(length1!=length2){
			return false;
		}
		for(int i=0;i<length1;i++){
			if(str1.charAt(i)!=str2.charAt(i)){
				return false;
			}
		}
		return true;
	}
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
		Scanner scanner = new Scanner(System.in);
		text=scanner.nextLine();
		int[] indexes=customTrim(text);
		String trimmedCustom=(indexes[0]>indexes[1])?"":customSubstring(text,indexes[0],indexes[1]);
		String trimmedBuiltIn=text.trim();
		System.out.println("\nOriginal String: \""+text+"\"");
		System.out.println("Custom Trimmed String: \""+trimmedCustom+"\"");
		System.out.println("Built-in Trimmed String: \""+trimmedBuiltIn+"\"");
		boolean isSame=compareStrings(trimmedCustom,trimmedBuiltIn);
		System.out.println("\nBoth trimmed strings are "+(isSame?"identical":"different"));
	}
}