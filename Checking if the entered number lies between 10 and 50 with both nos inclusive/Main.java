import java.util.Scanner;
public class Main
{
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int num;
		num = sc.nextInt();
		if (num<=50 && num>=10){
		System.out.println("Entered number is greater than 10 and less than 50.");
		}else if(num>50 || num<10){
		System.out.println("Entered number is NOT greater than 10 and less than 50");
		}
	}
}