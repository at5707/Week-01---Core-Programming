import java.util.*;
public class Leapyear{
	public static void main(String[] args){
		int year;
		Scanner input = new Scanner(System.in);
		year=input.nextInt();
		if(year>=1582&&((year%4==0&&year%100!=0)||(year%400==0))){
			System.out.println(year+" is a leap year");
		}else{
			System.out.println(year+" is not a leap year");
		}
	}
}