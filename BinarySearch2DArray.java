import java.util.Arrays;

public class BinarySearch2DArray {
    public static void main(String[] args){
        int[][] arr = {
            {1,2,3,4},
            {5,6,7,8},
            {9,10,11,12},
            {13,14,15,16}
        };
        int target = 15;
        System.out.println(Arrays.toString(TargetIn2d(arr,target)));
    }
    static int[] TargetIn2d(int[][] arr,int target){
        int row = 0;
        int col = arr[0].length - 1;
        while(row < arr.length && col >= 0){
            if(arr[row][col] == target){
                return new int[]{row,col};
            }
            if(arr[row][col] > target){
                col--;
            }else{
                row++;
            }
        }
        return new int[]{-1,-1};
    }
    
}
