import java.util.Scanner;
public class Main31
{
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int [] nums = new int[5];
		for (int i=0;i<nums.length;i++){
		    System.out.print("Please enter the "+(i+1)+" number: ");
		    nums[i] = sc.nextInt();
		}
		int sum = 0;
		int max = nums[0];
	    int min = nums[0];
	    for(int j=0;j<nums.length;j++){
	        sum += nums[j];
	        if (nums[j]>max){
	            max = nums[j];
	        }
	        if (nums[j]<min){
	            min = nums[j];
	        }
	    }
	    double average = (double)sum/nums.length;
	    System.out.println(sum);
	    System.out.println(max);
	    System.out.println(min);
	    System.out.println(average);
		sc.close();
	}
}