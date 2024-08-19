package ansh;

import java.util.Arrays;

public class SearchIn2DArray {
    public static void main(String[] args) {
        int[][] arr = {
            {1,2,3},
            {4,5,6},
            {7,8,9},
            {10,11,12}
        };
        int target = 9;
        int [] ans = search(arr, target);
        System.out.println(Arrays.toString(ans)); 
        // System.out.println("Item Found at column: "+ c + "on Row: " + r); 
    }
    static int[] search(int[][] arr, int target){
        String err1 = "Not";
        String err2 = "Found";
        for(int r = 0; r<arr.length; r++){
            for(int c = 0; c<arr[r].length; c++){
                if(arr[r][c] == target){
                   return new int []{r, c};
                }
            }
        }
        return new int []{-1, -1};
    }
}
