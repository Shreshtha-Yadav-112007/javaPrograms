import java.util.Scanner;
public class charCheckUsingRecursion {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Please input the string:");
        String str = sc.nextLine();
        System.out.println("Please enter the target char:");
        String input = sc.next();
        char ch = input.charAt(0);
        System.out.println("The char appeared "+charCheck(str, ch)+" times!");
        sc.close();
    }
    public static int charCheck(String str, char ch){
        if(str.length()==0)return 0;
        if(str.charAt(0)==ch){
            return 1+charCheck(str.substring(1), ch);
        }
        return charCheck(str.substring(1), ch);
    }
}
