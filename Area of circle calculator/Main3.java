import java.util.Scanner;
public class Main3
{
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		double r = sc.nextDouble();
		double area_of_circle = Math.PI*r*r;
		System.out.printf("Area of circle is %.2f",area_of_circle);
		sc.close();
	}
}