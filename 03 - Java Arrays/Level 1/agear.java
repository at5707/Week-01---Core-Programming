import java.util.*;
public class agear{
	public static void main(String[] args){
		int[] ages=new int[10];
		Scanner input=new Scanner(System.in);
		for(int i=0;i<ages.length;i++){
			System.out.println("Enter age of student"+(i+1)+": ");
			ages[i]=input.nextInt();
		}
		for(int i=0;i<ages.length;i++){
			if(ages[i]<0){
				System.out.println("Invalid age entered.");
			}else if(ages[i]>=18){
				System.out.println("Student with age "+ages[i]+" can vote");
			}else{
				System.out.println("Student with age "+ages[i]+" cannot vote");
			}
		}
	}
}