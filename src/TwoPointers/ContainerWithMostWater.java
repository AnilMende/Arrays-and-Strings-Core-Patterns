package TwoPointers;

public class ContainerWithMostWater {
    public static void main(String[] args) {
        int nums[] = {1,8,6,2,5,4,8,3,7};

        System.out.println("Maximum Area is "+ maxArea(nums));
    }

    static int maxArea(int nums[]){

        int i = 0;
        int j = nums.length - 1;

        int maxArea = 0;

        while(i < j){
            int width = j - i;
            //height is the min value of nums[i] and nums[j]
            //because water overflows from the less height block
            //so we can only get area that is equal to min value of block
            int height = Math.min(nums[i], nums[j]);

            int Area = height * width;
            //Our goal is to find MaxArea so we have to move to the high value side
            //high line sides , because if both are higher lines they cover maximum area between them
            if(nums[i] < nums[j]){
                i++;
            }
            else{
                j--;
            }

            maxArea = Math.max(maxArea, Area);
        }

        return maxArea;
    }
}
