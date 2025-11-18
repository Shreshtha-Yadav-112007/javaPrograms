import java.util.Scanner;
public class Main19
{
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Please enter the number of rows: ");
		int rows = sc.nextInt();
		System.out.print("Please enter the number of columns in matrix: ");
		int columns = sc.nextInt(); 
		int [][] matrix = new int[rows][columns];
		for (int i=0;i<matrix.length;i++){
		    for (int j=0;j<matrix[i].length;j++){
		        System.out.print("Please enter the "+(i)+" "+(j)+" element: ");
		        matrix[i][j] = sc.nextInt();
		    }
		}
		for(int g=0;g<matrix.length;g++){
		    for(int h=0;h<matrix[g].length;h++){
		        System.out.print(matrix[g][h]+" ");
		    }
		    System.out.println();
		}
		int totalSum = 0;
		for (int y=0;y<matrix.length;y++){
		    for(int z=0;z<matrix[y].length;z++){
		        totalSum+=matrix[y][z];
		    }
		}
		System.out.println("Total sum of all the elements is: "+totalSum);
		for (int a=0;a<matrix.length;a++){
		    int rowSum = 0;
		    for(int b=0;b<matrix[a].length;b++){
		        rowSum+=matrix[a][b];
		    }
		    System.out.println("The sum of "+(a+1)+" row: "+rowSum);
		}
		for (int c=0;c<matrix[0].length;c++){
		    int columnSum = 0;
		    for(int d=0;d<matrix.length;d++){
		        columnSum+=matrix[d][c];
		    }
		    System.out.println("The sum of "+(c+1)+" column "+columnSum);
		}
		for(int j=0;j<columns;j++){
		    for(int i=0;i<rows;i++){
		        System.out.print(matrix[i][j]);
		    }
		    System.out.println();
		}
		sc.close();
	}
}