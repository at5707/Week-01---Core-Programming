import java.util.*;
public class height {
    public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		String[] names={"Amar","Akbar","Anthony"};
		int[] ages=new int[3];
		double[] heights=new double[3];
		for(int i=0;i<3;i++){
			System.out.println("Enter the age of "+names[i]+": ");
			ages[i]=input.nextInt();
			System.out.println("Enter the height of "+names[i]+": ");
			heights[i]=input.nextDouble();
		}
		int minAgeIndex=0;
		for(int i=1;i<3;i++){
			if(ages[i]<ages[minAgeIndex]){
				minAgeIndex=i;
			}
		}
		int maxHeightIndex=0;
		for(int i=1;i<3;i++){
			if(heights[i]>heights[maxHeightIndex]){
				maxHeightIndex=i;
			}
		}
		System.out.println("\nYoungest: "+names[minAgeIndex]+" (Age: "+ages[minAgeIndex]+")");
		System.out.println("Tallest: "+names[maxHeightIndex]+" (Height: "+heights[maxHeightIndex]+")");
	}
}