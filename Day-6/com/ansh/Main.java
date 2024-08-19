package ansh;

public class Main{
    public static void main(String[] args) {
        int[] nums = {12,2,4,561,85,4,574,854,54,345};
        int target = 991;
        int ans = linearSearch(nums, target);
        System.err.println("The Target value: "+ target +" is found at Index: "+ans);

    }
    // Search in the Array: return the index if item found
    // Otherwise if item not found return -1
    static int linearSearch(int[] arr, int target){
        if(arr.length == 0){
            return  -1;
        }
        for(int element : arr) {
            if(element == target){
                return element;
            } 
        }
        return Integer.MAX_VALUE;
    }
}

