import java.util.*;
public class TwoSum {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        int n = input.nextInt();
        int[] nums = new int[n];
        for(int i=0; i<nums.length; i++){
            nums[i] = input.nextInt();
        }
        int target = input.nextInt();
        System.out.println(Arrays.toString(twoSum(nums, target)));
    }
    static int[] twoSum(int[] nums,int target){
        if(nums.length <= 1){
            return new int[]{-1,-1};
        }
        HashMap<Integer,Integer> hm = new HashMap<>();
        int i = 0;
        while(i < nums.length){
            int reqNum = target - nums[i];
            if(hm.containsKey(reqNum)){
                return new int[]{hm.get(reqNum),i};
            }
            hm.put(nums[i],i);
            i++;
        }
        return new int[]{-1,-1};

    }

}
