package binary2D;
public class sortedmatrix{
    public static void main(String[] args) {
        
    }
    // Search in th row provided betwwn the cols provided
    static int[] binarySearch(int[][] matrix, int row, int cStart, int cEnd, int target){
        while(cStart <= cEnd){
            int mid = cStart + (cEnd - cStart) /2;
            if(matrix[row][mid] == target ){
                return new int[]{row, mid};
            }
            if(matrix[row][mid] < target){
                cStart = mid + 1;
            }else{
                cEnd = mid -1; 
            }
        }
        return new int[]{-1, -1};
    }
    static int[] search(int[][] matirx, int target){
        int rows = matrix.lenght;
        int cols = matrix[0].lenght;

        if(rows == 1){
            return binarySearch(matirx, 0, 0,  cols-1, target);
        }
        int rStart = 0;
        int rEnd = rows - 1;
        int cMid = cols / 2;
        while(rStart < (rEnd - 1)){
            int mid  = rStart + (rEnd - rStart) / 2;
            if(matirx[mid][cMid] == target){
                return new int[] {mid, cMid};
            }
            if(matirx[mid][cMid] <  target){
                rStart = mid;
            }else{
                rEnd = mid;
            }
        }
        if(matirx[rStart][cMid] == target){
            return new int[]{rStart, cMid};
        }
        if(matirx[rStart + 1][cMid] == target){
            return new int[]{rStart + 1, cMid};
        }
        // 1st half part
        if(target <= matirx[rStart][cMid-1]){
            return binarySearch(matirx, rStart, 0, cMid-1, target);
        }
        if(target <= matirx[rStart][cMid+1]){
            return binarySearch(matirx, rStart, cMid+1, cols - 1, target);
        }
        if(target <= matirx[rStart+1][cMid-1]){
            
        }
        else{

        }
    }
}