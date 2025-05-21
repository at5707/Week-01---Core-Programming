import java.util.Scanner;
public class AreaOfTriangle{
	public static void main(String[] args){
		float base,height;
		Scanner input=new Scanner(System.in);
		base=input.nextFloat();
		height=input.nextFloat();
		float area=0.5f*base*height;
		System.out.println("The area of triangle of base "+base+" and height "+height+" is "+area);
	}
}
