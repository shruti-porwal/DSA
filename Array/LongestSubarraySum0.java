package Array;

public class LongestSubarraySum0 {
    public static void main(String[] args) {
        int[] arr = {1,0,-4,6,3,-3,2,-1};
        int k = 0;
        int maxlength = 0;
        for(int i = 0;i<arr.length;i++){
            int sum = 0;
            for(int j = i;j<arr.length;j++){
                sum += arr[j];
                if(sum == k){
                    int length = j-i+1;
                    if(length>maxlength){
                        maxlength = length;
                    }
                }
            }
        }
        System.out.print("longest subArray with Sum zero:"+maxlength);
    }
}
