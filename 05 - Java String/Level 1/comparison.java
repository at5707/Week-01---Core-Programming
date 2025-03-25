import java.util.*;
public class comparison{
	public static String create(String str,int start,int end){
		StringBuilder subStr=new StringBuilder();
		for(int i=start;i<end;i++){
			subStr.append(str.charAt(i));
		}
		return subStr.toString();
	}
	public static boolean compare(String str1,String str2){
		if(str1.length()!=str2.length()){
			return false;
		}
		for(int i=0;i<str1.length();i++){
			if(str1.charAt(i)!=str2.charAt(i)){
				return false;
			}
		}
		return true;
	}
	public static void main(String[] args){
		String str;
		int start,end;
		Scanner scanner = new Scanner(System.in);
		str=scanner.next();
		start=scanner.nextInt();
		end=scanner.nextInt();
		String subUse=create(str,start,end);
		String method=str.substring(start,end);
		boolean areEqual=compare(subUse,method);
		System.out.println("Substring using charAt(): "+subUse);
		System.out.println("Substring using substring(): "+method);
		System.out.println("Are both equal? "+areEqual);
	}
}