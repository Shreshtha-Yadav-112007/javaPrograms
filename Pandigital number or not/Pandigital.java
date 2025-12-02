import java.util.Scanner;
public class Pandigital {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int num=sc.nextInt();
        int sum=sumOfAllDigits(num);
        int naturalSum=sumOfNaturalNumbers(numberOfDigits(num));
        if(sum==naturalSum){
            System.out.println("Pandigital number");
        }
        else{
            System.out.println("Not a pandigital number");
        }
    }
    public static int sumOfAllDigits(int num){
        int sum=0;
        while(num>0){
            sum+=num%10;
            num=num/10;
        }
        return sum;
    }
    public static int numberOfDigits(int num){
        int count=0;
        while(num>0){
            num=num/10;
            count++;
        }
        return count;
    }
    public static int sumOfNaturalNumbers(int num){
        int sum=(num*(num+1))/2;
        return sum;
    }
}
