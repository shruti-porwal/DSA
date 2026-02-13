public class selectionSort {
    public static void main(String[] args) {
        int[] arr = {20,7,4,3,2,1,0};
        for(int i = 0;i<arr.length;i++){
            int min = i;
            for(int j = i+1;j<arr.length;j++){
                if(arr[j] < arr[min]){
                    min = j;
                }
            }
            
            int temp = arr[i];
            arr[i] = arr[min];
            arr[min] = temp;
        }

        for(int a : arr){
            System.out.println(a);
        }
    }
}
