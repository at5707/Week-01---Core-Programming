import java.util.*;
public class LowerCaseConversion{
	public static String convertToLowerCase(String str){
		StringBuilder lowerCaseStr=new StringBuilder();
		for(int i=0;i<str.length();i++){
			char ch=str.charAt(i);
			if(ch>='A'&&ch<='Z'){
				ch=(char)(ch+32);
			}
			lowerCaseStr.append(ch);
		}
		return lowerCaseStr.toString();
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
		String manualLowerCase=convertToLowerCase(text);
		String builtInLowerCase=text.toLowerCase();
		boolean areEqual=compareStrings(manualLowerCase,builtInLowerCase);
		System.out.println("\nConvert: "+manualLowerCase);
		System.out.println("Converted toLowerCase(): "+builtInLowerCase);
		System.out.println("Are both conversions equal? " + areEqual);
	}
}