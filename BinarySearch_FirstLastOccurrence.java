import java.util.Arrays;

public class BinarySearch_FirstLastOccurrence {
    public static void main(String[] args){
        int[] arr = {5,7,7,8,8,10};
        int target = 7;
        System.out.println(Arrays.toString(First_Last_Occurrence(arr, target)));
    }
    static int[] First_Last_Occurrence(int[] arr,int target){
        int[] ans = {-1,-1};
        int first_occurrence = Search(arr,target,true);
        int last_occurrence = Search(arr,target,false);
        ans[0] = first_occurrence;
        ans[1] = last_occurrence;
        return ans;
    }
    static int Search(int[] arr,int target,boolean findfirstindex){
        int ans = -1;
        int start = 0;
        int end = arr.length - 1;
        while(start <= end){
            int mid = start + (end - start)/2;
            if(target > arr[mid]){
                start = mid + 1;
            }else if(target < arr[mid]){
                end = mid -1;
            }else{
                ans = mid;
                if(findfirstindex){
                    end = mid - 1;
                }else{
                    start = mid + 1;
                }
            }
        }
        return ans;
    }
    
}
