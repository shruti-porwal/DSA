// this algorithm --- find the max subarray sum in given array.
package Array;

public class KADANE_Algo {
    public static void main(String[] args) {
        int[] arr = {-5,4,3,6,-1,0};
        int sum = arr[0];
        int maxSum = arr[0];
        for(int i = 1;i<arr.length;i++){
            if(arr[i] > (sum + arr[i])){
                sum = arr[i];
            }else{
                sum = sum + arr[i];
            }
            if(sum > maxSum){
                maxSum = sum;
            }
        }
        System.out.println(maxSum);
    }
    
}
// Time & space complexity --- O(n) & O(1)