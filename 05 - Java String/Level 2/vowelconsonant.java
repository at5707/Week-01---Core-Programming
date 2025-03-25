import java.util.*;
public class vowelconsonant{
	public static String check(char ch){
		if(ch>='A'&&ch<='Z'){
			ch=(char)(ch+32);
		}
		if(ch=='a'||ch=='e'||ch=='i'||ch=='o'||ch=='u'){
			return "Vowel";
		}
		else if(ch>='a'&&ch<='z'){
			return "Consonant";
		}
		else{
			return "Not a Letter";
		}
	}
	public static int[] countvowelconsonant(String str){
		int vowels=0,consonants=0;
		int length=findLength(str);
		for(int i=0;i<length;i++){
			char ch=str.charAt(i);
			String type=check(ch);
			if(type.equals("Vowel")){
				vowels++;
			}else if(type.equals("Consonant")){
				consonants++;
			}
		}
		return new int[]{vowels,consonants};
	}
	public static int findLength(String str) {
        int count = 0;
        try {
            while (true) {
                str.charAt(count);
                count++;
            }
        } catch (IndexOutOfBoundsException e) {
            return count;
        }
    }
	public static void main(String[] args){
		String text;
		Scanner scanner = new Scanner(System.in);
		text=scanner.nextLine();
		int[] counts=countvowelconsonant(text);
		System.out.println("\nTotal vowels: "+counts[0]);
		System.out.println("\nTotal consonants: "+counts[1]);
	}
}