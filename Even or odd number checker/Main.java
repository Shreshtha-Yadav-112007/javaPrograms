import java.util.Scanner;
public class Main
{
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
	    int no_even;
	    no_even = sc.nextInt();
	    if (no_even%2==0){
	        System.out.println("Entered number is even.");
	    }else {
	        System.out.println("Entered number is odd.");
	    }
		sc.close();
	}
}