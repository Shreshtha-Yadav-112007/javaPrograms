import java.util.Scanner;
public class p {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.next();
        String newStr = "";
        for(int i=0;i<str.length();i++){
            if(Character.isLetter(str.charAt(i))==true){
                newStr = newStr+str.charAt(i);
            }
            else{
                continue;
            }
        }
        System.out.println(newStr);
        sc.close();
    }
}