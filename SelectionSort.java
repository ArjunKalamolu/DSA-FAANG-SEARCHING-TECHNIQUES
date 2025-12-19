import java.util.Arrays;
public class SelectionSort {
    public static void main(String[] args){
        int[] arr = {9,6,4,2,3,5,7,0,1};
        Sort_Selection(arr);
        System.out.println(Arrays.toString(arr));

    }
    static void Sort_Selection(int[] arr){
        for(int i=0; i<arr.length - 1; i++){
            int Current_Index = i;
            int Minimum_Element_Index = getMinimumIndex(arr,i,arr.length - 1);
            swap(arr,Current_Index,Minimum_Element_Index);
        }
    }
    static int getMinimumIndex(int[] arr,int start,int end){
        int smallest = start;
        for(int i=start; i<=end; i++){
            if(arr[i] < arr[smallest]){
                smallest = i;
            }
        }
        return smallest;
    }
    static void swap(int[] arr,int index1,int index2){
        int temp = arr[index1];
        arr[index1] = arr[index2];
        arr[index2] = temp;
    }
    
}
