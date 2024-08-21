package ansh;

public class OrderAgnosticBS {
    public static void main(String[] args) {
        // int[] arr = { 2, 6, 8, 10, 12, 14, 18, 20 };
        int[] arr = {20, 18, 14, 12, 10, 8, 6, 2};
        int target = 18;
        int ans = orderAgnosticbs(arr, target);
        System.out.println(ans);
    }
    static int orderAgnosticbs(int[] arr, int target) {
        int start = 0;
        int end = arr.length - 1;
        boolean isAsc = arr[start] < arr[end];
        while (start <= end) {
            int mid = start + (end - start) / 2;
            if(arr[mid] == target){
                return mid;
            }
            if (isAsc){
                if (target < arr[mid]) {
                    end = mid - 1;
                } else{
                    start = mid + 1;
                }    
            }else{
                if (target > arr[mid]) {
                    end = mid - 1;
                } else{
                    start = mid + 1;
                }
            }
            
        }
        return -1;
    }
}
