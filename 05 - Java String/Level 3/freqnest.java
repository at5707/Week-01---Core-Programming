import java.util.*;
public class freqnest{
	public static String[] findcharfreq(String text){
		char[] chars=text.toCharArray();
		int[] freq=new int[chars.length];
		Arrays.fill(freq,-1);
		for(int i=0;i<chars.length;i++){
			if(freq[i]==-1){
				freq[i]=1;
				for(int j=i+1;j<chars.length;j++){
					if(chars[i]==chars[j]){
						freq[i]++;
						freq[j]=0;
					}
				}
			}
		}
		int uniquecount=0;
		for(int f:freq){
			if(f>0) uniquecount++;
		}
		String[] charfreqarr=new String[uniquecount];
		int index=0;
		for(int i=0;i<chars.length;i++){
			if(freq[i]>0){
				charfreqarr[index++]=chars[i]+" - "+freq[i];
			}
		}
		return charfreqarr;
	}
	public static void display(String[] charfreqarr){
		System.out.println("\nChar freq:");
		System.out.println("-------------------------");
		System.out.println("| Character | Frequency |");
		System.out.println("-------------------------");
		for(String entry:charfreqarr){
			String[] parts=entry.split(" - ");
			System.out.printf("|     %s     |     %s     |\n", parts[0], parts[1]);
		}
		System.out.println("-------------------------");
	}
	public static void main(String[] args){
		String input;
		Scanner scanner = new Scanner(System.in);
		input=scanner.nextLine();
		String[] charfreqarr=findcharfreq(input);
		display(charfreqarr);
	}
}