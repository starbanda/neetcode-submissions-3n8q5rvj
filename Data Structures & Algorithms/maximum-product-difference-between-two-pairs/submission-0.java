class Solution {
    public int maxProductDifference(int[] nums) {
        Arrays.sort(nums);
        int l =nums.length;
        int ans = nums[l-1] *nums[l-2] - nums[0]* nums[1];
        return ans ;
    }
}