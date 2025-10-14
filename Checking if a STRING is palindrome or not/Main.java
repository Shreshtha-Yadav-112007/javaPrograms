import java.util.Scanner;
public class Main
{
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String str = sc.next();
		String rev = "";
		int len = str.length();
		for(int i = len-1; i>=0; i--){
		    rev+=str.charAt(i);
		}
		if(str.equals(rev)){
		    System.out.print("Palindrome");
		}
		else{
		    System.out.print("Not palindrome");
		}
		sc.close();
	}
}