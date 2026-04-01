class Solution {
    public boolean hasDuplicate(int[] nums) {
      HashSet<Integer> set = new HashSet<>();
      for (int i=0;i<nums.length && i+1< nums.length;i++){
         set.add(nums[i]);
         if (set.contains(nums[i+1])){
            return true;
         }
      }
       return false;
    }
}