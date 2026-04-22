/*Given the sorted rotated array nums of unique elements, return the minimum element of this array.

You must write an algorithm that runs in O(log n) time.

 

Example 1:

Input: nums = [3,4,5,1,2]
Output: 1
Explanation: The original array was [1,2,3,4,5] rotated 3 times. */
package BinarySearch;
public class MinOFRoatatedArr {
    public static void main(String[] args) {
        int[] arr = {4,5,0,2,4};
        int low  = 0;
        int high = arr.length-1;
        while(low<high){
            int mid = (low + high)/2;
            if(arr[mid]>arr[high]){
                low = mid + 1;
            }
            else{
                high = mid;
            }
        }
        System.out.println(arr[low]);
    }
}