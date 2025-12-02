import java.util.Scanner;
public class ArmstrongNumberChecker {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        if(isArmstrong(num)){
            System.out.println("Armstrong number");
        }
        else{
            System.out.println("Not an armstrong number");
        }
        sc.close();
    }
    public static int numberOfDigits(int num){
        int digits = 0;
        while(num>0){
            num=num/10;
            digits++;
        }
        return digits;
    }
    public static int sumOfDigitsRaised(int num){
        int digits = numberOfDigits(num);
        int sum=0;
        while(num>0){
            sum+=Math.pow(num%10,digits);
            num=num/10;
        }
        return sum;
    }
    public static boolean isArmstrong(int num){
        int sum=sumOfDigitsRaised(num);
        if(num==sum){
            return true;
        }
        else{
            return false;
        }
    }
}