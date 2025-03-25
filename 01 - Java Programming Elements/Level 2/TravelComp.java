import java.util.Scanner;

public class TravelComp {
    public static void main(String[] args) {
		String fromCity,toCity,viaCity;
		double distanceFromToVia,distanceViaToFinalCity;
		int timeFromToVia,timeViaToFinalCity;
        Scanner input = new Scanner(System.in);

        fromCity = input.nextLine();
        viaCity = input.nextLine();
        toCity = input.nextLine();
        distanceFromToVia = input.nextDouble();
        timeFromToVia = input.nextInt();
        distanceViaToFinalCity = input.nextDouble();
        timeViaToFinalCity = input.nextInt();
        double totalDistance = distanceFromToVia + distanceViaToFinalCity;
        int totalTime = timeFromToVia + timeViaToFinalCity;
        System.out.println("\nThe total distance traveled from "  + fromCity + " to " + toCity + " via " + viaCity +  " is " + totalDistance + " km and " + "the total time taken is " + totalTime + " minutes.");
    }
}
