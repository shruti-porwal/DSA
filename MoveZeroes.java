/*We can optimize the approach using 2 pointers i.e. i and j. The pointer j will point to the first 0 in the array and i will point to the next index.
Assume, the given array. Now, initially, we will place the 2-pointers like the following:
First, we iterate through the array to locate the position of the first zero, using a pointer j. If no zero is found, no further steps are needed.
Next, we set a second pointer i to j + 1 and start moving it forward through the array.
While moving i, whenever we encounter a non-zero element a[i], we swap it with the element at index j. After the swap, since j now holds a non-zero value, we increment j to point to the next zero. */
public class MoveZeroes {
    public static void main(String[] args) {
        int[] arr = {2,0,5,4,0,7,0,9,0,3,4,0};
        int j = 0;
        for(int i = 0;i<arr.length;i++){
            if(arr[i] != 0){
                int temp = arr[i];
                arr[i] = arr[j];
                arr[j] = temp;
                j++;
            }
        }
        for(int num : arr){
            System.out.print(num + " ");
        }
    }
}
