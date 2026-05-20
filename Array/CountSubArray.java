package Array;

public class CountSubArray {
    public static void main(String[] args) {
        int[] arr = {5,5,7,0,3};
        int sum = 10;
        int count = 0;
        for(int i = 0;i<arr.length;i++){
            int currSum = 0;
           for(int j = i;j<arr.length;j++){
            currSum += arr[j];
            if(currSum == sum){
                count++;
            }
           }
        }
        System.out.println(count);
    }
}