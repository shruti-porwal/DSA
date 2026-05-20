package Array;

public class TwoSum {
    public static void main(String[] args) {
        int[] arr = {4,5,7,-3,0,7,9,3};
        int target = 14;
        for(int i = 0;i<arr.length;i++){
            for(int j = 0;j<arr.length;j++){
                int sum = arr[i] + arr[j];
                if(sum == target){
                    System.out.println("Yes");
                    System.out.print("Pair "+arr[i] + " "+ arr[j]);
                }
            }
        }
    }
}
