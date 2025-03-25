import java.util.*;
public class anagram{
	public static boolean areAnagrams(String text1,String text2){
		text1=text1.replaceAll("\\s+","").toLowerCase();
		text2=text2.replaceAll("\\s+","").toLowerCase();
		if(text1.length()!=text2.length()){
			return false;
		}
		int[] freq1=new int[256];
		int[] freq2=new int[256];
		for(int i=0;i<text1.length();i++){
			freq1[text1.charAt(i)]++;
			freq2[text2.charAt(i)]++;
		}
		return Arrays.equals(freq1,freq2);
	}
	public static void main(String[] args){
		String text1,text2;
		Scanner scanner=new Scanner(System.in);
		text1 = scanner.nextLine();
		text2 = scanner.nextLine();
		boolean result=areAnagrams(text1,text2);
		System.out.println("\nAnagram result:");
		System.out.println("-------------------------");
		System.out.println("Are \""+text1+"\"and\""+text2+"\"anagrams?");
		System.out.println(result?"Yes, they are anagrams!":"No, thet are not anagrams.");
		System.out.println("-------------------------");
	}
}