public class Duplicate_Elements {
    public static void main(String[] args){
        int[] arr = {1,2,3,2,1};
        Cyclic_Sort(arr);
        System.out.println(NumberOfDuplicates(arr)+" Duplicates");


    }
    static void Cyclic_Sort(int[] arr){
        int i = 0;
        while(i < arr.length){
            int correct = arr[i] - 1;
            if(arr[i] != arr[correct]){
                swap(arr,i,correct);
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
    static int NumberOfDuplicates(int[] arr){
        int count = 0;
        for(int i=0; i<arr.length; i++){
            if(arr[i] != i+1){
                count++;
            }
        }
        return count;
    }
}
