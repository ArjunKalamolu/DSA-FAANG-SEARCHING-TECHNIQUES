import java.util.*;

public class CyclicDuplicates {
     public static void main(String[] args){
        int[] arr = {4,3,2,7,8,2,3,1};
        Sort_Cyclic(arr);
        System.out.println(Arrays.toString(arr));
        System.out.println(FindingDuplicates(arr));
    }
    static List<Integer> FindingDuplicates(int[] arr){
        List<Integer> Duplicate_Elements = new ArrayList<>();
        for(int i=0; i<arr.length; i++){
            if(arr[i] != i+1){
                Duplicate_Elements.add(arr[i]);
            }
        }
        return Duplicate_Elements;
    }
    static void Sort_Cyclic(int[] arr){
        int i = 0;
        while(i < arr.length){
            int correct_Index = arr[i] - 1;
            if( arr[i] != arr[correct_Index]){
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
