package BinarySearch;

import java.util.Arrays;

public class first_lastOcuurence {
    public static void main(String[] args) {
        int[] arr = {1,3,5,5,6,7};
        int target = 5;
        int first = 0;
        int last = arr.length -1;
        for(int i = 0;i<arr.length;i++){
            if(arr[i] == target){
                if(first == -1){
                    first = i;
                }
                last = i;
            }
        }
        System.out.println(Arrays.toString(new int[]{first,last}));
    }
}
// time complexity - O(n) & space - O(1)