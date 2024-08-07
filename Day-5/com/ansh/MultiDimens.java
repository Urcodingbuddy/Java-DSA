package com.ansh;

import java.util.Scanner;

public class MultiDimens {
    public static void main(String[] args) {
        // or -----------
        // int[][] arr = new int[3][];
        // arr[0] = 5;
        //-----or
        // int[][] arr = {
        //     {1, 2, 3},
        //     {4, 5, 6},
        //     {7, 8, 9}
        // };
        // System.out.print(Arrays.toString(arr));
        Scanner in = new Scanner(System.in);
        // int [][] arr = new int[3][3];
        // for (int[] a : arr) {
        //     for (int col = 0; col < a.length; col++) {
        //         a[col] = in.nextInt();
        //     }
        // }
        // //output
        // for (int[] b : arr) {
        //     System.out.println(Arrays.toString(b));
        // }

        String[] arr2 = new String[4];
        System.out.println(arr2[0]);

        for(String elem : arr2){
            System.out.println(elem);
        }



    }
}
