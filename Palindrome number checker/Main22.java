import java.util.Scanner;
public class Main22
{
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Please enter the number to check if it's palindrome or not: ");
		int num = sc.nextInt();
		int num_reverse = 0;
		int modulo;
		int initial_num = num;
		while (num>0){
		    modulo = num%10;
		    num_reverse = (num_reverse*10)+modulo;
		    num = num/10;
		}
		if (initial_num == num_reverse){
		    System.out.println("Entered number is a palindrome");
		} else{
		    System.out.println("Entered number is not a palindrome");
		}
		sc.close();
	}
}