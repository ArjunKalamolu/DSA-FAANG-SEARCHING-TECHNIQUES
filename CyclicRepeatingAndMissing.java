import java.util.*;

public class CyclicRepeatingAndMissing {
     public static void main(String[] args){
         int[] arr = {2,1,4,2,6,5};
        Sort_Cyclic(arr);
        System.out.println(Arrays.toString(arr));
        System.out.println(Duplicate_Missing(arr));
      
       
    }
    static List<Integer> Duplicate_Missing(int[] arr){
        List<Integer> Duplicate_Missing_Elements = new ArrayList<>();
        for(int i=0; i<arr.length; i++){
            if(arr[i] != i+1){
                Duplicate_Missing_Elements.add(arr[i]);
                Duplicate_Missing_Elements.add(i+1);
            }
        }
        return Duplicate_Missing_Elements;
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
