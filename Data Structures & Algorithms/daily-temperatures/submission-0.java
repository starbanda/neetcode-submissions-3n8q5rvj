class Solution {
    public int[] dailyTemperatures(int[] temp) {
      int [] ans = new int [temp.length];
      int i =0;
      while (i<temp.length){
        int count =0;
        for (int j=i;j<temp.length;j++){
            if (temp[j] > temp[i]){
                ans[i]= count;
                break;
            }
            else {
                ans[i]=0;
            }
            count++;

        }
        i++;
      }
      return ans;

    }
}