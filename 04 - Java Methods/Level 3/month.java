import java.util.*;
public class month{
	public static void main(String[] args){
		int month,year;
		Scanner scanner = new Scanner(System.in);
		month=scanner.nextInt();
		year=scanner.nextInt();
		displayCalendar(month,year);
	}
	public static void displayCalendar(int month, int year) {
        String[] months = {
            "January", "February", "March", "April", "May", "June",
            "July", "August", "September", "October", "November", "December"
        };

        int[] daysInMonth = {
            31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31
        };
		if (isLeapYear(year)) {
            daysInMonth[1] = 29;
        }
		System.out.println("\n" + months[month - 1] + " " + year);
        System.out.println("Sun Mon Tue Wed Thu Fri Sat");
		int firstDay = getFirstDayOfMonth(month, year);
		for (int i = 0; i < firstDay; i++) {
            System.out.print("    ");
        }
		for (int day = 1; day <= daysInMonth[month - 1]; day++) {
            System.out.printf("%3d ", day);
            if ((firstDay + day) % 7 == 0) { // New line after Saturday
                System.out.println();
            }
        }
        System.out.println();
    }
	public static boolean isLeapYear(int year) {
        return (year % 4 == 0 && year % 100 != 0) || (year % 400 == 0);
    }
	public static int getFirstDayOfMonth(int month, int year) {
        int d = 1; // First day of the month
        int y0 = year - (14 - month) / 12;
        int x = y0 + y0 / 4 - y0 / 100 + y0 / 400;
        int m0 = month + 12 * ((14 - month) / 12) - 2;
        int d0 = (d + x + (31 * m0) / 12) % 7;
        return d0;
    }
}