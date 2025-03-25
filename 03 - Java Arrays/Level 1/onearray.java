import java.util.Scanner;
public class onearray {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter number of rows and cols: ");
        int row = input.nextInt();
		int col = input.nextInt();
		int[][] matrix=new int[row][col];
		System.out.println("Enter elements:");
		for(int i=0;i<row;i++){
			for(int j=0;j<col;j++){
				System.out.print("Element at ["+i+"]["+j+"]: ");
				matrix[i][j]=input.nextInt();
			}
		}
		int[] onearr=new int[row*col];
		int index=0;
		for(int i=0;i<row;i++){
			for(int j=0;j<col;j++){
				onearr[index++]=matrix[i][j];
			}
		}
		System.out.print("\n1D Array: ");
		for(int num:onearr){
			System.out.print(num+" ");
		}
	}
}