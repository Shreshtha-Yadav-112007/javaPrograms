import java.util.Scanner;
public class Solution {

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        Scanner sc = new Scanner(System.in);
        int n1 = sc.nextInt();
        int n2 = sc.nextInt();
        sc.close();
        while(n1>0 && n2>0){
            if(n1>n2){
                n1 = n1%n2;
            }
            else{
                n2 = n2%n1;
            }
        }
        if(n1>n2){
            System.out.print(n1);
        }
        else{
            System.out.print(n2);
        }
    }
}