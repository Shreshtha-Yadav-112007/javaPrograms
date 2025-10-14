import java.util.*;
import java.util.Scanner;
import java.util.ArrayList;
public class Main {

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        Scanner sc = new Scanner (System.in);
		int size = sc.nextInt();
		ArrayList<Integer> arr = new ArrayList<Integer>();
		for (int i=1;i<size+1;i++){
		    arr.add(sc.nextInt());
		}
		int largest = arr.get(0);
        int second_largest = arr.get(0);
		for (int j=0;j<arr.size();j++){
		    if (largest<arr.get(j)){
		        largest = arr.get(j);
		    }
		}
		arr.removeAll(Collections.singletonList(largest));
        if (arr.isEmpty()){
            second_largest = largest;
        }else{
		for (int z=0;z<arr.size();z++){
		    if (second_largest<arr.get(z)){
		        second_largest = arr.get(z);
		        }
		    }
        }
		System.out.print(second_largest);
		sc.close();
	}
}