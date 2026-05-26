import java.util.*;
public class MajorityElement {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        int n = input.nextInt();
        int[] nums = new int[n];
        for(int i=0; i<nums.length; i++){
            nums[i] = input.nextInt();
        }
        System.out.println(majorityElement(nums));
        
    }
    static int majorityElement(int[] nums){
        int cand = 0;
        int count = 0;
        for(int i=0; i<nums.length; i++){
            if(count == 0){
                cand = nums[i];
            }
            if(cand == nums[i]){
                count++;
            }else{
                count--;
            }
        }
        int freq = 0;
        for(int i=0; i<nums.length; i++){
            if(cand == nums[i]){
                freq++;
            }
        }
        if(freq > nums.length/2){
            return cand;
        }else{
            return -1;
        }
    }
}
