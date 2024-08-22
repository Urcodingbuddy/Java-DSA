package interviewQ;
public class Floor {
    public static void main(String[] args) {
        int[] arr = { 2, 6, 8, 10, 12, 14, 18, 20 };
        int target = 10;
        int ans = floor(arr, target);
        System.out.println(ans);
    }
    static int floor(int[] arr, int target) {
        // if(target < arr[0]){
        //     return -1;
        // }
        int start = 0;
        int end = arr.length - 1;
        while (start <= end) {
            int mid = start + (end - start) / 2;
            if (target < arr[mid]) {
                end = mid - 1;
            } 
            else if (target > arr[mid]) {
                start = mid + 1;
            } else {
                return mid;
            }
        }
        return end;
    }
}
