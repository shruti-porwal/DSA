public class isSorted{
    public static void main(String[] args) {
        int[] arr = {3,5,4,6,8,9};
        boolean isSorted = true;
        for(int i = 0;i<arr.length-1;i++){
            if(arr[i]>arr[i+1]){
                isSorted = false;
                break;
            }
        }
        if(isSorted){
            System.out.println("Array is Sorted");
        }
        else{
            System.out.println("Array is not Sorted");
        }
    }
}
