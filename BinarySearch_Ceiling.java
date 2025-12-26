public class BinarySearch_Ceiling {
    public static void main(String[] args){
        int[] arr = {18,16,14,9,5,3,2};
        int target = 10;
        System.out.println("Ceiling Of a Number is : "+CeilingNumber_BinarySearch(arr, target));
    }
    static int CeilingNumber_BinarySearch(int[] arr,int target){
        int start = 0;
        int end = arr.length - 1;
        boolean IsAscending = arr[start] < arr[end];
        while(start <= end){
            int mid = start + (end - start)/2;
            if(target == arr[mid]){
                return arr[mid];
            }
            if(IsAscending){
                if(target > arr[mid]){
                    start = mid + 1;
                }else{
                    end = mid - 1;
                }
            }else{
                if(target > arr[mid]){
                    end = mid - 1;
                }else{
                    start = mid + 1;
                }
            }
        }
        int Ceiling = (IsAscending) ? start : end;
        return arr[Ceiling];
    }
    
}
