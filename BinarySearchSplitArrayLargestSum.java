public class BinarySearchSplitArrayLargestSum {
    public static void main(String[] args){
        int[] arr = {1,2,3,4,5};
        int m = 2;
        System.out.println(SplitArray(arr, m));
    }
    static int SplitArray(int[] arr,int m){
        int start = 0;
        int end = 0;
        for(int i=0; i<arr.length; i++){
            start = Math.max(start,arr[i]);
            end  += arr[i];
        }
        while(start < end){
            int sum = 0;
            int pieces = 1;
            int mid = start + (end - start)/2;
            for(int i=0; i<arr.length; i++){
                if(sum+arr[i] > mid){
                    sum = arr[i];
                    pieces++;
                }else{
                    sum += arr[i];
                }
            }
            if(pieces > m){
                start = mid + 1;
            }else{
                end = mid;
            }
        }
        return end;
    }
    
}
