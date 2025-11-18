import java.util.Scanner;
public class Main17 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int length = sc.nextInt();
        int [] arr = new int[length];
        for(int i=0;i<arr.length;i++){
            arr[i] = sc.nextInt();
        }
        int currentSum = arr[0];
        int maxSum = arr[0];
        for(int i=1;i<arr.length;i++){
            currentSum = Math.max(arr[i],currentSum+arr[i]);
            maxSum = Math.max(maxSum,currentSum);
        }
        System.out.println(maxSum);
        sc.close();
    }
}