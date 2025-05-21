import java.util.*;
public class FindCharacterFrequency{
	public static int[][] findcharfreq(String text){
		int[] freq=new int[256];
		for(int i=0;i<text.length();i++){
			char ch=text.charAt(i);
			freq[ch]++;
		}
		int unique=0;
		for(int i=0;i<256;i++){
			if(freq[i]>0){
				unique++;
			}
		}
		int[][] charfreqarr=new int[unique][2];
		int index=0;
		for(int i=0;i<256;i++){
			if(freq[i]>0){
				charfreqarr[index][0]=i;
				charfreqarr[index][1]=freq[i];
				index++;
			}
		}
		return charfreqarr;
	}
	public static void display(int[][] charfreqarr){
		System.out.println("\nChar freq:");
		System.out.println("-------------------------");
        System.out.println("| Character | Frequency |");
        System.out.println("-------------------------");
		for(int[] entry:charfreqarr){
			System.out.printf("|     %c     |     %d     |\n", entry[0], entry[1]);
		}
		System.out.println("-------------------------");
	}
	public static void main(String[] args){
		String input;
		Scanner scanner = new Scanner(System.in);
		input=scanner.nextLine();
		int[][] charfreqarr=findcharfreq(input);
		display(charfreqarr);
	}
}