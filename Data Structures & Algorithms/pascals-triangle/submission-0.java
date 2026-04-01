class Solution {
    public List<List<Integer>> generate(int n) {
        List<List<Integer>> res = new ArrayList<>();
         for (int i=0;i<n;i++){
            List<Integer> list = new ArrayList<>();
            list.add(1);
            int val =1;
            for (int j=1;j<=i;j++){
            val = val *(i-j+1)/j;
            list.add(val);
         }
         res.add(list);
         }
         return res;
    }
}