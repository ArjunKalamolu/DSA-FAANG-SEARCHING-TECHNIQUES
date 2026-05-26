import java.util.*;
public class MaxSubArraySumK {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        int n = input.nextInt();
        int[] nums = new int[n];
        for(int i=0; i<nums.length; i++){
            nums[i] = input.nextInt();
        }
        int k = input.nextInt();
        System.out.println(maxSubArraySumK(nums, k));
    }
    static int maxSubArraySumK(int[] nums,int k){
        if(k <= 0|| k > nums.length){
            return nums.length;
        }
        int sum = 0;
        int start = 0;
        for(int i=0; i<k; i++){
            sum += nums[i];
        }
        int maxSub = sum;
        for(int i=k; i<nums.length; i++){
            sum += nums[i] - nums[start++];
            if(sum > maxSub){
                maxSub = sum;
            }
        }
        return maxSub;
    }
}
