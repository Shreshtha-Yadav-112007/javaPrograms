import java.util.*;
public class Main
{
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		double fahrenheit = sc.nextDouble();
		double celsius = (fahrenheit-32)/1.8;
		System.out.printf("Fahrenheit converted to celsius is: %.2f",celsius);
		sc.close();
	}
}