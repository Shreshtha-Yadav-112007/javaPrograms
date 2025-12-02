import java.util.Scanner;
public class AllPrimesSmallerThanGivenNum {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        for(int i=2;i<=num;i++){
            boolean isPrime=true;
            for(int j=2;j<=Math.sqrt(i);j++){
                if(i%j==0){
                    isPrime=false;
                }
            }
            if(isPrime){
                System.out.print(i+",");
            }
        }
        sc.close();
    }
}
