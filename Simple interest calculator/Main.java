import java.util.Scanner;
public class Main
{
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		double principal,rate,time;
		principal = sc.nextDouble();
		rate = sc.nextDouble();
		time = sc.nextDouble();
		double simple_interest = (principal*rate*time);
		System.out.printf("The simple interest is: "+"%.2f",simple_interest);
	}
}