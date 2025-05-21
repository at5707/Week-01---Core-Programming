import java.util.*;
public class OTP{
	public static void main(String[] args){
	int[] otpArray=new int[10];
	for(int i=0;i<10;i++){
		otpArray[i]=generate();
	}
	System.out.println("Generated: "+Arrays.toString(otpArray));
	if(otpunique(otpArray)){
		System.out.println("Unique OTP.");
	}else{
		System.out.println("Duplicated OTP.");
	}
}
public static int generate(){
	return 100000+(int)(Math.random()*900000);
}
public static boolean otpunique(int[] otpArray){
	Set<Integer> uniqueotp=new HashSet<>();
	for(int otp:otpArray){
		if(!uniqueotp.add(otp)){
			return false;
			}
		}
	return true;
	}
}