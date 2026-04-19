package Array;

public class RotateArraybyOne {
     public static void main(String[] args) {// local run k liye important h
        RotateArraybyOne obj = new RotateArraybyOne();

        int[] nums = {1,2,3,4,5,6,7};
        int k = 3;

        obj.rotate(nums, k);

        // print result
        for(int num : nums){
            System.out.print(num + " ");
        }
    }
    public void rotate(int[] nums, int k) {
        int n = nums.length;
        k = k % n;

        reverse(nums, 0, n-1);
        reverse(nums, 0, k-1);
        reverse(nums, k, n-1);
    }
    public void reverse(int[] nums,int start , int end){
        while(start<end){
            int temp = nums[start];
            nums[start] = nums[end];
            nums[end] = temp;
            start++;
            end--;
        }
    }
}
// time -- O(n) & space =-- O(1)