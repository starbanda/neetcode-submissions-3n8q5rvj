class Solution {
    public void merge(int[] nums1, int m, int[] nums2, int n) {
        int [] ans = new int [n+m];
        for (int i=0;i<n;i++){
            ans[i] = nums2[i];
        }
        for (int i=0;i<m;i++){
            ans[i+n] = nums1[i];
        }
        
        for (int i=0;i<ans.length;i++){
            nums1[i] =ans[i];
        }
        Arrays.sort(nums1);
        
    }
}