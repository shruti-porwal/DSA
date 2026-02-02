public class ReverseArray{
    public static void main(String[] args){
        int[] arr = {1,2,4,5};
        int start = 0;
        int end = arr.length - 1;
        
        while(start<end){
            int temp = arr[start];
            arr[start] = arr[end];
            temp = arr[start];

            start++;
            end--;

            for(int i =0;i<arr.length;i++){
                System.out.println(i);
            }
        }
    }
}
// time-complexity - O(n) & space-complexity O(1)