import java.util.Scanner;
public class Main5 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        System.out.println(isDivisibleByDigits(num));
        sc.close();
    }
    public static int sumOfDigits(int num){
        int sum=0;
        while(num>0){
            sum+=num%10;
            num=num/10;
        }
        return sum;
    }
    public static boolean isDivisibleByDigits(int num){
        int sum=sumOfDigits(num);
        if(num%sum==0){
            return true;
        }
        else{
            return false;
        }
    }
}