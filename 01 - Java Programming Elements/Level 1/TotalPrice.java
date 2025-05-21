import java.util.Scanner;
public class TotalPrice{
	public static void main(String[] args){
		int unitPrice,quantity;
		Scanner input=new Scanner(System.in);
		unitPrice=input.nextInt();
		quantity=input.nextInt();
		int total=unitPrice*quantity;
		System.out.println("The total purchase price is INR "+total+" if the quantity "+quantity+" and unit price is INR "+unitPrice);
	}
}
