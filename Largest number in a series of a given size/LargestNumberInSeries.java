import java.util.Scanner;
public class LargestNumberInSeries {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str=sc.next();
        int k=sc.nextInt();
        System.out.println(largestNumberInString(str, k));
        sc.close();
    }
    public static String largestNumberInString(String str,int k){
        String max="";
        for(int i=0;i<=str.length()-k;i++){
            String current=str.substring(i,i+k);
            if(current.compareTo(max)>0){
                max=current;
            }
        }
        return max;
    }
}
