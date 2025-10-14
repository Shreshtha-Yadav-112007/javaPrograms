import java.util.Scanner;
import java.util.ArrayList;
public class Main
{
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Please enter the array: ");
		ArrayList<Integer> arr = new ArrayList<Integer>();
		for (int i=0;i<6;i++){
		    int no = sc.nextInt();
		    arr.add(no);
		}
		int PrimeCount=0;
		for (int j=0;j<arr.size();j++){
		    int num = arr.get(j);
		    boolean isPrime = true;
		    if (num<=1){
		        isPrime = false;
		    } else{
		        for (int z=2;z<=Math.sqrt(num);z++){
		            if (num%z==0){
		                isPrime = false;
		            }
		        }
		    }
		    if (isPrime){
		        PrimeCount++;
		    }
		}
		System.out.print("Total number of prime numbers in the array is: "+PrimeCount);
		sc.close();
	}
}