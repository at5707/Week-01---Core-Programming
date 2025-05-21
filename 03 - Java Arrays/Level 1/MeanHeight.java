import java.util.*;
public class MeanHeight{
	public static void main(String[] args){
		double[] height=new double[11];
		double sum=0.0;
		Scanner input=new Scanner(System.in);
		System.out.println("Enter height of 11 football players (in cm):");
		for(int i=0;i<11;i++){
			System.out.println("Player "+(i+1)+" height: ");
			height[i]=input.nextDouble();
			sum+=height[i];
		}
		double meanheight=sum/11;
		System.out.printf("\nMean height:%.2f cm\n",meanheight);
	}
}		