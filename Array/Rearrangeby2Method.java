package Array;

public class Rearrangeby2Method {
   public static void main(String[] args) {
    int[] arr = {1,2,4,-3,-5,-9};
    int[] ans = new int[arr.length];
    int pos = 0;
    int neg = 1;
    for(int i : arr){
        if(i>0){
            ans[pos] += i;
            pos += 2;
        }
        else{
            ans[neg] += i;
            neg += 2;
        }
    }
    //return ans;  -- this logic is used to print all elemnets by on any platform which runs the return statement to direct print arrs.
}
}
