package Array;
public class MajorityElement {
    public static void main(String[] args) {
        int[] arr = {7,0,1,7,1,7,7,7};
        int n = arr.length;
        for(int i = 0;i<n;i++){
            int count = 0;
            for(int j = 0;j<n;j++){
            if(arr[i] == arr[j]){
                count++;
            }
        }
        if(count>n/2){
            System.out.print("Majority Element :" +arr[i]);
            break;
        }
    }
    }
}