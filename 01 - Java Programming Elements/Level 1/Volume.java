public class Volume{
	public static void main(String[] args){
		double r=6378.0;
		double Volume=(4.0/3.0)*3.14*(r*r*r);
		System.out.println("The volume of earth in cubic kilometers is "+Volume+" and cubic miles is "+(Volume/4.096));
	}
}