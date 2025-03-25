import java.util.Random;
public class rand{
	public static void main(String[] args){
		int size=5;
		int[] numbers=generate(size);
		System.out.print("Generated numbers: ");
        for (int num : numbers) {
            System.out.print(num + " ");
        }
        System.out.println();
		double[] results=average(numbers);
		System.out.println("Average: " + results[0]);
        System.out.println("Minimum: " + results[1]);
        System.out.println("Maximum: " + results[2]);
    }
	public static int[] generate(int size){
		Random random = new Random();
        int[] numbers = new int[size];
        for (int i = 0; i < size; i++) {
            numbers[i] = 1000 + random.nextInt(9000); // Generates 4-digit number
        }
        return numbers;
    }
	public static double[] average(int[] numbers){
		int min = numbers[0];
        int max = numbers[0];
        int sum = 0;
        
        for (int num : numbers) {
            sum += num;
            min = Math.min(min, num);
            max = Math.max(max, num);
        }
        
        double average = (double) sum / numbers.length;
        return new double[]{average, min, max};
    }
}