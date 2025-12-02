import java.util.Scanner;
public class factorialUsingRecursion {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        System.out.println(factorial(num));
        sc.close();
    }
    public static int factorial(int num){
        if(num==0){
            return 1;
        }
        return num*factorial(num-1);
    }
}
