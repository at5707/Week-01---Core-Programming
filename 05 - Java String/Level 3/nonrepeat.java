import java.util.*;
public class nonrepeat{
	public static char findnonrepeat(String text){
		int[] frequency=new int[256];
		for(int i=0;i<text.length();i++){
			char ch=text.charAt(i);
			frequency[ch]++;
		}
		for(int i=0;i<text.length();i++){
			char ch=text.charAt(i);
			if(frequency[ch]==1){
				return ch;
			}
		}
		return '\0';
	}
	public static void main(String[] args){
		String input;
		Scanner scanner=new Scanner(System.in);
		input=scanner.nextLine();
		char result=findnonrepeat(input);
		if(result!='\0'){
			System.out.println("First non-repeating character: "+result);
		}else{
			System.out.println("No unique character");
		}
	}
}
	