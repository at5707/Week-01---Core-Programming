import java.util.*;
public class WindChillTemperature{
	public static double windchill(double temperature,double wind){
		return 35.74+0.6215*temperature+(0.4275*temperature-35.75)*Math.pow(wind,0.16);
	}
	public static void main(String[] args){
		double temperature,wind;
		Scanner scanner=new Scanner(System.in);
		temperature=scanner.nextDouble();
		wind=scanner.nextDouble();
		if(temperature>50||wind<3){
			System.out.println("Invalid");
		}else{
			double windch=windchill(temperature,wind);
			System.out.println("Wind chill temperature is: "+windch+" F");
		}
	}
}