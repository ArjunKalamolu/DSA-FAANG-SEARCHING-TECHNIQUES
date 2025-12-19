import java.util.Arrays;
public class CyclicSort {
    public static void main(String[] args){
        int[] arr = {9,6,4,2,3,5,7,0,1};
        Sort_Cyclic(arr);
        System.out.println(Arrays.toString(arr));
    }
    static void Sort_Cyclic(int[] arr){
        int i = 0;
        while(i < arr.length){
            int correct_Index = arr[i];
            if(arr[i] < arr.length && arr[i] != arr[correct_Index]){
                swap(arr,i,correct_Index);
            }else{
                i++;
            }
        }
    }
    static void swap(int[] arr,int index1,int index2){
        int temp = arr[index1];
        arr[index1] = arr[index2];
        arr[index2] = temp;
    }
    
}
