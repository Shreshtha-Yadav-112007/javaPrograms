public class countdownFromANumberUsingRecursion {
    public static void main(String[] args) {
        countdown(5);
    }
    public static void countdown(int n){
        if(n==0){
            System.out.println(n);
            return;
        }
        else{
            System.out.println(n);
            countdown(n-1);
        }
    }
}