
class Solution {
    public int[] nextGreaterElement(int[] nums1, int[] nums2) {
        int[] ans  =  new int [nums1.length];
        int j=0;
        for (int i: nums1){
         
int s = -1;
for (int k = 0; k < nums2.length; k++) {
    if (nums2[k] == i) {
        s = k;
        break;
    }
}
       
int next = -1;
            for (int k = s + 1; k < nums2.length; k++) { // <-- start at s+1, increment k
                if (nums2[k] > i) {                      // <-- use '>' not &gt;
                    next = nums2[k];                     // <-- assign the greater value itself
                    break;
                }
            }

            ans[j] = next;
            j++; // <-- increment j once per outer iteration


        }
                return ans;
    }
}