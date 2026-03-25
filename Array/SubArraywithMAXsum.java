/*Input: nums = [2, 3, 5, -2, 7, -4]  
Output:15  
Explanation:
The subarray from index 0 to index 4 has the largest sum = 15, which is the maximum sum of any contiguous subarray. */
package Array;

public class SubArraywithMAXsum {
    public static void main(String[] args) {
        int[] arr = {4,3,0,5,6,1};
        int sum = arr[0];
        int maxSum = arr[0];
        for(int i = 1;i<arr.length-1;i++){
            if(arr[i] > (sum + arr[i])){
                sum = arr[i];
            }else{
                sum = sum + arr[i];
            }
            if(sum>maxSum){
                maxSum = sum;
            }
        }
        System.out.println(maxSum);
    }
}
