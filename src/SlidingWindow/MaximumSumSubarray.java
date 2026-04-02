package SlidingWindow;

public class MaximumSumSubarray {

    public static void main(String[] args) {
        int nums[] = {-2,1,-3,4,-1,2,1,-5,4};

        System.out.println("Maximum sum of subarray is " + maxSum(nums));
    }

    static int maxSum(int nums[]){

        int sum = 0;
        //resetting the maxsum to Integer min value, because we need to return the smallest negative value in array
        //if the all values in the array are negative, which is the maxsum for the entire array
        //or maxSum = nums[0]
        int maxsum = Integer.MIN_VALUE;

        for(int i=0;i < nums.length;i++){

            sum += nums[i];

            maxsum = Math.max(sum, maxsum);

            if(sum < 0){
                sum = 0;
            }

        }

        return maxsum;
    }
}
