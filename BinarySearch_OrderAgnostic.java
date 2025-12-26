public class BinarySearch_OrderAgnostic {
    public static void main(String[] args){
        int[] arr = {39,28,23,0,-2};
        int target = 28;
        System.out.println(Binary_Search(arr, target));
    }
    static int Binary_Search(int[] arr,int target){
        int start = 0;
        int end = arr.length - 1;
        boolean IsAscending = arr[start] < arr[end];
        while(start <= end){
            int mid = start + (end - start)/2;
            if(target == arr[mid]){
                return mid;
            }
            if(IsAscending){
                if(target > arr[mid]){
                    start = mid + 1;
                }else{
                    end = mid - 1; 
                }
            }else{
                if(target < arr[mid]){
                    start = mid + 1;
                }else{
                    end = mid - 1;
                }
            }
        }
        return -1;
    }
    
}
