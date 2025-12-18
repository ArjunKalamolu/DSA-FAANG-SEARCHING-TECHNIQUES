import java.util.*;
public class Move_Zeroes_End {
    public static void main(String[] args){
        int[] arr = {0,0,0,1,2,3};
        System.out.println(Arrays.toString(MoveZeroesEnd(arr)));
    }
    static int[] MoveZeroesEnd(int[] arr){
        List<Integer> movZeroesEnd = new ArrayList<>();
        for(int i=0; i<arr.length; i++){
            if(arr[i] != 0){
                movZeroesEnd.add(arr[i]);
            }
        }
        int[] result = new int[arr.length];
        for(int i=0; i<movZeroesEnd.size(); i++){
            result[i] = movZeroesEnd.get(i);
        }
        return result;
    }
}
