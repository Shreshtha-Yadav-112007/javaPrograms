import java.util.Scanner;
import java.util.ArrayList;
public class Main
{
	public static void main(String[] args) {
	    Scanner sc = new Scanner(System.in);
	    System.out.print("Please enter the size of the array: ");
		int size = sc.nextInt();
		ArrayList<Integer> arr = new ArrayList<Integer>();
		for (int i=0;i<size;i++){
		    System.out.print("Please enter the "+i+" number: ");
		    arr.add(sc.nextInt());
		}
		System.out.print("Please enter the target element: ");
		int target_element = sc.nextInt();
		int output = -1;
		for (int j=0;j<arr.size();j++){
		    if (arr.get(j)==target_element){
		        output = arr.indexOf(target_element);
		        System.out.print(output);
		        break;
		    }
		}
		sc.close();
	}
}