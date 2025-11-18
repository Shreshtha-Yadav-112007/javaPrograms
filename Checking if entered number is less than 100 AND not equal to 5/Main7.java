import java.util.Scanner;
public class Main7
{
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int num;
		num = sc.nextInt();
		if (num<100 && num!=5){
		    System.out.println("Entered number is less than 100 and not equal to 5.");
		} else if(num>100){
		    System.out.println("Entered number is greater than 100.");
		} else if(num==5) {
		    System.out.println("Entered number is equal to 5");
		}
		sc.close();
	}
}