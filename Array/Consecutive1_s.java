package Array;
public class Consecutive1_s {
    public static void main(String[] args) {
        int[] arr = {1,1,0,1,1,1};
        int count = 0;
        int max_count = 0;
        for(int i = 0;i<arr.length;i++){
            if(arr[i] == 1){
                count++;
                max_count = Math.max(max_count,count);// check count>max_count if yes -- return longest consecutiveones.
            }
            else{
                count = 0;
            }
        }
        System.out.print(max_count);
    }
}
