import java.util.Scanner;
public class fibonacciSeriesUptoAIndex {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Input the index until which you want the fibonacci series to be printed:");
        int index = sc.nextInt();
        for(int i=0;i<index;i++){
            System.out.print(fib(i)+" ");
        }
        sc.close();
    }
    public static int fib(int index){
        if(index<=1){
            return index;
        }
        return fib(index-1)+fib(index-2);
    }
}
