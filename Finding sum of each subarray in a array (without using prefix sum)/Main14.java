public class Main14 {
    public static void main(String[] args) {
        int [] arr = {1,2,3};
        for(int start=0;start<arr.length;start++){
            for(int end=start;end<arr.length;end++){
                int sum=0;
                for(int k=start;k<=end;k++){
                    sum+=arr[k];
                }
                System.out.println("Sum of subarray "+start+" to "+end+" = "+sum);
            }
        }
    }
}