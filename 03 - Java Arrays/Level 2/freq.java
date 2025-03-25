import java.util.*;
public class freq {
    public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		long n=input.nextLong();
		n=Math.abs(n);
		int[] frequency=new int[10];
		long temp=n;
		while(temp>0){
			int digit=(int)(temp%10);
			frequency[digit]++;
			temp/=10;
		}
		System.out.println("\nDigit frequency:");
		for(int i=0;i<10;i++){
			if(frequency[i]>0){
				System.out.println("Digit "+i+": "+frequency[i]+" times");
			}
		}
	}
}