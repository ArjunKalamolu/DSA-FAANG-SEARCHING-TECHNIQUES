import java.util.ArrayList;
public class RecursiveListTargetElements {
    public static void main(String[] args){
        int[] arr = {1,2,3,2,4};
        int target = 2;
        System.out.println(LinearSearch(arr, target));

    }
    static ArrayList<Integer> LinearSearch(int[] arr,int target){
        ArrayList<Integer> list = new ArrayList<>();
        return helper(arr,target,0,list);
    }
    static ArrayList<Integer> helper(int[] arr,int target,int i,ArrayList<Integer> list){
        if(i == arr.length){
            return list;
        }
        if(arr[i] == target){
            list.add(i);
        }
    return helper(arr, target, i+1, list);    
    }
    
}
