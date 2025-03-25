public class fee{
	public static void main(String[] args){
		int fee=125000,discountPercent=10;
		int discount=fee/discountPercent;
		System.out.println("The discount amount is INR "+discount+" and final discounted fee is INR "+(fee-discount));
	}
}