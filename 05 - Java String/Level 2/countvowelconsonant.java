import java.util.*;
public class countvowelconsonant{
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
	public static String[][] analyze(String str){
		int length=findlength(str);
		String[][] result=new String[length][2];
		for(int i=0;i<length;i++){
			char ch=str.charAt(i);
			result[i][0]=String.valueOf(ch);
			result[i][1]=check(ch);
		}
		return result;
	}
	public static int findlength(String str){
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
	public static void displayTable(String[][] data) {
        System.out.println("\nCharacter\tType");
        System.out.println("----------------------");
        for (String[] row : data) {
            System.out.println(row[0] + "\t\t" + row[1]);
        }
    }
	public static void main(String[] args){
		String text;
		Scanner scanner = new Scanner(System.in);
		text=scanner.nextLine();
		String[][] result=analyze(text);
		displayTable(result);
	}
}