package _01_Array.Easy._217_ContainsDuplicate;

import java.util.Arrays;
// TC: O(nlogn)
// SC: O(1)
public class ContainsDuplicate {
    public class Solution {
        public boolean containsDuplicate(int[] nums) {
            Arrays.sort(nums);
            for (int i = 0; i < nums.length - 1; ++i) {
                if (nums[i] == nums[i + 1]) return true;
            }
            return false;
        }
    }
}
