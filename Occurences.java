public class Occurences {
    public static void main(String[] args) {
        int[] arr = {2,3,5,4,3,1};
        int target = 3;
        int count = 0;
        for(int i = 0;i<arr.length;i++){
            if(arr[i] == target){
                count++;
            }
        }
        System.out.println(count);
    }
}
// time-complexity - O(n) & space-complexity O(1)
