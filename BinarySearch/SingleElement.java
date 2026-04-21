package BinarySearch;
public class SingleElement {
    public static void main(String[] args) {
        int[] arr  = {1,1,2,3,3,4,4,8,8};
        int low = 0;
        int high = arr.length-1;
        while(low<high){
            int mid = (low + high)/2;
            if(mid % 2 == 1){
                mid--;
            }
            if(arr[mid] == arr[mid+1]){
                low = mid + 2;
            }
            else{
                high = mid;
            }
        }
        System.out.println(arr[low]);
    }
}
