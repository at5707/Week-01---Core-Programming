import java.util.*;
public class SpringSeason{
	public static void main(String[] args){
		int month,day;
		Scanner input = new Scanner(System.in);
		month=input.nextInt();
		day=input.nextInt();
		boolean isSpring=(month==3 && day>=20 && day<=31)||(month==4 && day>=1 && day<=30)||(month==5 && day>=1 && day<=31)||(month==6 && day>=1 && day<=20);
		if(isSpring){
			System.out.println("It's a spring season");
		}else{
			System.out.println("Not a spring season");
		}
	}
}