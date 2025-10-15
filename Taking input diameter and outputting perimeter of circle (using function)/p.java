import java.util.Scanner;
public class p {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double diameter = sc.nextDouble();
        if(diameter>0){
            double perimeter = perimeter(diameter);
            System.out.print(perimeter);
        }
        else{
            System.out.print("Error");
        }
        sc.close();
    }
    static double perimeter(double d){
        double perimeter = Math.PI*d;
        return perimeter;
    }
}