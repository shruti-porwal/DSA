public class LargestElement {
    public static void main(String[] args) {
        int[] arr = {1,2,5,4};
        int max = 0;
        for(int i =0;i<arr.length;i++){
            if(arr[i]>max){
                max = arr[i];
            }
        }
        System.out.println(max);
    }
}
// time-complexity - O(n) & space-complexity O(1)
