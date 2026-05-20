package Array;

public class First_LastPosition {
    public static void main(String[] args) {
        int[] arr = {1,2,3,5,5,6,7};
        int target = 5;
        int first = -1;
        int last = -1;
        for(int i = 0;i<arr.length;i++){
            if(arr[i] == target){
                if(first == -1){
                    first = i;
                }
                last = i;
            }
        }
        System.out.print("["+first+","+last+"]");//{3,4}
    }
}
//time-complexity - o(log n).