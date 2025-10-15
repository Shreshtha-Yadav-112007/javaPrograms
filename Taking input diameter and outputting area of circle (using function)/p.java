import java.util.Scanner;
public class p {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double diameter = sc.nextDouble();
        if(diameter<0){
            System.out.println("Error");
        }
        else{
            System.out.println(area(diameter/2));
        }
        sc.close();
    }
    static double area(double r){
        double area = Math.PI*r*r;
        return area;
    }
}