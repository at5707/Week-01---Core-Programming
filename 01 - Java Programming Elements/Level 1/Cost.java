import java.util.Scanner;
public class Discount{
	public static void main(String[] args){
		int fee,discountPercent;
		Scanner input=new Scanner(System.in);
		fee=input.nextInt();
		discountPercent=input.nextInt(); 
		double discount=fee/discountPercent;
		System.out.println("The discount amount is INR "+discount+" and final discounted fee is INR "+(fee-discount));
	}
}