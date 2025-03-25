import java.util.*;
public class calendar{
	public static final String[] months={
		"January", "February", "March", "April", "May", "June",
        "July", "August", "September", "October", "November", "December"
	};
	public static final int[] daysInMonth={
		31, 28, 31, 30, 31, 30,
        31, 31, 30, 31, 30, 31
	};
	public static boolean isLeapYear(int year){
		return(year%4==0&&year%100!=0)||(year%400==0);
	}
	public static int getday(int month,int year){
		if(month==2&&isLeapYear(year)){
			return 29;
		}
		return daysInMonth[month-1];
	}
	public static int getFirstDay(int month,int year){
		int d=1;
		int y0=year-(14-month)/12;
		int x=y0+y0/4-y0/100+y0/400;
		int m0=month+12*((14-month)/12)-2;
		return(d+x+(31*m0)/12)%7;
	}
	public static void printCalendar(int month,int year){
		System.out.printf("\n%13s %d\n",months[month-1],year);
		System.out.println("Sun Mon Tue Wed Thu Fri Sat");
		int firstDay=getFirstDay(month,year);
		int days=getday(month,year);
		for(int i=0;i<firstDay;i++){
			System.out.print("   ");
		}
		for(int day=1;day<=days;day++){
			System.out.printf("%3d ",day);
			if((firstDay+day)%7==0){
				System.out.println();
			}
		}
		System.out.println("\n");
	}
	public static void main(String[] args){
		int month,year;
		Scanner scanner = new Scanner(System.in);
		month = scanner.nextInt();
		year = scanner.nextInt();
		if(month<1||month>12||year<1){
			System.out.println("Invalid input!");
		}else{
			printCalendar(month,year);
		}
	}
}