import java.util.Scanner;
public class GCDOfTwoNumbers {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num1 = sc.nextInt();
        int num2 = sc.nextInt();
        int GCD = GCD(num1,num2);
        System.out.println(GCD);
    }
    public static int GCD(int num1,int num2){
        while(num1>0 && num2>0){
            if(num1>num2){
                num1=num1%num2;
            }
            else{
                num2=num2%num1;
            }
        }
        if(num1>num2){
            return num1;
        }
        else{
            return num2;
        }
    }
}