package TwoPointers;

public class SortArrayByParity {
    public static void main(String[] args) {
        int nums[] = {3,1,2,4};

        int res[] = parityArray(nums);

        for(int i = 0;i < res.length;i++){
            System.out.print(res[i]+ " ");
        }
    }

    //even numbers should be at the begining of the array
    ///odd numbers should be at the end of the array

    static int[] parityArray(int nums[]){

        int i = 0;
        int j = nums.length - 1;

        //number => nums[i] is even move i that is increment it by 1
        //number => nums[i] is odd swap the nums[j] and nums[i], decrement j by 1 because one of the odd num
        //is at it's correct place
        while(i < j){
            if(nums[i] % 2 == 0){
                i++;
            }
            else{
                int temp = nums[i];
                nums[i] = nums[j];
                nums[j] = temp;
                j--;
            }
        }

        return nums;
    }
}
