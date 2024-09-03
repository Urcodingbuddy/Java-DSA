package  binary2D;

import java.util.Arrays;

public class RowcolMatrix{
    public static void main(String[] args) {
        int[][] arr = {
            {10,12,15,18},
            {20,30,39,42},
            {45,51,60,80}
        };
        int target = 80;
        System.out.println(Arrays.toString(search(arr, target)));
    }
    static int [] search(int[][] matrix, int target){
        int r = 0;
        int c = matrix[0].length - 1;
        while(r<matrix.length && c >= 0){
            if(matrix[r][c] == target){
                return new int[]{r,c};
            }
            if(matrix[r][c] < target){
                r++;
            }else{
                c--;
            }
        }
        return new int[]{-1,-1};
    }
}