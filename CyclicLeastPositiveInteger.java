import java.util.Arrays;

public class CyclicLeastPositiveInteger{
    public static void main(String[] args){
         int[] arr = {1,-1,3,2,4,8};
        Sort_Cyclic(arr);
        System.out.println(Arrays.toString(arr));
        System.out.println(Least_Positive_Integer(arr));
       
    }
    static int Least_Positive_Integer(int[] arr){
        for(int i=0; i<arr.length; i++){
            if(arr[i] != i+1){
                return i+1;
            }
        }
    return arr.length+1;    

    }
     static void Sort_Cyclic(int[] arr){
        int i = 0;
        while(i < arr.length){
            int correct_Index = arr[i] - 1;
            if( arr[i] > 0 && arr[i] < arr.length && arr[i] != arr[correct_Index]){
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