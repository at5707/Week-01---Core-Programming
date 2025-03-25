import java.util.Random;
public class football{
	public static void main(String[] args){
		int size=11;
		int[] heights=generate(size);
		System.out.println("Heights: ");
		for(int height:heights){
			System.out.println(height+" ");
		}
		System.out.println();
		int sum = calculateSum(heights);
        double mean = calculateMean(sum, heights.length);
        int shortest = findShortest(heights);
        int tallest = findTallest(heights);
		System.out.println("Mean height: " + mean + " cm");
        System.out.println("Shortest height: " + shortest + " cm");
        System.out.println("Tallest height: " + tallest + " cm");
    }
	public static int[] generate(int size){
		Random random=new Random();
		int[] heights=new int[size];
		for(int i=0;i<size;i++){
			heights[i]=150+random.nextInt(101);
		}
		return heights;
	}
	public static int calculateSum(int[] heights) {
        int sum = 0;
        for (int height : heights) {
            sum += height;
        }
        return sum;
    }
    
    public static double calculateMean(int sum, int count) {
        return (double) sum / count;
    }
    
    public static int findShortest(int[] heights) {
        int min = heights[0];
        for (int height : heights) {
            min = Math.min(min, height);
        }
        return min;
    }
    
    public static int findTallest(int[] heights) {
        int max = heights[0];
        for (int height : heights) {
            max = Math.max(max, height);
        }
        return max;
    }
}