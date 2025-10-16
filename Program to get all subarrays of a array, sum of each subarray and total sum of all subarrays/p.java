public class p {
    public static void main(String[] args) {
        int [] arr = {2,4,6};
        int [] prefix = new int[arr.length];
        prefix[0] = arr[0];
        for(int i=1;i<arr.length;i++){
            prefix[i] = prefix[i-1]+arr[i];
        }
        int total = 0;
        for(int start = 0;start<prefix.length;start++){
            for(int end=start;end<prefix.length;end++){
                int sum=0;
                if(start==0){
                    sum = prefix[end];
                }
                else{
                    sum = prefix[end] - prefix[start-1];
                }
                total+= sum;
                System.out.print("[");
                for(int k=start;k<=end;k++){
                    System.out.print(arr[k]);
                    if(k<end){
                        System.out.print(", ");
                    }
                    else if(k==end){
                        System.out.print("]");
                    }
                }
                System.out.println(" Sum of this subarray: "+sum);
            }
        }
        System.out.println("Total sum of all subarrays: "+total);
    }
}