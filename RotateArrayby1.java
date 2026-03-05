// left Rotate Array by one.
/*Initially, nums = [1, 2, 3, 4, 5]  
Rotating once to the left results in nums = [2, 3, 4, 5, 1].*/
public class RotateArrayby1 {
    public static void main(String[] args) {
        int[] arr = {-1,0,4,6,8};
        int temp = arr[0];
        for(int i = 1;i<arr.length;i++){
            arr[i-1] = arr[i];// shift the array from second element to left side.
        }
        arr[arr.length-1] = temp;// place the element at last from first index.

        for(int x : arr){
            System.out.print(x + " ");
        }
    }
}
// time & space -- O(n) & O(1).