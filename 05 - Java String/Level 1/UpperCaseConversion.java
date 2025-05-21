import java.util.*;
public class UpperCaseConversion{
	public static String convertToUpperCase(String str){
		StringBuilder upperCaseStr=new StringBuilder();
		for(int i=0;i<str.length();i++){
			char ch=str.charAt(i);
			if(ch>='a'&&ch<='z'){
				ch=(char)(ch-32);
			}
			upperCaseStr.append(ch);
		}
		return upperCaseStr.toString();
	}
	public static boolean compareStrings(String str1, String str2) {
        if (str1.length() != str2.length()) {
            return false;
        }
        for (int i = 0; i < str1.length(); i++) {
            if (str1.charAt(i) != str2.charAt(i)) {
                return false;
            }
        }
        return true;
    }
	public static void main(String[] args){
		String text;
		Scanner scanner = new Scanner(System.in);
		text=scanner.nextLine();
		String manualUpperCase=convertToUpperCase(text);
		String builtInUpperCase=text.toUpperCase();
		boolean areEqual=compareStrings(manualUpperCase,builtInUpperCase);
		System.out.println("\nConvert: "+manualUpperCase);
		System.out.println("Converted toUpperCase(): "+builtInUpperCase);
		System.out.println("Are both conversions equal? " + areEqual);
	}
}