import java.util.Scanner;
public class reversingAStringUsingRecursion {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Please enter the string to reverse:");
        String str = sc.nextLine();
        System.out.println("The reversed string is: "+stringReverse(str));
        sc.close();
    }
    public static String stringReverse(String str){
        if(str.length()==0){
            return "";
        }
        return stringReverse(str.substring(1))+str.charAt(0);
    }
}
