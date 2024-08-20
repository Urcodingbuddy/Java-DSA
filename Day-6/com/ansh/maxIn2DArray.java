package ansh;

public class maxIn2DArray{
    public static void main(String[] args) {
        int[][] arr = {
            {1,2,3},
            {4,5,6},
            {7,8,9},
            {10,11,12}
        };
        System.out.println(Smax(arr));
        // System.out.println("Item Found at column: "+ c + "on Row: " + r); 
    }
    static int Smax(int[][] arr){
        int max = Integer.MIN_VALUE;
        for (int[] ints : arr) {
            for (int element : ints) {
                if(element > max){
                    max = element;
                }
            }
        }
        return max;
    }
}

