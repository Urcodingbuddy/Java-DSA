package com.ansh;

public class ColnoFix {
    public static void main(String[] args) {
        int[][] arr = {
            {1,2,3,4},
            {5,6},
            {7,8,9}
        };
         for(int[] elm: arr){
            for(int col = 0; col <elm.length;col++){
                System.out.print(elm[col] + " ");
            }
            System.out.println();
         }
    }
}
