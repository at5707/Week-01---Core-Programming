import java.util.*;
public class op{
	public static void main(String[] args){
		double n1,n2;
		String op;
		double result;
		Scanner input = new Scanner(System.in);
		n1=input.nextDouble();
		System.out.println("Enter operator (+,-,*,/): ");
		op=input.next();
		n2=input.nextDouble();
		switch(op){
			case "+":
				result=n1+n2;
				System.out.println("Result: "+n1+" + "+n2+" = "+result);
				break;
			case "-":
				result=n1-n2;
				System.out.println("Result: "+n1+" - "+n2+" = "+result);
				break;
			case "*":
				result=n1*n2;
				System.out.println("Result: "+n1+" * "+n2+" = "+result);
				break;
			case "/":
				if(n2!=0){
					result=n1/n2;
					System.out.println("Result: "+n1+" +/ "+n2+" = "+result);
				}else{
					System.out.println("Division by zero is not allowed");
				}
				break;
			default:
				System.out.println("Invalid operator");
		}
	}
}		