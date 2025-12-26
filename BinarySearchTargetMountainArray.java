public class BinarySearchTargetMountainArray {
    public static void main(String[] args){
        int[] arr = {1,2,3,4,5,3,1};
        int target = 3;
        int peak = PeakIndex(arr);
        int firstTry = OrderAgnosticSearch(arr, target, 0, peak,true);
        int secondTry = OrderAgnosticSearch(arr, target, peak+1, arr.length - 1,false);
        if(firstTry != -1){
            System.out.println("Target element found at index : "+firstTry);
            return;
        }else if(secondTry != -1){
            System.out.println("Target element found at index : "+ secondTry);
        }else{
            System.out.println("Target element not found");
        }
    }
    static int PeakIndex(int[] arr){
        int start = 0;
        int end = arr.length - 1;
        while(start < end){
            int mid = start + (end - start)/2;
            if(arr[mid] > arr[mid + 1]){
                end = mid;
            }else{
                start = mid + 1;
            }
        }
        return start;
    }
    static int OrderAgnosticSearch(int[] arr,int target,int start,int end,boolean IsAscending){
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
                if(target > arr[mid]){
                    end = mid - 1;
                }else{
                    start = mid + 1;
                }
            }
        }
        return -1;
    }
    
}
