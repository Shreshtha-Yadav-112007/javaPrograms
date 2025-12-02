import java.util.Scanner;
public class UglyNumberChecker {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        int num=sc.nextInt();
        if(isUglyNumber(num)){
            System.out.println("Ugly number");
        }
        else{
            System.out.println("Not an ugly number");
        }
        sc.close();
    }
    public static boolean isUglyNumber(int num){
        if(num==1){
            return true;
        }
        else{
            while(num%2==0){
                num/=2;
            }
            while(num%3==0){
                num/=3;
            }
            while(num%5==0){
                num/=5;
            }
            if(num==1){
                return true;
            }
            else{
                return false;
            }
        }
    }
}
