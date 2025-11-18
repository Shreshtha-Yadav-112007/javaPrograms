import java.util.Scanner;
public class Main4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int length = sc.nextInt();
        int [] arr = new int[length];
        for(int i=0;i<arr.length;i++){
            arr[i] = sc.nextInt();
        }
        int sum = 0;
        for(int i=0;i<arr.length;i++){
            sum+=arr[i]*(i+1)*(length-i);
        }
        System.out.println(sum);
        sc.close();
    }
}