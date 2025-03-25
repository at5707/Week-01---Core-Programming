import java.util.Scanner;

public class run {
    public static void main(String[] args) {
		int side1,side2,side3;
		Scanner input = new Scanner(System.in);
		side1=input.nextInt();
		side2=input.nextInt();
		side3=input.nextInt();
		int perimeter=side1+side2+side3;
		int distance=5000;
		int round=distance/perimeter;
		System.out.println("The total number of rounds the athlete will run is "+round+" to complete 5km");
	}
}

	