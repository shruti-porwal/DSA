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
/*public class LargestElement {
    public static void main(String[] args) {
        int[]a= {7,30,63,0,9,-1};
        int small = 0;
        for(int i = 0; i<a.length; i++){
            if(a[i] < small){
                small = a[i];
            }
        }
        System.out.println(small);
    }
    
}*/
