import java.util.Scanner;
import java.util.ArrayList;
public class Main
{
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		ArrayList<Integer> li = new ArrayList<Integer>();
		for (int i = 1;i<6;i++){
		    System.out.print("Please enter the "+i+" number: ");
		    int no = sc.nextInt();
		    li.add(no);
		}
		System.out.print("Please enter the number for which the index you want: ");
		int num = sc.nextInt();
		int index = li.indexOf(num);
		System.out.print("The index of entered number is: "+index);
		sc.close();
	}
}