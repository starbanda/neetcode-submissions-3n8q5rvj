class Solution {
    public int numRescueBoats(int[] arr, int limit) {
        int start = 0;
        int end = arr.length-1;
        int count =0;
        Arrays.sort(arr);
      while (start<=end){
        if (arr[start] + arr[end] <= limit){
            start++;
        }
        end--;
        count ++;
      }
      return count ;
    }
}