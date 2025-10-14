import java.util.Scanner;
public class Main
{
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Please enter the number of rows: ");
		int rows = sc.nextInt(); 
		System.out.print("Please enter the number of columns: ");
		int columns = sc.nextInt();
		int [][] matrix1 = new int[rows][columns];
		for(int i=0;i<matrix1.length;i++){
		    for(int j=0;j<matrix1[i].length;j++){
		        System.out.print("Please enter the "+(i+1)+" "+(j+1)+" element for first matrix: ");
		        matrix1[i][j] = sc.nextInt();
		    }
		}
		int [][] matrix2 = new int[rows][columns];
		for(int i=0;i<matrix2.length;i++){
		    for(int j=0;j<matrix2[i].length;j++){
		        System.out.print("Please enter the "+(i+1)+" "+(j+1)+" element for second matrix: ");
		        matrix2[i][j] = sc.nextInt();
		    }
		}
		int[][]matrixSum = new int[rows][columns];
		for(int i=0;i<matrixSum.length;i++){
		    for(int j=0;j<matrixSum[i].length;j++){
		        matrixSum[i][j] = matrix1[i][j]+matrix2[i][j];
		    }
		}
		System.out.println("The sum of both matrices:");
		for(int i=0;i<matrixSum.length;i++){
		    for(int j=0;j<matrixSum[i].length;j++){
		        System.out.print(matrixSum[i][j]+" ");
		    }
		    System.out.println();
		}
		int[][]matrixDifference = new int[rows][columns];
		for(int i=0;i<matrixDifference.length;i++){
		    for(int j=0;j<matrixDifference[i].length;j++){
		        matrixDifference[i][j] = matrix1[i][j]-matrix2[i][j];
		    }
		}
		System.out.println("The difference of both matrices:");
		for(int i=0;i<matrixDifference.length;i++){
		    for(int j=0;j<matrixDifference[i].length;j++){
		        System.out.print(matrixDifference[i][j]+" ");
		    }
		    System.out.println();
		}
		sc.close();
	}
}