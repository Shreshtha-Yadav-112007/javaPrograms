public class Main13 {
    public static void main(String[] args) {
        int [] arr = {1,2,3,4};
        int [] prefix = new int[arr.length];
        prefix[0] = arr[0];
        for(int i=1;i<arr.length;i++){
            prefix[i] = prefix[i-1]+arr[i];
        }
        int total = 0;
        for(int start = 0;start<prefix.length;start++){
            for(int end = start;end<prefix.length;end++){
                if(start==0){
                    total += prefix[end];
                }
                else{
                    total += prefix[end]-prefix[start-1];
                }
            }
        }
        System.out.println(total);
    }
}