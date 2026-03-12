package Array;
public class TargetPair {
    public static void main(String[] args) {
        int[] arr = {3,4,5,6,7,0,28};
        int sum = 9;
        for(int i = 0;i<arr.length;i++){
            for(int j = i+1;j<arr.length;j++){
                if(sum == arr[i]+arr[j]){
                    System.out.println(arr[i]+" "+arr[j]);
                }
            }
        }
    }
}
