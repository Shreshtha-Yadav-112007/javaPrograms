import java.util.Scanner;
public class frequencyOfEachDigit {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.next();
        int [] arr = new int[10];
        boolean [] present = new boolean[10];
        for(int i=0;i<str.length();i++){
            int num = str.charAt(i)-'0';
            arr[num]++;
            present[num]=true;
        }
        for(int digit=0;digit<=10;digit++){
            if(present[digit]){
                System.out.println(digit+":"+arr[digit]);
            }
        }
        sc.close();
    }
}
