class Solution {
    public boolean check(int[] nums) {
        int  n = nums.length;
        int  unsorted = 0;

        for(int  i = 1; i <= n; i++) {
            if(nums[i % n] < nums[i - 1]) {
                unsorted++;
            }
        }

        return unsorted < 2;

    }
}