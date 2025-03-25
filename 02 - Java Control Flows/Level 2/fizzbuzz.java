import java.util.*;
public class fizzbuzz{
	public static void main(String[] args){
		int n;
		Scanner input = new Scanner(System.in);
		n=input.nextInt();
		if(n<=0){
			System.out.println("The number "+n+" is not positive");
		}else{
			for(int i=1;i<=n;i++){
				if(i%3==0 && i%5==0){
					System.out.println("FizzBuzz");
				}else if(i%3==0){
					System.out.println("Fizz");
				}else if(i%5==0){
					System.out.println("Buzz");
				}else{
					System.out.println(i);
				}
			}
		}
	}
}