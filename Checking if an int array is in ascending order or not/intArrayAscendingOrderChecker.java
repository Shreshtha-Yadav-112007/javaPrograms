import java.util.Scanner;
public class intArrayAscendingOrderChecker {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int size = sc.nextInt();
        int [] arr = new int[size];
        for(int i=0;i<arr.length;i++){
            arr[i] = sc.nextInt();
        }
        if(isAscending(arr)){
            System.out.println(1);
        }
        else{
            System.out.println(0);
        }
        sc.close();
    }
    public static boolean isAscending(int [] arr){
        boolean isAscending = true;
        for(int i=0;i<arr.length-1;i++){
            if(arr[i]<arr[i+1]){
                isAscending=false;
            }
        }
        return isAscending;
    }
}
