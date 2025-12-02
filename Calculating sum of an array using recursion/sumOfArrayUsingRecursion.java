import java.util.Scanner;
public class sumOfArrayUsingRecursion {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Please enter the size of array:");
        int size = sc.nextInt();
        int [] arr = new int[size];
        System.out.println("Please enter the elements of array:");
        for(int i=0;i<size;i++){
            arr[i] = sc.nextInt();
        }
        System.out.println("The sum of array is: "+sumOfArray(arr, 0));
        sc.close();
    }
    public static int sumOfArray(int []arr,int index){
        if(index==arr.length){
            return 0;
        }
        return arr[index]+sumOfArray(arr, index+1);
    }
}
