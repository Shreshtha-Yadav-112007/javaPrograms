public class Main15 {
    public static void main(String[] args) {
        int [] arr = {1,2,3};
        int [] prefix = new int[3];
        for(int i=0;i<arr.length;i++){
            if(i==0){
                prefix[i]=arr[i];
            }
            else{
                prefix[i] = prefix[i-1]+arr[i];
            }
        }
        for(int start = 0;start<prefix.length;start++){
            for(int end = start;end<prefix.length;end++){
                    int sum=0;
                    if(start ==0){
                        sum = prefix[end];
                    }
                    else{
                        sum = prefix[end]-prefix[start-1];
                    }
                    System.out.println(sum);
            }
        }
    }
}