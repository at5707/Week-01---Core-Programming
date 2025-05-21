import java.util.Scanner;
import java.util.Arrays;
public class SplitTextCheck{
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
	public static boolean compare(String[] arr1,String[] arr2){
		if(arr1.length!=arr2.length){
			return false;
		}
		for(int i=0;i<arr1.length;i++){
			if(!arr1[i].equals(arr2[i])){
				return false;
			}
		}
		return true;
	}
	public static void main(String[] args){
		String text;
		Scanner scanner=new Scanner(System.in);
		text=scanner.next();
		String[] customWords=customSplit(text);
		String[] builtInWords=text.split(" ");
		boolean areEqual=compare(customWords,builtInWords);
		System.out.println("\nWords using custom split: "+Arrays.toString(customWords));
		System.out.println("Words using built-in split(): "+Arrays.toString(builtInWords));
		System.out.println("Both equal? "+areEqual);
	}
}