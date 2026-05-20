package BinarySearch;

public class SearchX {
    public static void main(String[] args) {
        int[] arr = {-1,0,3,5,9,12};
        int target = 9;
        int low = 0;
        int high = arr.length-1;
        while(low <= high){
            int mid = (low + high)/2;
            if(arr[mid] == target){
                System.out.println(mid);
                break;
            }
            else if(target>arr[mid]){
                low = mid + 1;
            }
            else{
                high = mid - 1;
            }
        }
    }
}
// time complexity -- O(log n)
