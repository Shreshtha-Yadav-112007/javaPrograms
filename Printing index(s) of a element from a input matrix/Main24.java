import java.util.Scanner;
public class Main24
{
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Please enter the number of rows: ");
		int rows = sc.nextInt();
		System.out.print("Please enter the number of columns: ");
		int columns = sc.nextInt();
		int [][] matrix = new int[rows][columns];
		for (int i=0;i<matrix.length;i++){
		    for (int j=0;j<matrix[i].length;j++){
		        System.out.print("Please enter the "+(i+1)+" and "+(j+1)+" element: ");
		        matrix[i][j] = sc.nextInt();
		    }
		}
		for (int a=0;a<matrix.length;a++){
		    for (int b=0;b<matrix[a].length;b++){
		        if (matrix[a][b] == 5){
		            System.out.println(a+" "+b);
		        }
		    }
		}
		sc.close();
	}
}