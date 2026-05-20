package Array;

public class RearrangeSignTerms{
    public static void main(String[] args) {
        int[] arr = {1,2,3,-2,-3,-1};
        String posArr = "";
        String negArr = "";
        for(int i : arr){
            if(i>0){
                posArr += i + " ";
            }
            else{
                negArr += i + " ";
            }
        }
        System.out.println("Positive elements: " + posArr);
        System.out.println("Negative Elements: " + negArr);
    }
}
// Time complexity - O(n) & space - O(n)
