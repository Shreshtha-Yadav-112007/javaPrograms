import java.util.Scanner;
public class Main
{
	public static void main(String[] args) {
	    Scanner sc = new Scanner(System.in);
		int [][] matrix = new int[3][3];
		for (int i=0;i<matrix.length;i++){
		    for (int j=0;j<matrix[i].length;j++){
		        System.out.println("Enter the "+(i+1)+" and "+(j+1)+" elements: ");
		        matrix[i][j] = sc.nextInt();
		}
		}
	    for (int y=0;y<matrix.length;y++){
		    for (int z=0;z<matrix[y].length;z++){
		        System.out.print(matrix[y][z]+" ");
		    }
		    System.out.println();
		}
		sc.close();
	}
}