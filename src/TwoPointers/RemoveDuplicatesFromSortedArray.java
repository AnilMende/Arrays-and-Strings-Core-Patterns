package TwoPointers;

public class RemoveDuplicatesFromSortedArray {
    public static void main(String[] args) {
        int nums[] ={1,2,2,3,3,3,4};
        System.out.println("Number of Distinct Elements " + removeDuplicates(nums));
    }

    static int removeDuplicates(int nums[]){

        int j = 0;
        //if nums[i] != nums[j] then both are distinct
        //we know j is at the start of the array and i is moving
        //so make the nums[j+1] as nums[i] and move j
        //if the nums[j] is equal to nums[i] we only move i to right

        for(int i=1;i < nums.length;i++){
            if(nums[i] != nums[j]){
                nums[j+1] = nums[i];
                j++;
            }
        }

//        while (i < nums.length){
//            if(nums[i] == nums[j]){
//                i++;
//            }
//            else{
//                nums[j+1] = nums[i];
//                i++;
//                j++;
//            }
//        }

        return j+1;
    }
}
