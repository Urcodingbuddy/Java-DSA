package com.questions;

public class MaxValue {
    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 5};
        System.out.println(max(arr));
    }
    static int max(int[] arr){
        int maxValue = arr[0];
        for(int i = 1; i < arr.length; i++){
            if(arr[i] > maxValue){
                maxValue = arr[i];
            }
        }
        return maxValue;
    }
}
