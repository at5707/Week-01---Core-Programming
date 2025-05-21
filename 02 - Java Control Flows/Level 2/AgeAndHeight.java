import java.util.*;
public class AgeAndHeight{
	public static void main(String[] args){
		int ageAmar,ageAkbar,ageAnthony;
		int	heightAmar,heightAkbar,heightAnthony;
		Scanner input = new Scanner(System.in);
		ageAmar=input.nextInt();
		ageAkbar=input.nextInt();
		ageAnthony=input.nextInt();
		heightAmar=input.nextInt();
		heightAkbar=input.nextInt();
		heightAnthony=input.nextInt();
		int minAge=Math.min(ageAmar,Math.min(ageAkbar,ageAnthony));
		String youngestFriend=(minAge==ageAmar)?"Amar":(minAge==ageAkbar)?"Akbar":"Anthony";
		int maxHeight=Math.max(heightAmar,Math.max(heightAkbar,heightAnthony));
		String tallestFriend=(maxHeight==heightAmar)?"Amar":(maxHeight==heightAkbar)?"Akbar":"Anthony";
		System.out.println("\nYoungest friend: "+youngestFriend+" with age "+minAge);
		System.out.println("Tallest friend: "+tallestFriend+" with height "+maxHeight+" cm");
	}
}