import java.util.Arrays;
public class RotateArraybyK {
    public static void main(String[] args) {
        int[] arr = {1,2,4,5,6,8,9};
        int k = 2;
        int[] temp = Arrays.copyOfRange(arr,0,k);
        for(int i = k;i<arr.length;i++){
            arr[i-k] = arr[i];// to shift the ekements of k from k to last or left.
        }
        for(int i = 0;i<k;i++){
            arr[arr.length-k+i] = temp[i];// to place the elemenet from upward to backward
        }
        for(int x : arr){
            System.out.print(x + " ");
        }
    }
}
// time & space - O(n) & O(k)
