import java.util.Scanner;
public class Factor {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter a natural number: ");
        int n = input.nextInt();
        if (n <= 0) {
            System.out.println("Enter a natural number (greater than 0).");
            return;
        }
		int max=10;
		int[] factors=new int[max];
		int index=0;
		for(int i=1;i<=n;i++){
			if(n%i==0){
				if(index==max){
					max*=2;
					int[] temp=new int[max];
					System.arraycopy(factors,0,temp,0,factors.length);
					factors=temp;
				}
				factors[index++]=i;
			}
		}
		System.out.println("Factors of "+n+": ");
		for(int i=0;i<index;i++){
			System.out.println(factors[i]+" ");
		}
	}
}