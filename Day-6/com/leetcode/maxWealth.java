package leetcode;

public class maxWealth {
    public static void main(String[] args) {
        
    }
    public int maximumWealth(int[][] accounts) {
        int ans = Integer.MIN_VALUE;
        for (int[] ints : accounts) {
            int sum = 0;
            for (int anInts : ints){
                sum += anInts;
            }
            if(sum > ans){
                ans = sum;
            }
        }
        return ans;
    }
}
