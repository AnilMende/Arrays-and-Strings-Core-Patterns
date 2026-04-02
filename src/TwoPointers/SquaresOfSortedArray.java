package TwoPointers;

public class SquaresOfSortedArray {
    public static void main(String[] args) {
        int nums[] = {-4,-1,0,3,10};

        int res[] = squaresofArray(nums);

        for(int i=0;i < res.length;i++){
            System.out.println(res[i]);
        }

    }

    //Here the array is sorted , Obviously we can use two pointer approach
    //for placing the squares of values at their positions we have to comapre the
    //nums[end] and nums[start] according to that decrement end and increment start
    //Array is sorted it would be ideal if we start iterating from the last index
    //helpful in comparing the end and start and placing at index i in the result array
    static int[] squaresofArray(int nums[]){

        int squares[] = new int[nums.length];

        int start = 0;
        int end = nums.length - 1;

        for(int i=nums.length - 1;i >= 0;i--){
            if(Math.abs(nums[start]) > Math.abs(nums[end])){
                squares[i] = nums[start] * nums[start];
                start++;
            }
            else{
                squares[i] = nums[end] * nums[end];
                end--;
            }
        }

        return squares;
    }
}
