import java.util.*;
public class strcomp{
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
		String str1,str2;
		Scanner scanner = new Scanner(System.in);
		str1=scanner.next();
		str2=scanner.next();
		boolean res=compare(str1,str2);
		boolean equals=str1.equals(str2);
		System.out.println("Answer: "+res);
		System.out.println("Answer: "+equals);
		if(res==equals){
			System.out.println("Same result");
		}else{
			System.out.println("Different result");
		}
	}
}