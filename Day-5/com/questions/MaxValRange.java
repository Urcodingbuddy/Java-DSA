package com.questions;

public class MaxValRange {
    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 5};
        System.out.println(maxRange(arr, 1,3));
    }
    static int maxRange(int[] arr, int start, int end){
        int maxValue = arr[0];
        for(int i = start; i <= end; i++){
            if(arr[i] > maxValue){
                maxValue = arr[i];
            }
        }
        return maxValue;
    }
}
