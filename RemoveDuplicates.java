// Remove Duplicates from Sorted array
public class RemoveDuplicates {
    public static void main(String[] args) {
        int[] arr = {0,3,4,4,5,6,6,9};
        int count = 1;
        for(int i = 0;i<arr.length-1;i++){
            if(arr[i] != arr[i+1]){
                count += 1;
            }
        }
        System.out.println(count);
    }
}
