package BinarySearch;

public class SearchInsert { // search insert position in a sorted array
    public static void main(String[] args) {
        int[] arr = {1,3,4,6};
        int target = 5;
        int low = 0;
        int high = arr.length-1;
        while(low <= high){
            int mid = (low+high)/2;
            if(arr[mid] == target){
                System.out.println(mid);
            }
            else if(target>arr[mid]){
                low = mid + 1;
            }
            else{
                high = mid - 1;
            }
        }
        System.out.println(low);
    }
}
