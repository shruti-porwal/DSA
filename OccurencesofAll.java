import java.util.Arrays;
public class OccurencesofAll {
    public static void main(String[] args) {
        int[] arr = {1,2,3,4,5,6,7,5};
        int count = 1;
        Arrays.sort(arr);
        for(int i = 1;i<arr.length;i++){ // if use i = 0 -- means access -1 index also.
            if(arr[i] == arr[i - 1]){
                count++;
            }
            else{
                System.out.println(arr[i - 1] + " -> " + count);
                count = 1;
            }
        }
        System.out.println(arr[arr.length - 1] + " -> " + count);
    }
}
//time complexity is O(n log n) and space is O(log n).