import java.util.Scanner;
public class Main1
{
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		for(int n1=1;n1<=3;n1++){
		    for(int n2=1;n2<=3;n2++){
		        System.out.printf(n1*n2+" ");
		    }
		    System.out.println();
		}
		sc.close();
	}
}