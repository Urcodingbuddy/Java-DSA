package com.ansh;

import java.util.Arrays;
import java.util.Scanner;

public class Input{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        // Array of primitives
        //-----------------------------------
        // int []arr = new int[10];
        // for(int i = 1; i<arr.length; i++){
        //     arr[i] = i*2;
        // } 
        // for( int num: arr){
        //     System.out.print(num+" ");
        // }
        // System.out.println(Arrays.toString(arr));
        //-----------------------------------

        // Array of Objects
        String[] str = new String[5];
        for(int i = 0;i<str.length; i++){
            str[i] = sc.next();
        }
        for(int i = 0;i<str.length; i++){
            System.out.println("name"+i+": "+str[i]);
        }
        System.out.println(Arrays.toString(str));
    }
}
