import java.util.*;
public class SpringSeason{
	public static boolean checkseason(int month,int day){
		if((month==3&&day>=20)||(month==4)||(month==5)||(month==6&&day<=20)){
			return true;
		}
		return false;
	}
	public static void main(String[] args){
		int month,day;
		Scanner scanner=new Scanner(System.in);
		month=scanner.nextInt();
		day=scanner.nextInt();
		if(checkseason(month,day)){
			System.out.println("Spring");
		}
		else{
			System.out.println("Not Spring");
	}
}
}