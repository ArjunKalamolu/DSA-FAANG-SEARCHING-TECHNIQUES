import java.util.*;
public class MoveZeroesEnd {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        int n = input.nextInt();
        int[] nums = new int[n];
        for(int i=0; i<nums.length; i++){
            nums[i] = input.nextInt();
        }
        System.out.println(Arrays.toString(moveZeroesEnd(nums)));
    }
    static int[] moveZeroesEnd(int[] nums){
        int count = 0;
        for(int i=0; i<nums.length; i++){
            if(nums[i] != 0){
                nums[count++] = nums[i];
            }
        }
        while(count < nums.length){
            nums[count++] = 0;
        }
        return nums;
    }
}
