import java.util.*;
public class day{
	public static void main(String[] args){
		int m,d,y;
		Scanner input = new Scanner(System.in);
		System.out.println("Enter month (1-12): ");
		m=input.nextInt();
		System.out.println("Enter day (1-31): ");
		d=input.nextInt();
		System.out.println("Enter year: ");
		y=input.nextInt();
		int y0=y-(14-m)/12;
		int x=y0+y0/4-y0/100+y0/400;
		int m0=m+12*((14-m)/12)-2;
		int d0=(d+x+(31*m0)/12)%7;
		System.out.println("The day of the week is: "+d0+" (0=Sunday,1=Monday,...,6=Saturday)");
	}
}