public class FrameElements {
    public static void main(String[] args) {
        int[][] arr = {
            {1,2,3},
            {4,5,6},
            {7,8,9},
            {10,11,12},
        };
        int rows = arr.length;
        int cols = arr[0].length;
        for(int i = 0;i<rows;i++){
            for(int j = 0;j<cols;j++){
                if(i == 0 || i == rows-1 || j == 0 || j == cols-1){
                    System.out.print(arr[i][j]+" ");
                }
                else{
                    System.out.print("  ");
                }
            }
            System.out.println();
        }
    }
}
