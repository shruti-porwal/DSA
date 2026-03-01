public class SecondLar2 {
    public static void main(String[] args) {
        int[] arr = {7,9,3,11,5,6};
        int max = Integer.MIN_VALUE;/*to compare min value like also compare in case of -ve no and int in java stores -2^31 to 2^31 = -2147483648 to 2147483648*/
        int secLargest = Integer.MIN_VALUE;
        for(int i = 0;i<arr.length;i++){
            if(arr[i] > max){
                secLargest = max;// store first old max then update as new max
                max = arr[i];
            }
            else if(arr[i] > secLargest && arr[i] != max){ // not equalto handle duplicates that not store duplicate value in it as max
                secLargest = arr[i];
                }
            }
        System.out.println(secLargest);
    }
}
