import java.util.*;
public class uniquecharfreq{
	public static char[] uniquechar(String text){
		StringBuilder unique=new StringBuilder();
		for(int i=0;i<text.length();i++){
			char ch=text.charAt(i);
			boolean isUnique=true;
			for(int j=0;j<unique.length();j++){
				if(unique.charAt(j)==ch){
					isUnique=false;
					break;
				}
			}
			if(isUnique){
				unique.append(ch);
			}
		}
		return unique.toString().toCharArray();
	}
	public static String[][] findcharfreq(String text){
		char[] uniquechars=uniquechar(text);
		String[][] charfreqarr=new String[uniquechars.length][2];
		for(int i=0;i<uniquechars.length;i++){
			char ch=uniquechars[i];
			int count=0;
			for(int j=0;j<text.length();j++){
				if(text.charAt(j)==ch){
					count++;
				}
			}
			charfreqarr[i][0]=String.valueOf(ch);
			charfreqarr[i][1]=String.valueOf(count);
		}
		return charfreqarr;
	}
	public static void display(String[][] charfreqarr){
		System.out.println("\nChar freq:");
		System.out.println("-------------------------");
		System.out.println("| Character | Frequency |");
		System.out.println("-------------------------");
		for(String[] entry:charfreqarr){
			System.out.printf("|     %s     |     %s     |\n", entry[0], entry[1]);
		}
		System.out.println("-------------------------");
	}
	public static void main(String[] args){
		String input;
		Scanner scanner = new Scanner(System.in);
		input=scanner.nextLine();
		String[][] charfreqarr=findcharfreq(input);
		display(charfreqarr);
	}
}