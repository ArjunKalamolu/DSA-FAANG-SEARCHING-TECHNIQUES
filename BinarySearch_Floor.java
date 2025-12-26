public class BinarySearch_Floor {
    public static void main(String[] args){
        int[] arr = {4,3,2,1};
        int target = 5;
        System.out.println("Floor Of a Number is : "+FloorNumber_BinarySearch(arr, target));
    }
    static int FloorNumber_BinarySearch(int[] arr,int target){
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
        int Floor = (IsAscending) ? end : start;
        return arr[Floor];
    }
    
}
