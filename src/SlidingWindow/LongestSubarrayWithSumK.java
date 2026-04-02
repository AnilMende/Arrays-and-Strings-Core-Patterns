package SlidingWindow;

public class LongestSubarrayWithSumK {
    public static void main(String[] args) {
        int nums[] = {10,5,2,7,1,-10};
        int K = 15;

        System.out.println("Longest Subarray Length " + maxLength(nums, K));
    }

    static int maxLength(int nums[], int K){

        int i = 0;
        long sum = 0;
        int maxLength = 0;

        for(int j = 0;j < nums.length;j++){
            sum += nums[j];

           // if the sum exceeds K, you might need to remove multiple elements
            // from the left to get the sum back down, not just one
            //to repeat the continous checks we are using the while loop
            while(i <= j && sum > K){
                sum -= nums[i];
                i++;
            }

            if(sum == K){
                maxLength = Math.max(maxLength, j-i+1);
            }

        }

        return maxLength;
    }
}
