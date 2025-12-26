public class BinarySearchPeakElement {
    public static void main(String[] args){
        int[] arr = {0,1,0};
        System.out.println("The peak element in the Mountain Array is : "+PeakElement(arr));
    }
    static int PeakElement(int[] arr){
        int start = 0;
        int end = arr.length - 1;
        while (start < end) {
            int mid = start + (end - start)/2;
            if(arr[mid] > arr[mid + 1]){
                end = mid;
            }else{
                start = mid + 1;
            }
        }
        return arr[start];
    }
    
}
