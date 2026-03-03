public class MissingNo {
    public static void main(String[] args) {
        int[] arr = {0,3,4,6,2,5};
        int n = arr.length;
        int ExpectedSum = n *(n+1)/2;
        int actualSum = 0;
        for(int i = 0;i<n;i++){
           actualSum += arr[i];
        }
        int missing = ExpectedSum - actualSum;
        System.out.println("missing no is: " +missing);
    }
}
