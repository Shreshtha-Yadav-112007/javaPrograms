import java.util.Scanner;
public class p {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        if(isArmstrong(num)){
            System.out.println("Number is a armstrong number");
        }
        else{
            System.out.println("Number is not a armstrong number");
        }
        sc.close();
    }
    public static int sumOfDigitsRaised(int num){
        int sum=0;
        while(num>0){
            sum+=Math.pow(num%10, 3);
            num=num/10;
        }
        return sum;
    }
    public static boolean isArmstrong(int num){
        int sum = sumOfDigitsRaised(num);
        if(sum==num){
            return true;
        }
        else{
            return false;
        }
    }
}
