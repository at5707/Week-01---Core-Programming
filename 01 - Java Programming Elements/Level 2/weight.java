import java.util.Scanner;
public class weight {
    public static void main(String[] args) {
		float pound;
		Scanner input = new Scanner(System.in);
		pound=input.nextFloat();
		float kg=pound*0.453f;
		System.out.println("The weight of the person in pound is "+pound+" and in kg is "+kg);
	}
}
		
		