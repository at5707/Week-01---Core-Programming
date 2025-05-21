import java.util.*;
public class SumArray{
	public static void main(String[] args){
		double[] numbers=new double[10];
		double total=0.0;
		int index=0;
		Scanner input=new Scanner(System.in);
		while(true){
			System.out.println("Enter number(0 or negative to stop): ");
			double n=input.nextDouble();
			if(n<=0){
				break;
			}
			if(index<10){
				numbers[index]=n;
				index++;
			}else{
				System.out.println("Array full!");
				break;
			}
		}
		System.out.println("Numbers:");
		for(int i=0;i<index;i++){
			System.out.println(numbers[i]+" ");
			total+=numbers[i];
		}
		System.out.println("\nTotal: "+total);
	}
}