import java.util.Arrays;
public class Second_Largest_Element {
    public static void main(String[] args){
        int[] arr = {10,20,4,45,99};
        Bubble_Sort(arr);
        System.out.println(Arrays.toString(arr));
        System.out.println("Second Largest Element is : "+arr[arr.length-2]);
    }
    static void Bubble_Sort(int[] arr){
        for(int i=0; i<arr.length; i++){
            boolean swapped = false;
            for(int j=1; j<arr.length - i; j++){
                if(arr[j] < arr[j-1]){
                    int temp = arr[j];
                    arr[j] = arr[j-1];
                    arr[j-1] = temp;
                    swapped = true;
                }
            }
            if(!swapped){
                break;
            }
        }
    }
    
}
