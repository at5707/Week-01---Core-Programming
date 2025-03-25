import java.util.*;
public class uniquechar{
	public static int getString(String text){
		int count=0;
		try{
			while(true){
				text.charAt(count);
				count++;
			}
		}catch(IndexOutOfBoundsException e){
			return count;
		}
	}
	public static char[] findUnique(String text){
		int len=getString(text);
		char[] uniquechars=new char[len];
		int uniquecount=0;
		for(int i=0;i<len;i++){
			char currentchar=text.charAt(i);
			boolean isUnique=true;
			for(int j=0;j<uniquecount;j++){
				if(uniquechars[j]==currentchar){
					isUnique=false;
					break;
				}
			}
			if(isUnique){
				uniquechars[uniquecount]=currentchar;
				uniquecount++;
			}
		}
		char[] result=new char[uniquecount];
		System.arraycopy(uniquechars,0,result,0,uniquecount);
		return result;
	}
	public static void main(String[] args){
		String input;
		Scanner scanner=new Scanner(System.in);
		input=scanner.nextLine();
		char[] uniquechars=findUnique(input);
		for(char c:uniquechars){
			System.out.print(c+" ");
		}
	}
}