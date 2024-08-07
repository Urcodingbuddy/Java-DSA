package com.questions;
import java.util.Arrays;

public class SwapNum {
    public static void main(String[] args) {
        int[] arr = {1,2,3,4};
        swap(arr, 1 ,3);
        System.out.println("After Swap:"+Arrays.toString(arr));
    }
    static void swap(int[] arr, int index1 ,int index2){
        System.out.println("Before Swap:"+Arrays.toString(arr));
        int temp = arr[index1];
        arr[index1] = arr[index2];
        arr[index2] = temp;
    }

}
