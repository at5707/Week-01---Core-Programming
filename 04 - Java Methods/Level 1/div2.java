import java.util.*;
public class div2{
	public static int[] findRemainderAndQuotient(int numberOfChocolates,int numberOfChildren){
		int chocolatesPerChild=numberOfChocolates/numberOfChildren;
		int remainingChocolates=numberOfChocolates%numberOfChildren;
		return new int[]{chocolatesPerChild,remainingChocolates};
	}
	public static void main(String[] args){
		int numberOfChocolates,numberOfChildren;
		Scanner scanner = new Scanner(System.in);
		numberOfChocolates=scanner.nextInt();
		numberOfChildren=scanner.nextInt();
		if(numberOfChildren==0){
			System.out.println("Division by zero is not allowed");
		} else {
			int[] result = findRemainderAndQuotient(numberOfChocolates, numberOfChildren);
			System.out.println("Each child gets: " + result[0]+" chocolates");
			System.out.println("Remaining chocolates: " + result[1]);
		}
	}
}