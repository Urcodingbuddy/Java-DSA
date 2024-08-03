package ansh;

import java.util.Arrays;

public class ChangeValue {
    public static void main(String[] args) {
        int arr[] = {1,2,3,44,5,6};
        change(arr);
        System.out.println(Arrays.toString(arr));
    }
    static void change(int[] nums){
        nums[3] = 10;
    }
}
