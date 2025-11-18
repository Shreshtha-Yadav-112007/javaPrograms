import java.util.Scanner;
public class Main11
{
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Please enter the number upto which the fibonacci series is printed: ");
		int num = sc.nextInt();
		int num1 = 0;
		int num2 = 1;
		while (num1<=num){
		    System.out.printf(num1 + " ");
		    int sum = num1+num2;
		    num1 = num2;
		    num2 = sum;
			sc.close();
		}
	}
}