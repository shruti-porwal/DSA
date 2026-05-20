package Array;
import java.util.*;
public class SingleNo{
    public static void main(String[] args) {
        int[] arr = {2,2,3,2};
        Arrays.sort(arr);
        for(int i =0;i<arr.length-1;i+=3){
            if(arr[i] != arr[i+1]){
                System.out.println(arr[i]);
            }else{
                System.out.println(arr[arr.length-1]);
            }
        }
    }
}