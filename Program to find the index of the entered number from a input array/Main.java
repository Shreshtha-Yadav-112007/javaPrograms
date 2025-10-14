import java.util.Scanner;
public class Main
{
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Please enter the size of the array: ");
		int size = sc.nextInt();
		int arr[] = new int[size];
		for (int i=0;i<size;i++){
		    System.out.print("Please enter the "+i+" number: ");
		    arr[i] = sc.nextInt();
		}
		System.out.print("Please enter the number for which the index will be printed: ");
		int no = sc.nextInt();
		for (int j=1;j<size;j++){
		    if (arr[j]==no){
		    System.out.print("The index of entered number is: "+j);
		}else{
		    continue;
		}
	}
	sc.close();
}
}