import java.util.Arrays;
public class SecondLargest {
    public static void main(String[] args) {
        int[] arr = {4,5,6,3,0};
        Arrays.sort(arr);
            System.out.println(arr[arr.length-2]);
        }
}
//time-complexity - O(n log n) due to Array.sort() but optimized approach is O(n).