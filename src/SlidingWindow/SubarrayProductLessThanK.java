package SlidingWindow;

public class SubarrayProductLessThanK {

    public static void main(String[] args) {

        int nums[] = {10,5,2,6};
        int K = 100;

        System.out.println("No of Subarrays of Product less than K are " + noOfSubarrays(nums, K));
    }

    static int noOfSubarrays(int nums[], int K){

        int product = 1;
        int count = 0;

        int left = 0;
        for(int right = 0;right < nums.length;right++){
            product *= nums[right];

            while(left <= right && product >= K){
                product = product / nums[left];
                left++;
            }

            count += right - left + 1;
        }

        return count;
    }
}
