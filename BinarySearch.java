// Iterative binary search method
import java.util.Arrays;
public class BinarySearch {
    public static void main(String[] args) {
        int[] arr = {3,4,5,6,7,2,1};
        int target = 5;
        int start = 0;
        int end = arr.length-1;
        Arrays.sort(arr);
        while(start <= end){
            int mid = (end + start)/2;
            if(arr[mid] == target){
                System.out.println(mid);
                return;
            }
            else if(arr[mid] < target) {
                start = mid + 1;
            } else {
                end = mid - 1;
            }
        }
        System.out.println("Element not found");
    }
}
/* time-complexity is O(log n) and space complexity of iterative binary search is O(1), and for 
recursive binary search it is O(log n) due to the call stack.*/