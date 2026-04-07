package SlidingWindow;

import java.util.HashSet;

public class ContainsDuplicate2 {
    public static void main(String[] args) {

        int nums[] = {1,2,3,1};
        int k = 3;

        System.out.println(containsNearbyDuplicate(nums, k));
    }

    //we have to return true if there are two indices i and j
    //in the array such that nums[i] and nums[j] and Math.abs(i-j) <= k
    //otherwise return false
    static boolean containsNearbyDuplicate(int nums[],int k){

        HashSet<Integer> set = new HashSet<>();

        int i = 0;
        for(int j = 0;j < nums.length;j++){

            if(j - i > k){
                set.remove(nums[i]);
                i++;
            }

            if(set.contains(nums[j])){
                return true;
            }
            set.add(nums[j]);
        }

        return false;
    }
}
