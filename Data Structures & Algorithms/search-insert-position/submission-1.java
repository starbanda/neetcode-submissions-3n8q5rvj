class Solution {
    public int searchInsert(int[] nums, int target) {
    int l = nums.length;
     int start =0;
     int end = l-1;
     int ans =0;
    while (start<=end){
        int mid = start+(end-start)/2;
        if (nums[mid] <target){
            start = mid +1;
            ans = start;
        }
        else if (target < nums[mid] ){
         end  = mid-1;

       }
       else {
        return mid;
       }


    }
    return ans  ;

    }
    }
