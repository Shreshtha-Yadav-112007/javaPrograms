import java.util.Scanner;
public class prac {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Please enter the size of first matrix: ");
        int size1 = sc.nextInt();
        System.out.println("Please enter the size of the second matrix: ");
        int size2 = sc.nextInt();
        int [][] arr1 = new int[size1][size1];
        int [][] arr2 = new int[size2][size2];
        int [][]arrSum = new int[size1][size1];
        System.out.println("Please input matrix 1: ");
        for(int i=0;i<size1;i++){
            for(int j=0;j<size1;j++){
                arr1[i][j] = sc.nextInt();
            }
        }
        System.out.println("Please input matrix 2:");
        for(int i=0;i<size2;i++){
            for(int j=0;j<size2;j++){
                arr2[i][j] = sc.nextInt();
            }
        }
        for(int i=0;i<size1;i++){
            for(int j=0;j<size2;j++){
                arrSum[i][j] = arr1[i][j]+arr2[i][j];
            }
        }
        System.out.println("The sum of both matrices is: ");
        for(int i=0;i<size1;i++){
            for(int j=0;j<size2;j++){
                System.out.print(arrSum[i][j]+" ");
            }
            System.out.println();
        }
    }
}
