package Array;
import java.util.Arrays;

public class longestConsecutiveArray {
    public static void main(String[] args) {
        int[] arr = {0,2,3,8,5,9,4,4,2,1};
        int maxCount = 1;
        int count = 1;
        Arrays.sort(arr);
        for(int i = 1;i<arr.length;i++){
            if(arr[i] == arr[i-1]){
                continue;
            }
            if(arr[i] == arr[i-1]+1){
                count++;
            }
            else{
                count = 1;
            }
            maxCount = Math.max(maxCount,count);
        }
        System.out.println(maxCount);
    }
}
// time complexity -- O(nlogn + n) & space -- O(1)
