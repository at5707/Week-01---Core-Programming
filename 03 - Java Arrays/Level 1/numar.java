import java.util.*;
public class numar{
	public static void main(String[] args){
		int[] numbers=new int[5];
		Scanner input=new Scanner(System.in);
		for(int i=0;i<numbers.length;i++){
			System.out.println("Enter number"+(i+1)+": ");
			numbers[i]=input.nextInt();
		}
		for(int i=0;i<numbers.length;i++){
			if(numbers[i]>0){
				if(numbers[i]%2==0){
					System.out.println("Number "+numbers[i]+" is Positive and even");
				}else{
					System.out.println("Number "+numbers[i]+" is Positive and odd");
				}
			}else if(numbers[i]<0){
				System.out.println("Number "+numbers[i]+" is Negative");
			}else{
				System.out.println("Number "+numbers[i]+" is Zero");
			}
		}
		int first=numbers[0];
		int last=numbers[numbers.length-1];
		if(first>last){
			System.out.println("First number "+first+" is greater than last number "+last);
		}else if(first<last){
			System.out.println("First number "+first+" is less than last number "+last);
		}else{
			System.out.println("First number "+first+" is equal to last number "+last);
		}
	}
}