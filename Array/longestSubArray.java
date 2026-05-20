package Array;
public class longestSubArray {
    public static void main(String[] args) {
        int[] arr = {5,6,-4,0,2,1};
        int k = 6;
        int maxLength = 0;
        for(int i = 0;i<arr.length;i++){
            int sum = 0;
            for(int j = i;j<arr.length;j++){
                sum += arr[j];
                if(sum == k){
                    int length = j-i+1;
                    if(length>maxLength){
                        maxLength = length;
                    }
                }
            }
        }
        System.out.print("longest sub Array:"+maxLength);
    }
}
// time complexity and space --- O(n^2) & O(1)