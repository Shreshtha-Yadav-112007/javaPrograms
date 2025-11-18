import java.util.Scanner;
public class Main2 {
    public static void main(String[] args) {Scanner sc = new Scanner(System.in);
    int [] arr = {1,2,3,4};
    for(int start=0;start<arr.length;start++){
        for(int end=start;end<arr.length;end++){
            System.out.print("[");
            for(int k=start;k<=end;k++){
                System.out.print(arr[k]);
                if(k<end){
                    System.out.print(", ");
                }
            }
            System.out.print("]");
            sc.close();
        }
    }
}
}