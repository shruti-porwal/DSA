package Array;

import java.util.Arrays;

public class SortZeroes {
    public static void main(String[] args) {
        int[] arr = {1,1,0,1,0,1,0};
        int count = 0;
        for(int i = 0;i<arr.length;i++){
            if(arr[i] == 0){
                count++;// count the zeroes.
            }
        }

        for(int i = 0;i<count;i++){
            arr[i] = 0;// places zeroes
        }
        for(int i = count;i<arr.length;i++){
            arr[i] = 1;// places ones
        }
        System.out.println(Arrays.toString(arr));
    }
}
// T.C-- O(n) & S.C -- O(1).