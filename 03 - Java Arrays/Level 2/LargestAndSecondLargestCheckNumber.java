import java.util.Scanner;
public class LargestAndSecondLargestCheckNumber {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int n = input.nextInt();
		int maxDigit=10;
		int[] digits=new int[maxDigit];
		int index=0;
		while(n!=0){
			if(index==maxDigit){
				maxDigit+=10;
				int[] temp=new int[maxDigit];
				System.arraycopy(digits,0,temp,0,digits.length);
				digits=temp;
		}
		digits[index++]=n%10;
		n/=10;
	}
	if(index==0){
		digits[index++]=0;
	}
	int largest=-1,secondLargest=-1;
	for(int i=0;i<index;i++){
		if(digits[i]>largest){
			secondLargest=largest;
			largest=digits[i];
		}else if(digits[i]>secondLargest && digits[i]!=largest){
			secondLargest=digits[i];
		}
	}
	System.out.println("Digits stored: ");
	for(int i=0;i<index;i++){
		System.out.print(digits[i]+" ");
	}
	System.out.println("\nLargest digit: "+largest);
	System.out.println("Second Largest digit: "+(secondLargest!=-1?secondLargest:"Not available"));
}
}