// key rule - Start max = last element & If current ≥ max → leader.
package Array;

public class LEADERS {
    public static void main(String[] args) {
        int[] arr = {4,6,3,0,1};
        int n = arr.length;
        int max = arr[n-1];
        System.out.println(max + " ");
        for(int i = n-2;i>=0;i--){
            if(arr[i] > max){
                max = arr[i];
                System.out.println(max + " ");
            }
        }
    }
}
