import java.util.*;
public class Leap{
	public static void main(String[] args){
		int year;
		Scanner input = new Scanner(System.in);
		year=input.nextInt();
		if(year<1582){
			System.out.println("Not a leap year");
		}else{
			if(year%4==0){
				if(year%100==0){
					if(year%400==0){
						System.out.println(year+" is a leap year");
					}else{
						System.out.println(year+" is not a leap year");
					}
				}else{
					System.out.println(year+" is a leap year");
				}
			}else{
				System.out.println(year+" is not a leap year");
			}
			if((year%4==0&&year%100!=0)||(year%400==0)){
				System.out.println(year+" is a leap year");
			}else{
				System.out.println(year+" is not a leap year");
			}
		}
	}
}