import java.util.*;
public class wordlength{
	public static int findLength(String str){
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
	public static String[] customSplit(String str){
		int len=findLength(str);
		int wordCount=1;
		for(int i=0;i<len;i++){
			if(str.charAt(i)==' '){
				wordCount++;
			}
		}
		int[] spaceIndexes=new int[wordCount-1];
		int spaceIndex=0;
		for(int i=0;i<len;i++){
			if(str.charAt(i)==' '){
				spaceIndexes[spaceIndex++]=i;
			}
		}
		String[] words=new String[wordCount];
		int start=0;
		for(int i=0;i<wordCount-1;i++){
			words[i]=str.substring(start,spaceIndexes[i]);
			start=spaceIndexes[i]+1;
		}
		words[wordCount-1]=str.substring(start,len);
		return words;
	}
	public static String[][] wordsWithLengths(String[] words){
		int numWords=words.length;
		String[][] result=new String[numWords][2];
		for(int i=0;i<numWords;i++){
			result[i][0]=words[i];
			result[i][1]=String.valueOf(findLength(words[i]));
		}
		return result;
	}
	public static void main(String[] args){
			String text;
			Scanner scanner = new Scanner(System.in);
			text=scanner.nextLine();
			String[] words=customSplit(text);
			String[][] wordsWithLengths=wordsWithLengths(words);
			System.out.println("\nWord\t\tLength");
			System.out.println("----------------------");
			for(String[] wordData:wordsWithLengths){
				System.out.println(wordData[0]+"\t\t"+Integer.parseInt(wordData[1]));
			}
	}
}