package Array;

public class Rotateby90 {
    public static void main(String[] args) {
        int[][] matrix = {
            {1,2,3},
            {4,5,6},
            {7,8,9}
        };
        int n = matrix.length;
        for(int i = 0;i<n;i++){
            for(int j = i;j<n;j++){
                int temp = matrix[i][j];
                matrix[i][j] = matrix[j][i];
                matrix[j][i] = temp;
            }
        }
        for(int i = 0;i<n;i++){
            for(int j = n-1;j>=0;j--){
                System.out.print(matrix[i][j] + " ");
            }
            System.out.println();
        }
    }
}
// time complexity and space --- O(n^2) & O(1)
