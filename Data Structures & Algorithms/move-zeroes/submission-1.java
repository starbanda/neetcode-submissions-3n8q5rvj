class Solution {
    public void moveZeroes(int[] nums) {
        int i=0;
        int p=0;
        int l = nums.length;
        while (i<l){
            if (nums[i] !=0){
                nums[p++] =nums[i] ;
            }
            i++;

        }
           while (p<l){
            nums[p++] =0;
           }
        }

    
}