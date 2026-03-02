// optimized approach for remove duplicates from sorted array by using two pointers.
public class TwoPointers {
    public static void main(String[] args) {
        int[] arr = {-30,-30,-10,0,0,4,5,5,7,9,9};
        int j = 0;
        for (int i = 0; i < arr.length;i++) {
            if(arr[i] != arr[j]){
                j++;
                arr[j] = arr[i];
            }
        }
        System.out.println("unique elements "+(j+1));

        for(int i = 0;i<=j;i++){
            System.out.print(arr[i] + " ");
        }
    }
}
