package Array;
import java.util.*;
public class MissingNo2 {
    public static void main(String[] args) {
        int[] arr = {0,3,1};
        Arrays.sort(arr);
        for(int i = 0;i<arr.length;i++){
            if(arr[i] != i){
                System.out.println(i);
            }
        }
    }
}
