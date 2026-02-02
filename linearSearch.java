public class linearSearch {
    public static void main(String[] args) {
        int[] arr = {2,6,9,10,46};
        int target = 9;
        for(int i = 0;i<arr.length;i++){
            if(arr[i] == target){
                System.out.println(arr[i]);
            }
        }
    }
}
// time-complexity - O(n) & space-complexity O(1)
