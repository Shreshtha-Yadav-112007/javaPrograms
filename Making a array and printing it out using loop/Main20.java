import java.util.Scanner;
public class Main20
{
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int [] arr = new int[5];
		for (int i=0;i<arr.length;i++){
		    arr[i] = 10*(i+1);
		    System.out.println(arr[i]);
		}
		sc.close();
	}
}