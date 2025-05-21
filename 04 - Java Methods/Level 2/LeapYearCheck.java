import java.util.*;
public class LeapYearCheck{
	public static boolean isleapyear(int year){
		if(year<1582){
			System.out.println("Works for years>=1582");
			return false;
		}
		return(year%4==0&&year%100!=0)||(year%400==0);
	}
	public static void main(String[] args){
		int year;
		Scanner scanner = new Scanner(System.in);
		year=scanner.nextInt();
		if(isleapyear(year)){
			System.out.println(year+" is Leap year");
		}else{
			System.out.println(year+" is not Leap year");
		}
	}
}