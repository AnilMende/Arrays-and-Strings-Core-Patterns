package SlidingWindow;

public class MinimumSizeSubarraySum {
    public static void main(String[] args) {
        int nums[] = {2,1,5,1,5,3};
        int target = 10;

        System.out.println("Minimum Size Subarray Sum " + minLength(nums, target));
    }

    static int minLength(int nums[], int target){

        int minlength = Integer.MAX_VALUE;

        int left = 0;
        int sum = 0;

        for(int right = 0;right < nums.length;right++){

            sum += nums[right];
            //subarray whose sum is greater than or equal to target is the valid subarray
            //so calculate length
            while(sum >= target){
                minlength = Math.min(minlength, right - left + 1);
                sum -= nums[left];
                left++;
            }
        }
        return minlength == Integer.MAX_VALUE ? 0 : minlength;
    }
}
