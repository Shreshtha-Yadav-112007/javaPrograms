import java.util.Scanner;
public class LargestProductInSeries {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int k = sc.nextInt();
        String str = sc.next();
        System.out.println(maxProduct(str, k));
        sc.close();
    }
    public static int maxProduct(String str, int k){
        int maxProd=0;
        for(int i=0;i<=str.length()-k;i++){
            int prod = 1;
            String current = str.substring(i, i+k);
            for(int j=0;j<current.length();j++){
                prod*=current.charAt(j)-'0';
            }
            if(prod>maxProd){
                maxProd=prod;
            }
        }
        return maxProd;
    }
}
