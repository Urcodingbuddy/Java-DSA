package com.questions;

import java.util.Arrays;

public class ReverseArr {
    public static void main(String[] args) {
        int[] arr = {1,2,3,4};
        reverse(arr);
        System.out.println("After Reverse:"+Arrays.toString(arr));
    }

    static void reverse(int[] arr){
        System.out.println("Before Reverse:"+Arrays.toString(arr));
        int start = 0;
        int end = arr.length-1;
        while(start<end){
            swap(arr, start, end);
            start++;
            end--;
        }
    }
    
    static void swap(int[] arr, int index1 ,int index2){
        int temp = arr[index1];
        arr[index1] = arr[index2];
        arr[index2] = temp;
    }
}

