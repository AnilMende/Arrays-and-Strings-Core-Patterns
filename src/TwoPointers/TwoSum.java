package TwoPointers;

import java.util.Arrays;

public class TwoSum {
    public static void main(String[] args) {
        int nums[] = {2,7,11,15};
        int target = 9;

        int res[] = twoSumForSortedArray(nums,target);

        System.out.println("First Index is "+ res[0]);
        System.out.println("Second Index is "+ res[1]);

    }

    static int[] twoSumForSortedArray(int nums[], int target){

        int i = 0;
        int j = nums.length - 1;

        while(i < j){
            int sum = nums[i] + nums[j];
            if(sum > target){
                j--;
            }
            else if(sum < target){
                i++;
            }
            else{
                return new int[]{i, j};
            }
        }

        return new int[]{-1,-1};
    }
}
