// by using set approach , which time complexity is 0((n+m)log(n+m)) & space is O(n+m).
//Using TreeSet simplifies the problem because it automatically removes duplicates and maintains sorted order.
import java.util.*;
public class UnionOFsortedArr {
    public static void main(String[] args) {
        int[] arr1 = {1,2,3,4,5};
        int[] arr2 = {2,4,5,6};
        Set<Integer> set = new TreeSet<>();
        for(int num : arr1){
            set.add(num);
        }
        for(int num : arr2){
            set.add(num);
        }
        System.out.println(set);
    }
}
