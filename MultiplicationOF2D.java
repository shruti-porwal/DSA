public class MultiplicationOF2D {
    public static void main(String[] args) {
        int[][] arr1 = {
            {1,2,3},
            {2,3,4},
            {2,5,6},
        };
        int[][] arr2 = {
            {3,4,5},
            {4,5,6},
            {7,8,9},
        };
        int m = arr1.length;
        int n = arr1[0].length;
        int q = arr2[0].length;
        int[][] arr = new int[m][q];
        for(int i = 0;i<m;i++){
            for(int j = 0;j<n;j++){
                for(int k =0;k<q;k++){
                    arr[i][j] += arr1[i][k] * arr2[k][j];
                }
            }
        }

        for(int i = 0;i<m;i++){
            for(int j = 0;j<q;j++){
                System.out.print(arr[i][j] + " ");
            }
            System.out.println();
        }
    }
}
