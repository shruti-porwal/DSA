public class optimalSeclargest {
    public static void main(String[] args) {
        int[] nums = {4,5,9,-4,5,13};
        if(nums.length<2) {
        System.out.println(-1);
    }
    int max = nums[0];
    int secondLargestElement = -1;
    for(int i = 1;i<nums.length;i++){
        if(nums[i]>max){
            secondLargestElement = max;
            max = nums[i];
        }
        else if (nums[i]>secondLargestElement && nums[i] != max){
            secondLargestElement = nums[i];
        }
    }
    System.out.println(secondLargestElement);
    }
}
