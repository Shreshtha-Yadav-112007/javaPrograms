//Your task in this problem is to find the number of pentagonal numbers Pn (where n < N) such that the difference or sum of two pentagonal numbers Pn and Pn-K is also a pentagonal number.
import java.util.Scanner;
public class PentagonalNumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num=sc.nextInt();
        int diff=sc.nextInt();
        int counter=0;
        for(int i=diff+1;i<num;i++){
            int j=i-diff;
            int sum=pentagonalCalc(i)+pentagonalCalc(j);
            int dif=pentagonalCalc(i)-pentagonalCalc(j);
            if(isPentagonal(sum)||isPentagonal(dif)){
                counter++;
            }
        }
        System.out.println(counter);
        sc.close();
    }
    public static int pentagonalCalc(int num){
        int n=(num*(3*num-1))/2;
        return n;
    }
    public static boolean isPentagonal(int num){
        double n=(1+Math.sqrt(1+24*num))/6;
        if(n==(int)n){
            return true;
        }
        else{
            return false;
        }
    }
}
